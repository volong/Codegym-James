package com.codegym.Dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>users;
    static {
        users = new ArrayList<>();
        User u1 =  new User();
        u1.setAge(18);
        u1.setName("Long");
        u1.setEmail("volong0505@gmail.com");
        u1.setAccount("admin");
        u1.setPassword("admin");
        users.add(u1);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("Bill");
        u2.setAccount("admin1");
        u2.setEmail("bill@codegym.vn");
        u2.setPassword("admin1");
        users.add(u2);
    }

    public static User checkLogin(Login login){
        for (User u: users) {
            if(u.getAccount().equals(login.getAccount())
                && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
