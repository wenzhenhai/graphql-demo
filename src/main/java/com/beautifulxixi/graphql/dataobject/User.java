package com.beautifulxixi.graphql.dataobject;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_graphql_user")
public class User {

    @Id
    @GeneratedValue(generator = "user_id_generator", strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Short age;
    private Short sex;

}
