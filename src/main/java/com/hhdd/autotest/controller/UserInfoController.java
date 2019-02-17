package com.hhdd.autotest.controller;

import com.hhdd.autotest.entry.UserInfo;
import com.hhdd.autotest.service.UserInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/1/12.
 */
@RestController
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;
    @RequestMapping("/user")
    private List<UserInfo> getUser(@RequestParam(name = "id") int id){
        List<UserInfo> user = userInfoService.allUserNum(id);

        return user;
    }
}
