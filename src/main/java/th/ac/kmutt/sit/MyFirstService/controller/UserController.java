package th.ac.kmutt.sit.MyFirstService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
    User[] user = new User[5];
    @GetMapping("/user/users")
    public User[] getUser(){
        user[0]=new User(1,"Annio");
        user[1]=new User(2,"Bver");
        user[2]=new User(3,"Itim");
        user[3]=new User(4,"YOYO");
        user[4]=new User(5,"Zuba");
        return user;
    }

    @GetMapping("/user/1")
    public User getUser1(){
        user[0]=new User(1,"Annio");
        return user[0];
    }
    @GetMapping("/user/2")
    public User getUser2(){
        user[1]=new User(2,"Bver");
        return user[1];
    }
    @GetMapping("/user/3")
    public User getUser3(){
        user[2]=new User(3,"Itim");
        return user[2];
    }
    @GetMapping("/user/4")
    public User getUser4(){
        user[3]=new User(4,"YOYO");
        return user[3];
    }
    @GetMapping("/user/5")
    public User getUser5(){
        user[4]=new User(5,"Zuba");
        return user[4];
    }
}