package com.hhdd.autotest.mapper;

import com.hhdd.autotest.entry.UserRedPackets;

public interface UserRedPacketsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRedPackets record);

    int insertSelective(UserRedPackets record);

    UserRedPackets selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRedPackets record);

    int updateByPrimaryKey(UserRedPackets record);
}