package top.byteinfo.integritycheck.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.byteinfo.integritycheck.entity.User;
import top.byteinfo.integritycheck.mapper.first.UserMapper;

import java.util.List;

/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author: willzhao E-mail: zq2599@gmail.com
 * @date: 2020/8/4 8:31
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User insertWithFields(User user) {
        userMapper.insertWithFields(user);
        return user;
    }

    public List<User> findByName(String name) {
        return userMapper.findByName(name);
    }

    public int delete(int id) {
        return userMapper.delete(id);
    }

}
