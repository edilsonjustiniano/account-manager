package account.manager.adapter.repository.h2.account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface H2AccountRepository extends JpaRepository<AccountEntity, String> {
}
