package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resources;

/**
 * Created by ${MIND-ZR} on 2017/12/29.
 */


@Mapper
@Repository
public interface UserMapper {
    User selectUserById (int id);

}
