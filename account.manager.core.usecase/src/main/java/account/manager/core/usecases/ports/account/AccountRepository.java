package account.manager.core.usecases.ports.account;

import account.managemer.module.core.entities.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {

    Account save(Account account);

    List<Account> findAll();

    Optional<Account> findById(String id);
}
