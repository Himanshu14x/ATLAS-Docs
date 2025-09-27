package PracticeSet.atlaslearnings.day37.day37Test.Main;

public interface UserRepository {
    User findById(Long id);
    User save(User user);
}