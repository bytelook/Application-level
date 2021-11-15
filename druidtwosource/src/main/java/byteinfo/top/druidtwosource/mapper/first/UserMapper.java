package byteinfo.top.druidtwosource.mapper.first;

import byteinfo.top.druidtwosource.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    int insertWithFields(User user);

    List<User> findByName(String name);

    int delete(int id);
}
