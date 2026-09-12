package net.explorviz.service.impl;

import net.explorviz.service.UserService;
import net.explorviz.repository.UserRepository;
import net.explorviz.model.User;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUser(Long id) {
        User user = userRepository.findById(id);
        return saveUser(user);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
