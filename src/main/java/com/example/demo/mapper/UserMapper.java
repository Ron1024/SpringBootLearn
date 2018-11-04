package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     * 根据用户ID查找用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    User getUserByUserId(@Param("userId")Integer userId);
}
