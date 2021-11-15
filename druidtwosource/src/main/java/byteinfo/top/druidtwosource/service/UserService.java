package byteinfo.top.druidtwosource.service;

import byteinfo.top.druidtwosource.entity.User;
import byteinfo.top.druidtwosource.mapper.first.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User insertWith(User user){
        userMapper.insertWithFields(user);
        return user;
    }

    public List<User> findByName(String name){
        return userMapper.findByName(name);
    }

    public int delete(int id){
        return userMapper.delete(id);
    }
}
