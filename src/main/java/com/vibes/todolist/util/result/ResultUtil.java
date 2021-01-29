package com.vibes.todolist.util.result;

public class ResultUtil {

    public static <T> Result<T> success() {
        Result<T> result = new Result<T>();
        result.setCodeMsg(ResultCodeAndMsg.OK);
        result.setData(null);
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<T>();
        result.setCodeMsg(ResultCodeAndMsg.OK);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> success(ResultCodeAndMsg cm) {
        Result<T> result = new Result<T>();
        result.setCodeMsg(cm);
        return result;
    }

    public static <T> Result<T> success(ResultCodeAndMsg cm, T data) {
        Result<T> result = new Result<T>();
        result.setCodeMsg(cm);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> error(ResultCodeAndMsg cm, T data) {
        Result<T> result = new Result<T>();
        result.setCodeMsg(cm);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> error(ResultCodeAndMsg cm) {
        Result<T> result = new Result<T>();
        result.setCodeMsg(cm);
        result.setData(null);
        return result;
    }

    public static <T> Result<T> error(String msg) {
        Result<T> result = new Result<T>();
        result.setCode("0");
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}
