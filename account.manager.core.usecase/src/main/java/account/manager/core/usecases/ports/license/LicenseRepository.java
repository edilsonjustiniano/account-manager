package account.manager.core.usecases.ports.license;

import account.managemer.module.core.entities.License;

import java.util.List;
import java.util.Optional;

public interface LicenseRepository {

    License save(License license);

    List<License> findAll();

    List<License> findAllByAccountId(String accountId);

    Optional<License> findByLicenseKey(String key);

    License update(License license);
}
