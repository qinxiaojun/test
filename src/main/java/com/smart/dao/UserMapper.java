package com.smart.dao;

import com.smart.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author mioto-qinxj
 * @date 2019/10/28
 */
@Repository
@Mapper
public interface UserMapper {
    @Select("select count(0) from t_user where user_name = #{username} and password = #{password}")
    boolean hasMatchUser(@Param("username") String username, @Param("password")  String password);
}
