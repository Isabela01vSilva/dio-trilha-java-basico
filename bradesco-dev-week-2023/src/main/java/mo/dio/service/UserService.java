package mo.dio.service;

import mo.dio.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}
