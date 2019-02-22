package com.github.shixinke.practise.sentinel.controller;

import com.github.shixinke.practise.common.annotation.NameStyle;
import com.github.shixinke.practise.common.annotation.RequestContentType;
import com.github.shixinke.practise.common.annotation.RequestParameter;
import com.github.shixinke.practise.common.common.ResponseDTO;
import com.github.shixinke.practise.sentinel.request.CouponSearchDTO;
import com.github.shixinke.practise.sentinel.service.CouponService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shixinke
 * @version 1.0
 * @Description 优惠券
 * @Date 19-2-22 下午2:05
 */
@RestController
@RequestMapping("/coupon")
@Slf4j
public class CouponController {

    @Resource
    private CouponService couponService;

    @RequestMapping("/list")
    public ResponseDTO list(@RequestParameter(source = NameStyle.UNDERLINE, type = RequestContentType.AUTO) CouponSearchDTO searchDTO) {
        try {
            log.info("searchDTO:{}", searchDTO);
            return couponService.search(searchDTO);
        } catch (Exception ex) {
            log.error("查询失败:", ex);
            return ResponseDTO.error();
        }
    }
}
