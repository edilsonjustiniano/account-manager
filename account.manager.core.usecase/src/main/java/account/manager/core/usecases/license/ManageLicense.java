package account.manager.core.usecases.license;

import account.managemer.module.core.entities.License;
import account.manager.core.usecases.ports.license.LicenseRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ManageLicense {

    private final LicenseRepository repository;

    public License create(LicenseDto dto) {
        var license = buildLicense(dto);

        return repository.save(license);
    }

    public License update(LicenseDto dto) {
        var license = repository.findByLicenseKey(dto.getKey())
                .map(l -> {
                    l.setStatus(dto.getStatus());
                    return l;
                }).orElse(buildLicense(dto));

        return repository.update(license);
    }

    private License buildLicense(LicenseDto dto) {
        return License.builder()
                .accountId(dto.getAccountId())
                .licenseKey(dto.getKey())
                .status(dto.getStatus())
                .build();
    }
}
