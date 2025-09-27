package day37Test.Main;

public interface UserRepository {
    User findById(Long id);
    User save(User user);
}