package com.github.youssefagagg.testredisqueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeadquarterDetailsDto implements Serializable {
    private String facilityIdentifierNumber;
    private String commercialRegisterNo;
    private String issuingOffice;
    private String taxCardNo;
    private String depositCommercialRegisterNo;

}

