package com.yang.dao;

import com.yang.domain.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author LXY
 * @version 1.0
 * @description: User的DAO操作
 * @date 2024/1/30 17:28
 */
@Mapper
public interface IUserDao {

    /**
    * @description 查询用户
    * @param
    * @return java.util.List<com.yang.domain.po.User>
    * @date 2024/2/2 12:29:12
    */
    List<User> queryUserList();

}
