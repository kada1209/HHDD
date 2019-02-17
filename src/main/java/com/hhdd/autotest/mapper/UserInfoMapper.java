package com.hhdd.autotest.mapper;

import com.hhdd.autotest.entry.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> getAllUser(@Param("id")int id);
}