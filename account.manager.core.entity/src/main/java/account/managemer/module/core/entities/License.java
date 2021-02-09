package account.managemer.module.core.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class License {

    private String accountId;
    private String licenseKey;
    private String status;

    public enum LicenseStatus {
        CREATED, RESERVED, ALLOCATED
    }
}
