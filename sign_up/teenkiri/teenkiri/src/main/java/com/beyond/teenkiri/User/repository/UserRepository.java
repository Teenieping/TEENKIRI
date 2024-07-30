package com.beyond.teenkiri.User.repository;

import com.beyond.teenkiri.User.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUsernameAndPhone(String username, String phone);
    Optional<User> findByUsernameAndPhoneAndEmail(String username, String phone, String email);
    boolean existsByEmail(String email);
    boolean existsByNickname(String nickname);
}