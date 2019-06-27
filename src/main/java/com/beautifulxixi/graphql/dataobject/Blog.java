package com.beautifulxixi.graphql.dataobject;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_graphql_blog")
public class Blog {

    @Id
    @GeneratedValue(generator = "blog_id_generator", strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private Long userId;
    private Integer comment;

}
