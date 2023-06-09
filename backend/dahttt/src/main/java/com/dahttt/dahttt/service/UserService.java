package com.dahttt.dahttt.service;

import com.dahttt.dahttt.entity.User;
import com.dahttt.dahttt.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService extends TableDBService<User>{
    void save(User user);
    Optional<User> findByPhoneNumber(String phoneNumber);
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);

    void updateResetPasswordToken(String token, String email) throws UserNotFoundException;

    User getByResetPasswordToken(String resetPasswordToken);

    void updatePassword(User user, String newPassword);

}
