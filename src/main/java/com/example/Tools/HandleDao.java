package com.example.Tools;

import com.example.Model.User;
import com.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by byhieg on 16-8-17.
 */
public class HandleDao {

    @Autowired
    private static UserRepository userRepository;

    public static User matchUser(@NotNull  String name, @NotNull  String password) {
        List<User> userList = userRepository.findAll();
        for(User item:userList) {
            System.out.println(item.getName() + "  " + item.getPassword());
            if(name.equals(item.getName())){
                if(password.equals(item.getPassword())){
                    return item;
                }

            }
        }

        return null;
    }
}
