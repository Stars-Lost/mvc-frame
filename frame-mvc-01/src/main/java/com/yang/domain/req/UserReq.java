package com.yang.domain.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LXY
 * @version 1.0
 * @description: User的请求对象
 * @date 2024/1/30 17:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserReq {

    private String uId;

}

