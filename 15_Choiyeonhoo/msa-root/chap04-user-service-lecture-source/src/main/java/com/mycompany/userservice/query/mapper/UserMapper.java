package com.mycompany.userservice.query.mapper;

import com.mycompany.userservice.query.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDTO findUserById(Long userId);

    List<UserDTO> findAllUsers();
}
