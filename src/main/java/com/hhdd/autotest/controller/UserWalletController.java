package com.hhdd.autotest.controller;

import com.hhdd.autotest.service.UserWalletService;
import com.hhdd.autotest.utils.ResultMessage;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Administrator on 2019/1/16.
 */
@RestController
public class UserWalletController {
    @Autowired
    UserWalletService userWalletService;
    @RequestMapping("/topup")
    private ResultMessage topup(@RequestParam Map<String,Object> map){


        Boolean num = userWalletService.topup(map);
        if (num){
            return ResultMessage.isSuccess();
        }
        return new ResultMessage(400, "操作失败");

    }
}
