package account.manager.core.usecases.account;

import account.managemer.module.core.entities.Account;
import account.manager.core.usecases.ports.account.AccountRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class SearchAccount {

    private final AccountRepository repository;

    public List<Account> search() {
        return repository.findAll();
    }

    public Optional<Account> search(String id) {
        return repository.findById(id);
    }
}
