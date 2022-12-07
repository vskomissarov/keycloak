package ru.filit.keycloak.service;

import lombok.RequiredArgsConstructor;
import org.keycloak.common.util.CollectionUtil;
import org.springframework.stereotype.Service;
import ru.filit.keycloak.domain.User;
import ru.filit.keycloak.repo.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll() {
        List<User> all = userRepository.findAll();
        return CollectionUtil.isEmpty(all) ? all : addUsers();
    }

    private List<User> addUsers() {
        User user1 = new User();
        user1.setAddress("1111 foo blvd");
        user1.setName("Foo Industries");
        user1.setServiceRendered("Important services");

        User user2 = new User();
        user2.setAddress("2222 bar street");
        user2.setName("Bar LLP");
        user2.setServiceRendered("Important services");

        User user3 = new User();
        user3.setAddress("33 main street");
        user3.setName("Big LLC");
        user3.setServiceRendered("Important services");

        return userRepository.saveAll(List.of(user1, user2, user3));
    }
}
