package ducnguyen.identify_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import ducnguyen.identify_service.dto.request.ApiResponse;
import ducnguyen.identify_service.dto.request.UserCreationRequest;
import ducnguyen.identify_service.dto.request.UserUpdateRequest;
import ducnguyen.identify_service.dto.response.UserResponse;
import ducnguyen.identify_service.entity.User;
import ducnguyen.identify_service.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class UserController {
    UserService userService;

    @PostMapping
    public ApiResponse<User> postUser(@RequestBody @Valid UserCreationRequest request) {
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.createRequest(request));
        return apiResponse;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }
    
    @GetMapping("/{userId}")
    public UserResponse getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @PutMapping("/{userId}")
    public UserResponse putUser(@PathVariable String userId, @RequestBody UserUpdateRequest entity) {
        return userService.updateUser(userId, entity);
    }

    @DeleteMapping("/{userId}")
    public String deleteUserById(@PathVariable String userId) {
        userService.deleteUserById(userId);
        return "User deleted successfully";
    }
    
}
