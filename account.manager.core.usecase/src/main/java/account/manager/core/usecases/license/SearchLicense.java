package account.manager.core.usecases.license;

import account.managemer.module.core.entities.License;
import account.manager.core.usecases.ports.license.LicenseRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class SearchLicense {

    private final LicenseRepository repository;

    public List<License> search() {
        return repository.findAll();
    }

    public List<License> search(String accountId) {
        return repository.findAllByAccountId(accountId);
    }

    public License searchLicense(String key) {
        return repository.findByLicenseKey(key).orElse(License.builder().build());
    }
}
