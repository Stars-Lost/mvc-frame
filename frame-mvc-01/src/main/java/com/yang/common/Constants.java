package com.yang.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author LXY
 * @version 1.0
 * @description: 常用的枚举值
 * @date 2024/2/2 12:03
 */
public class Constants {

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public enum ResponseCode{
        /**
         * 成功
         */
        SUCCESS("0000","成功"),
        /**
         * 未知错误
         */
        UN_ERROR("0001","未知错误"),
        /**
         * 非法参数
         */
        ILLEGAL_PARAMETER("0002","非法参数"),
        /**
         * 主键冲突
         */
        INDEX_DUP("0003","主键冲突");

        private String code;
        private String info;
    }
}
