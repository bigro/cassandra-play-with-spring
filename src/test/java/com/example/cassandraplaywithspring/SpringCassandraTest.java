package com.example.cassandraplaywithspring;

import com.example.cassandraplaywithspring.model.User;
import com.example.cassandraplaywithspring.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.UUID;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SpringCassandraTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void cassandraのRepositoryを使えること() {
        User user = new User(UUID.randomUUID(), "John Doe", 9999);
        userRepository.insert(user);
    }
}
