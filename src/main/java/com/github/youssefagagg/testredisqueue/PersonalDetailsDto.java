package com.github.youssefagagg.testredisqueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalDetailsDto implements Serializable {
    private String name;
    private String nationalId;
    private String mobileNumber;
    private String phoneNumber;
}

