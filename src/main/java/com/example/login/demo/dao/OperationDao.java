package com.example.login.demo.dao;

import com.example.login.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Author: zhouFaQuan
 * Date: 2019/11/7 11:49
 */
@Repository
public interface OperationDao {
  int  addUser(@Param("telephone") String telephone, @Param("password") String password, @Param("token") String token) ;


  User getUserById(@Param("id") int id);

  int updateUser(@Param("id") int id,@Param("telephone") String telephone,@Param("password") String password);

  int deleteUserById(@Param("id") int id);
}
