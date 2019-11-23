package com.example.cassandraplaywithspring;

import com.example.cassandraplaywithspring.model.PersonalInfo;
import com.example.cassandraplaywithspring.model.User;
import com.example.cassandraplaywithspring.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SpringCassandraTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void cassandraのRepositoryを使えること() {
        PersonalInfo personalInfo = new PersonalInfo(LocalDate.now(), "日本", 50, 170);
        Map<Integer, String> teams = Map.of(1, "チーム1", 2, "チーム2");
        User user = new User(UUID.randomUUID(), "John Doe", 9999, personalInfo, teams);
        userRepository.insert(user);
    }
}
