package com.beautifulxixi.graphql.repo;

import com.beautifulxixi.graphql.dataobject.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findUserById(Long id);

}
