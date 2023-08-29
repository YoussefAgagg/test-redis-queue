package com.github.youssefagagg.testredisqueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreferredBranchDto implements Serializable {
    @NotNull
    @Pattern(regexp = "\\d+")
    private String branchId;
    @NotNull
    private String branchName;
    @NotNull
    @Pattern(regexp = "\\d+")
    private String zoneCode;
    @NotNull
    private String zoneName;
}
