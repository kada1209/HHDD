package com.hhdd.autotest.service.impl;

import com.hhdd.autotest.entry.UserInfo;
import com.hhdd.autotest.mapper.UserInfoMapper;
import com.hhdd.autotest.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/1/12.
 */
@Service
public class UserInfoServicesImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> allUserNum(int id) {
        List<UserInfo> user= userInfoMapper.getAllUser(id);
        return user;
    }
}



