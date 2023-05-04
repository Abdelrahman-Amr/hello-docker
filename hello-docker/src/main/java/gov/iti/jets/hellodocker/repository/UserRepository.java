package gov.iti.jets.hellodocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gov.iti.jets.hellodocker.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {
}
