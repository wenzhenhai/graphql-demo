package com.beautifulxixi.graphql.service;

import com.beautifulxixi.graphql.dataobject.Blog;
import com.beautifulxixi.graphql.dataobject.User;
import com.beautifulxixi.graphql.enums.SexEnum;
import com.beautifulxixi.graphql.repo.BlogRepo;
import com.beautifulxixi.graphql.repo.UserRepo;
import com.beautifulxixi.graphql.vo.UserVO;
import com.beautifulxixi.graphql.vo.UserVO1;
import com.beautifulxixi.graphql.vo.UserVO2;
import com.beautifulxixi.graphql.vo.UserVOA;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NormalService {

    @Autowired
    UserRepo userRepo;
    @Autowired
    BlogRepo blogRepo;

    public UserVO1 getUser(Long id) {
        User user = userRepo.findUserById(id);
        UserVO1 userVO = new UserVO1();
        BeanUtils.copyProperties(user, userVO);
        return userVO;
    }

    public List<UserVO2> getUsers() {
        List<User> userList = userRepo.findAll();
        List<UserVO2> userVOList = new ArrayList<>();
        userList.forEach(user -> {
            UserVO2 userVO = new UserVO2();
            BeanUtils.copyProperties(user, userVO);
            userVO.setSex(SexEnum.getByCode(user.getSex()));
            userVOList.add(userVO);
        });
        return userVOList;
    }

    public List<UserVO> getUsers1() {
        List<User> userList = userRepo.findAll();
        List<UserVO> userVOList = new ArrayList<>();
        userList.forEach(user -> {
            UserVO userVO;
            if(userList.indexOf(user)%2 == 0) {
                userVO = new UserVO1();
            } else {
                userVO = new UserVO2();
            }
            BeanUtils.copyProperties(user, userVO);
            if(userVO instanceof UserVO2)
                ((UserVO2) userVO).setSex(SexEnum.getByCode(user.getSex()));
            userVOList.add(userVO);
        });
        return userVOList;
    }

    public List<UserVO> getUsers2() {
        return this.getUsers1();
    }

    public Blog getHottestBlog() {
        Sort sort = new Sort(Sort.Direction.DESC, "comment");
        List<Blog> blogList = blogRepo.findAll(sort);
        return blogList.get(0);
    }

    public Long addUser(UserVOA userVO) {
        User user = new User();
        BeanUtils.copyProperties(userVO, user);
        return userRepo.save(user).getId();
    }

    public Boolean modifyUser(Long id, String name, Short age, SexEnum sex) {
        User user = userRepo.findUserById(id);
        user.setName(name);
        if(age != null) user.setAge(age);
        if(sex != null) user.setSex((short) sex.getCode());
        userRepo.save(user);
        return true;
    }

    public Boolean deleteUser(Long id) {
        userRepo.deleteById(id);
        return true;
    }


}
