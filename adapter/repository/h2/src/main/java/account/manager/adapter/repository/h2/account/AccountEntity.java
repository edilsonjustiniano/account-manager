package account.manager.adapter.repository.h2.account;

import account.manager.adapter.repository.h2.license.LicenseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Table(name = "account")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AccountEntity {

    @Id
    private String id;
    private String name;

    @OneToMany(mappedBy = "account")
    private Set<LicenseEntity> licenses;
}
