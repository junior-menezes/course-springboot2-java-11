package online.diagnosticit.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import online.diagnosticit.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
