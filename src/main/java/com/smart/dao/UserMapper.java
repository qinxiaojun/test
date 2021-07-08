package com.smart.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author mioto-qinxj
 * @date 2019/10/28
 */
@Repository
@Mapper
public interface UserMapper {
    boolean hasMatchUser(@Param("username") String username, @Param("password")  String password);
}
