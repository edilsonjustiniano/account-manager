package account.manager.adapter.repository.h2.license;

import account.manager.adapter.repository.h2.account.AccountEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "license")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class LicenseEntity {

    @Id
    private String key;

    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    private AccountEntity account;
}
