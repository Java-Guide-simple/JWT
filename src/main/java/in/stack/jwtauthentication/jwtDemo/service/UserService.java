package in.stack.jwtauthentication.jwtDemo.service;

import in.stack.jwtauthentication.jwtDemo.model.Account;
import in.stack.jwtauthentication.jwtDemo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private AccountRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Account acc = repo.findByUserName(username);
        return new User(acc.getUserName(), acc.getPassword(),new ArrayList<>());
    }
}
