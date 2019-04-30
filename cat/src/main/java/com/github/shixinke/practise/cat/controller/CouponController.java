package com.github.shixinke.practise.cat.controller;

import com.dianping.cat.Cat;
import com.dianping.cat.message.Transaction;
import com.github.shixinke.practise.cat.annotation.CatTrack;
import com.github.shixinke.practise.common.common.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangfangtao
 * @version 1.0
 * @Description
 * @Date 19-2-25 下午1:19
 */

@RestController
@Slf4j
public class CouponController {

    @RequestMapping("/coupon/list")
    //@CatTrack
    public ResponseDTO couponList() {
        Transaction t = Cat.newTransaction("CouponController", "couponList");
        ResponseDTO responseDTO = ResponseDTO.success();
        try {
            t.setStatus(Transaction.SUCCESS);
            throw new Exception("test cat");
        } catch (Exception e) {
            t.setStatus(e);
            Cat.logError(e);
            responseDTO = ResponseDTO.error("test cat exception");
        } finally {
            t.complete();
        }
        return responseDTO;
    }

    @RequestMapping("/detail")
    //@CatTrack
    public ResponseDTO couponDetail(@RequestParam("coupon_id") Long couponId) {
        ResponseDTO responseDTO = ResponseDTO.success();
        return responseDTO;
    }
}
