package byteinfo.top.druidtwosource.service;

import byteinfo.top.druidtwosource.entity.Address;
import byteinfo.top.druidtwosource.mapper.second.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressMapper addressMapper;

    public Address insertWithFields(Address address){
        int i = addressMapper.insertWithFields(address);
        System.out.println(i);
        return address;
    }

    public List<Address> findByCityName(String cityName){
        return addressMapper.findByCityName(cityName);
    }

    public int delete(int id){
        return addressMapper.delete(id);
    }

}
