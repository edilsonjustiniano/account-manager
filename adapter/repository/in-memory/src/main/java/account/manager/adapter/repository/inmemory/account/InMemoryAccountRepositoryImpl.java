package account.manager.adapter.repository.inmemory.account;

import account.managemer.module.core.entities.Account;
import account.manager.core.usecases.ports.account.AccountRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryAccountRepositoryImpl implements AccountRepository {

    Map<String, Account> db = new ConcurrentHashMap<>();

    @Override
    public Account save(Account account) {
        db.put(account.getId(), account);
        return account;
    }

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(db.values());
    }

    @Override
    public Optional<Account> findById(String id) {
        return db.values().stream().filter(account -> id.equals(account.getId())).findFirst();
    }
}
