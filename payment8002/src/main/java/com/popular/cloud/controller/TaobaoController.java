package com.popular.cloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 速卖通类目表 前端控制器
 * </p>
 *
 * @author liuhang
 * @since 2020-07-08
 */
@RestController
@Api(value="/taobao",tags = "淘宝")
@RequestMapping("/taobao")
public class TaobaoController {

    @GetMapping("/{id}")
    @ApiOperation(value ="查询详情", notes = "查询详情")
    public String get(@ApiParam(name = "id", value = "ID", required = true) @PathVariable Integer id){
        return "welove";
    }


}

