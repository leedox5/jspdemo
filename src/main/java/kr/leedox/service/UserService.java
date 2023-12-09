package kr.leedox.service;

import kr.leedox.dto.UserDTO;
import kr.leedox.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<UserDTO> getUserList() {
        return userMapper.getUserList();
    }
}
