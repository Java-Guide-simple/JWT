package in.stack.jwtauthentication.jwtDemo.repository;

import in.stack.jwtauthentication.jwtDemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {

    public Account findByUserName(String userName);
}
