package account.manager.core.usecases.account;

import account.managemer.module.core.entities.Account;
import account.manager.core.usecases.ports.account.AccountRepository;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class ManageAccount {

    private final AccountRepository repository;

    public Account create(AccountDto dto) {
        var account = Account.builder()
                .id(UUID.randomUUID().toString())
                .name(dto.getName())
                .build();

        return repository.save(account);
    }
}
