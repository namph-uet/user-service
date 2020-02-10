package web.service.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import web.service.user.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
    User findByUserName(String userName);
}