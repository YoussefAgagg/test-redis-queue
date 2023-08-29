package com.github.youssefagagg.testredisqueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDetailsDto implements Serializable {
    private String address;
    private String actualAddress;
    private String governorateName;
    private String governorateCode;
    private String city;
}

