package account.manager.core.usecases.license;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LicenseDto {

    private String accountId;
    private String key;
    private String status;
}
