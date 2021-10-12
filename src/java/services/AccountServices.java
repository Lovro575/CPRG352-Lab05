package services;

import models.User;


public class AccountServices {
    
    User user;
    
        public User login(String username, String password) {
        if(username.equals("abe") || username.equals("barb")) {
            user = new User(username, null);
            return user;
        } else {
            return null;
        }
    }
}
