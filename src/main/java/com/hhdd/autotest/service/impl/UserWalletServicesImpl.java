package com.hhdd.autotest.service.impl;

import com.hhdd.autotest.mapper.UserWalletMapper;
import com.hhdd.autotest.service.UserWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 2019/1/16.
 */
@Service
public class UserWalletServicesImpl implements UserWalletService {
    @Autowired
    UserWalletMapper userWalletMapper;
    @Override
    public Boolean topup(Map map) {
       Boolean aBoolean =  userWalletMapper.topup(map);

       return aBoolean;
    }
}
