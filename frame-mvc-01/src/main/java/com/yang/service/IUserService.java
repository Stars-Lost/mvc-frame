package com.yang.service;

import com.yang.domain.po.User;
import com.yang.domain.vo.UserVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LXY
 * @version 1.0
 * @description: TODO
 * @date 2024/2/2 12:28
 */

public interface IUserService {

    List<UserVo> queryUserList();
}
