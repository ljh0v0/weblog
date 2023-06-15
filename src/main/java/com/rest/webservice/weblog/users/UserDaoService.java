package com.rest.webservice.weblog.users;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;

    static {
        users.add(new User(++userCount, "Eve", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount, "Villanelle", LocalDate.now().minusYears(25)));
        users.add(new User(++userCount, "Kate", LocalDate.now().minusYears(13)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id){
        Predicate<User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(++userCount);
        users.add(user);
        return user;
    }

    public void deleteById(int id){
        Predicate<User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
