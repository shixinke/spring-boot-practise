package com.github.shixinke.practise.sentinel.response;

import lombok.Data;

import java.time.LocalDateTime;


/**
 * @author shixinke
 * @version 1.0
 * @Description
 * @Date 19-2-22 下午5:08
 */
@Data
public class CouponItem {
    private Long couponId;
    private String couponCode;
    private String couponName;
    private Double worth;
    private Integer status;
    private LocalDateTime effectiveTime;
    private LocalDateTime expireTime;
}
