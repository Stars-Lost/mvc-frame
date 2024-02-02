package com.yang.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author LXY
 * @version 1.0
 * @description: 数据库User对象
 * @date 2024/1/30 17:14
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    /** 用户ID */
    private Long id;
    /** 用户名称 */
    private String userId;
    /** 用户昵称 */
    private String userNickname;
    /** 用户头像 */
    private String userHead;
    /** 账号密码 */
    private String userPassword;
    /** 创建时间 */
    private Date createTime;
    /** 修改时间 */
    private Date updateTime;

}
