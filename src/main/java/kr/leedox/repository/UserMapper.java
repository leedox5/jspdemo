package kr.leedox.repository;

import kr.leedox.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDTO> getUserList();
}
