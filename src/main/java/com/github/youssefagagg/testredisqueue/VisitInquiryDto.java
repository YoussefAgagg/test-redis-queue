package com.github.youssefagagg.testredisqueue;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitInquiryDto implements Serializable {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer id;
    private AddressType addressType;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDateTime visitAssignationDate;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDateTime visitReceivingResponseDate;
    private String notes;
    private List<DocumentType> selectedDocuments = new ArrayList<>();
    private VisitTaskStatus taskStatus;
    private ContactDetailsDto contactDetails;
    private AddressDetailsDto addressDetails;
    private PersonalDetailsDto personalDetails;
    private HeadquarterDetailsDto headquarterDetails;
}
