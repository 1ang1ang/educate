package com.educate.enums;

/**
 * Created by sun on 2017/3/17.
 */
public enum UserSourceType {
    PHONE(1),
    EMAIL(2),
    ;

    private int type;

    UserSourceType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
