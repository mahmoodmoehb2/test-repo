package net.explorviz.repository;

import net.explorviz.model.User;

public class UserRepository {

    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }

    public User save(User user) {
        return user;
    }
}
