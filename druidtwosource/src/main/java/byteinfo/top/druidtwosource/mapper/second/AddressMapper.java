package byteinfo.top.druidtwosource.mapper.second;

import byteinfo.top.druidtwosource.entity.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressMapper {
    int insertWithFields(Address addresss);

    List<Address> findByCityName(String cityName);

    int delete(int id);
}
