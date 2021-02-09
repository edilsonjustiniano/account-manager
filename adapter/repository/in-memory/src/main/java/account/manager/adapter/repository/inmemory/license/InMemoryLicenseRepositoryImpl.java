package account.manager.adapter.repository.inmemory.license;

import account.managemer.module.core.entities.License;
import account.manager.core.usecases.ports.license.LicenseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class InMemoryLicenseRepositoryImpl implements LicenseRepository {

    Map<String, License> db = new ConcurrentHashMap<>();

    @Override
    public License save(License license) {
        return db.put(license.getLicenseKey(), license);
    }

    @Override
    public List<License> findAll() {
        return new ArrayList<>(db.values());
    }

    @Override
    public List<License> findAllByAccountId(String accountId) {
        return db.values().stream()
                .filter(license -> accountId.equals(license.getAccountId()))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<License> findByLicenseKey(String key) {
        return db.values().stream()
                .filter(license -> key.equals(license.getLicenseKey()))
                .findFirst();
    }

    @Override
    public License update(License license) {
        return db.put(license.getLicenseKey(), license);
    }
}
