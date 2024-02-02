package com.yang.service.impl;

import com.yang.dao.IUserDao;
import com.yang.domain.po.User;
import com.yang.domain.vo.UserVo;
import com.yang.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LXY
 * @version 1.0
 * @description: TODO
 * @date 2024/2/2 12:30
 */
@Service
public class UserServiceImpl implements IUserService {


    @Autowired
    private IUserDao userDao;
    /**
    * @description 查询User
    * @param
    * @return java.util.List<com.yang.domain.vo.UserVo>
    * @date 2024/2/2 12:35:06
    */
    @Override
    public List<UserVo> queryUserList() {
        ArrayList<UserVo> userVos = new ArrayList<>();
        List<User> users = userDao.queryUserList();
        for (User user:users) {
            UserVo userVo = new UserVo();
            userVo.setUserId(user.getUserId());
            userVo.setUserNickname(user.getUserNickname());
            userVo.setCreateTime(user.getCreateTime());

            userVos.add(userVo);
        }

        return userVos;
    }
}
