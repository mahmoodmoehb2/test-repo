package net.explorviz.controller;

import net.explorviz.service.UserService;
import net.explorviz.model.User;

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User handleRequest(Long id) {
        return userService.findUser(id);
    }
}
