package PracticeSet.atlaslearnings.day37Test.Main;
import java.util.Date;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        user.setRegistrationDate(new Date());
        return userRepository.save(user);   //.save(user);
    }
}
