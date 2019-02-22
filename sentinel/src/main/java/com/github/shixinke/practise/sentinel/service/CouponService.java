package com.github.shixinke.practise.sentinel.service;

import com.github.shixinke.practise.common.common.ResponseDTO;
import com.github.shixinke.practise.sentinel.request.CouponSearchDTO;

/**
 * @author shixinke
 * @version 1.0
 * @Description
 * @Date 19-2-22 下午5:06
 */
public interface CouponService {
    /**
     * 查询优惠券列表
     * @param couponSearchDTO
     * @return
     */
    public ResponseDTO search(CouponSearchDTO couponSearchDTO);
}
