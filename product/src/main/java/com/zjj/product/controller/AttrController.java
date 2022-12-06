package com.zjj.product.controller;

import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.product.entity.AttrEntity;
import com.zjj.product.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import static com.zjj.mymallcommon.response.CodeEnum.*;
import java.util.List;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:01
 * @description
 */
@RestController
@RequestMapping("/attr")
@CrossOrigin
public class AttrController {
    @Autowired
    private AttrService attrService;
    @PostMapping("/update")
    public ServerResponse updateAttr(@RequestBody List<AttrEntity> params){
        attrService.updateAttr(params);
        return new ServerResponse(REQUEST_SUCCESS.getCode(), REQUEST_SUCCESS.getMessage());
    }
}
