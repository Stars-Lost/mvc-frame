package com.yang.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LXY
 * @version 1.0
 * @description: TODO
 * @date 2024/2/2 12:11
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result {
    private String code;
    private String msg;

    public static Result buildSuccess(){
        return new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo());
    }

    public static Result buildFail(){
        return new Result(Constants.ResponseCode.UN_ERROR.getCode(), Constants.ResponseCode.UN_ERROR.getInfo());
    }
}
