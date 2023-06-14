package com.rest.webservice.weblog.users;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<Users> users = new ArrayList<>();

    static {
        users.add(new Users(1, "Eve", LocalDate.now().minusYears(30)));
        users.add(new Users(1, "Villanelle,", LocalDate.now().minusYears(25)));
        users.add(new Users(1, "Villanelle,", LocalDate.now().minusYears(25)));
    }

    public List<Users> findAll(){
        return users;
    }
}
