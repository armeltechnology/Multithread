package ng.javaarmel.thread.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ng.javaarmel.thread.api.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
