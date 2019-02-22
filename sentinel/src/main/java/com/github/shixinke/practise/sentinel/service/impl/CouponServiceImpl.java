package com.github.shixinke.practise.sentinel.service.impl;

import com.github.shixinke.practise.common.common.PageList;
import com.github.shixinke.practise.common.common.ResponseDTO;
import com.github.shixinke.practise.sentinel.request.CouponSearchDTO;
import com.github.shixinke.practise.sentinel.response.CouponItem;
import com.github.shixinke.practise.sentinel.service.CouponService;
import org.springframework.stereotype.Service;

/**
 * @author shixinke
 * @version 1.0
 * @Description
 * @Date 19-2-22 下午5:13
 */
@Service
public class CouponServiceImpl implements CouponService {

    @Override
    public ResponseDTO search(CouponSearchDTO couponSearchDTO) {
        ResponseDTO<PageList<CouponItem>> responseDTO = ResponseDTO.success();
        PageList<CouponItem> pageList = new PageList<CouponItem>(1, 1, 10);
        responseDTO.setData(pageList);
        return responseDTO;
    }
}
