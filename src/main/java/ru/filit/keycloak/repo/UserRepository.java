package ru.filit.keycloak.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.filit.keycloak.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
