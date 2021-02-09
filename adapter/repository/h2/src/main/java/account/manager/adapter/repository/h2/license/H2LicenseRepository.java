package account.manager.adapter.repository.h2.license;

import org.springframework.data.jpa.repository.JpaRepository;

public interface H2LicenseRepository extends JpaRepository<LicenseEntity, String> {
}
