package byteinfo.top.druidtwosource.controller;

import byteinfo.top.druidtwosource.entity.Address;
import byteinfo.top.druidtwosource.entity.User;
import byteinfo.top.druidtwosource.service.AddressService;
import byteinfo.top.druidtwosource.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/insertwithfields", method = RequestMethod.PUT)
    public User create_user(@RequestBody User user) {
        return userService.insertWith(user);
    }

    @RequestMapping(value = "/insertwithfields", method = RequestMethod.PUT)
    public Address create_address(@RequestBody Address address) {
        return addressService.insertWithFields(address);
    }


    @RequestMapping(value = "/findbyname/{name}", method = RequestMethod.GET)
    public List<User> findByName(@PathVariable("name") String name) {
        return userService.findByName(name);
    }

    @RequestMapping(value = "/findbycityname/{cityname}", method = RequestMethod.GET)
    public List<Address> findByCityName(@PathVariable("cityname") String cityName) {
        return addressService.findByCityName(cityName);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public int delete_user(@PathVariable int id) {
        return userService.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public int delete_address(@PathVariable int id) {
        return addressService.delete(id);
    }


}
