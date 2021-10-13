package services;

import models.User;


public class AccountServices {
       
        public User login(String username, String password) {
        if(username.equals("abe") || username.equals("barb") && password.equals("password")) {
            User user = new User(username, null);
            return user;
        } else {
            return null;
        }
    }
}
