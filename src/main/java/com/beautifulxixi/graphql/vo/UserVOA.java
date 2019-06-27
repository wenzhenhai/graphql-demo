package com.beautifulxixi.graphql.vo;

import com.beautifulxixi.graphql.enums.SexEnum;
import lombok.Data;

@Data
public class UserVOA extends UserVO {

    private Short age;
    private SexEnum sex;

}
