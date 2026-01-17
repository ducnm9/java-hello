package ducnguyen.identify_service.mapper;

import ducnguyen.identify_service.dto.request.UserCreationRequest;
import ducnguyen.identify_service.dto.request.UserUpdateRequest;
import ducnguyen.identify_service.dto.response.UserResponse;
import ducnguyen.identify_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    User toUser(UserCreationRequest request);

    // @Mapping(source = "firstName", target = "lastName")
    // @Mapping(target = "id", ignore = true)
    UserResponse toUserResponse(User user);


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "username", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
 