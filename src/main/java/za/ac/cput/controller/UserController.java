package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.User;
import za.ac.cput.Factory.UserFactory;
import za.ac.cput.Service.UserService;

import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/create", method= RequestMethod.POST)
        public User create(@RequestBody User user){
            User newUser = UserFactory.build(user.getFirstName(),
                    user.getLastName(), user.getEmail(),
                    user.getGenderId(), user.getClassId(),
                    user.getContactNumber());
            return userService.create(newUser);
    }

    @GetMapping("/read{id}")
    public User read(@PathVariable String id){
            return userService.read(id);
    }

    @PostMapping("/update")
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @PostMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return userService.delete(id);
    }

    @GetMapping("/getall")
    public Set<User> getAll(){
        return userService.getAll();
    }
}
