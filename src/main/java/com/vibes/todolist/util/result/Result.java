package com.vibes.todolist.util.result;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String msg;
    private T data;

    public void setCodeMsg(ResultCodeAndMsg arg) {
        this.code = arg.getCode();
        this.msg = arg.getMsg();
    }

}