package net.explorviz.service;

import net.explorviz.repository.UserRepository;
import net.explorviz.model.User;
import net.explorviz.util.DateUtil;

import java.util.Date;

public interface UserService {

    User findUser(Long id);

    default String describeUser(User user) {
        return "User fetched at " + DateUtil.format(new Date());
    }
}
