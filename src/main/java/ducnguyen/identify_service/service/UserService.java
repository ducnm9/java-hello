package ducnguyen.identify_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ducnguyen.identify_service.dto.request.UserCreationRequest;
import ducnguyen.identify_service.dto.request.UserUpdateRequest;
import ducnguyen.identify_service.entity.User;
import ducnguyen.identify_service.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createRequest(UserCreationRequest request) {
        User user = new User();

        if (userRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("Username already exists");
        }

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDateOfBirth(request.getDateOfBirth());

        return userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));   
    }

    public User updateUser(String userId, UserUpdateRequest request) {
        User user = this.getUserById(userId);

        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDateOfBirth(request.getDateOfBirth());

        return userRepository.save(user);
    }

    public void deleteUserById(String userId) {
        userRepository.deleteById(userId);
    }
}
