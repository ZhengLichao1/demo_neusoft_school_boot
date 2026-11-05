package edu.neusoft.school_boot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T data) {//返回有数据的成功方法
        //返回有数据的成功方法，状态码为0，消息为success,数据为data
        return new Result<>(0,"操作成功",data);
    }
    public static <T> Result<T> success() {//返回无数据的成功方法
        //返回无数据的成功方法，状态码为0，消息为success,数据为null
        return new Result<>(0,"操作成功",null);
    }
    public static <T> Result<T> fail(String msg) {//返回失败结果
        //返回失败结果，状态码为1，消息为msg,数据为null
        return new Result<>(1,msg,null);
    }
}
