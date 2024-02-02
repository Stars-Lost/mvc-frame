package com.yang.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author LXY
 * @version 1.0
 * @description: 用户的展示对象
 * @date 2024/2/2 12:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {
    /**
     *
     */
    private String userId;
    private String userNickname;
    private Date createTime;




}
