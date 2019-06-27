package com.beautifulxixi.graphql.repo;

import com.beautifulxixi.graphql.dataobject.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepo extends JpaRepository<Blog, Long> {

    Blog findBlogById(Long id);

    List<Blog> findAllByUserId(Long userId);

}
