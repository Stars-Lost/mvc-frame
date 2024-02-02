package com.yang.domain.res;

import com.yang.common.Result;
import com.yang.domain.vo.UserVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author LXY
 * @version 1.0
 * @description: 用户响应对象
 * @date 2024/2/2 12:25
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRes {

    private Result result;
    private List<UserVo> userVoList;

}
