package com.yang.controller;

import com.yang.common.Result;
import com.yang.domain.res.UserRes;
import com.yang.domain.vo.UserVo;
import com.yang.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LXY
 * @version 1.0
 * @description: TODO
 * @date 2024/2/2 12:35
 */

@Slf4j
@RestController
public class UserController {

    @Autowired
    private IUserService service;

    @GetMapping("queryUserInfo")
    public UserRes queryUserInfo(){
        try {
            log.info("查询用户信息");
            List<UserVo> userVos = service.queryUserList();
            UserRes userRes = new UserRes();
            userRes.setResult(Result.buildSuccess());
            userRes.setUserVoList(userVos);
            return userRes;
        }catch (Exception e){
            log.error("查询失败",e);
            return null;
        }

    }

}
