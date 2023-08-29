package com.github.youssefagagg.testredisqueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailsDto implements Serializable {
    @NotNull
    private String productCode;
    @NotNull
    private Long eligibleAmount;
    @NotNull
    private Long requestedAmount;
    @NotNull
    private String gracePeriod;
    @NotNull
    private String repaymentTenure;
    @NotNull
    private String interestRate;
}

