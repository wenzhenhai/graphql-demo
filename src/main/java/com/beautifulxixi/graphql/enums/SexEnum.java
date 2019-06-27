package com.beautifulxixi.graphql.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum SexEnum {

    MALE(0),
    FEMALE(1),
        ;

    private int code;

    SexEnum(int code) {
        this.code = code;
    }

    public static SexEnum getByCode(int code) {

        Arrays.asList(SexEnum.values()).forEach(
                e -> {
                    if (e.code == code) System.out.println(e.code);
                }
        );

        for(SexEnum e : SexEnum.values()) {
            if(e.getCode() == code)
                return e;
        }
        return null;
    }

}
