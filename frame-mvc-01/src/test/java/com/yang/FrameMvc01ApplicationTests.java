package com.yang;

import com.yang.domain.vo.UserVo;
import com.yang.service.IUserService;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 *
 */
@SpringBootTest
class FrameMvc01ApplicationTests {


    @Autowired
    private IUserService service;
    @Test
    void contextLoads() {
        List<UserVo> userVos = service.queryUserList();

        System.out.println("userVos = " + userVos.toString());
    }

}
