package com.beautifulxixi.graphql.web;

import com.beautifulxixi.graphql.dataobject.Blog;
import com.beautifulxixi.graphql.service.NormalService;
import com.beautifulxixi.graphql.vo.UserVO1;
import com.beautifulxixi.graphql.vo.UserVO2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusinessController {

    @Autowired
    NormalService normalService;

    @GetMapping("/user/{id}")
    public UserVO1 getUser(@PathVariable Long id) {
        return normalService.getUser(id);
    }

    @GetMapping("/users")
    public List<UserVO2> getUsers() {
        return normalService.getUsers();
    }

    @GetMapping("/blog/hottest")
    public Blog getHottestBlog() {
        return normalService.getHottestBlog();
    }

}
