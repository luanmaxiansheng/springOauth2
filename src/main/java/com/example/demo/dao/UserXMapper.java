package com.example.demo.dao;

import com.example.demo.domain.UserX;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserXMapper {

    UserX selectByUser(String username);
}
