package com.msr.mapper;

import com.msr.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //登录功能
    public User login(User user);
}
