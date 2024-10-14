package ru.gpadev.memoboost.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gpadev.memoboost.store.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByTelegramId(Long telegramId);
}
