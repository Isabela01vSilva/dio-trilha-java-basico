package mo.dio.service.impl;

import mo.dio.domain.model.User;
import mo.dio.domain.repository.UserRepository;
import mo.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
       if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
           throw new IllegalArgumentException("This User ID alredy existis.");
       }
        return null;
    }
}
