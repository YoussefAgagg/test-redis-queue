package com.github.youssefagagg.testredisqueue;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.ALWAYS)
public class ApplicationRequest implements Serializable {
    @NotNull
    private String externalAppId;
    @NotNull
    private String companyName;
    @NotNull
    private String companyOwner;
    private Long lastUpdatedSinceMillSecond;
    @NotNull
    private String mainActivity;
    @NotNull
    private String purposeOfFacility;
    @NotNull
    private String yearsOfBusiness;
    private List<VisitInquiryDto> visits = new ArrayList<>();
    @NotEmpty
    @Size(min = 2, max = 10)
    private List<@Valid SupplierCallDto> supplierCalls = new ArrayList<>();
    private List<@Valid ClientCallDto> clientCalls = new ArrayList<>();
    @NotNull
    private String appId;

    @NotNull
    @Valid
    private ProductDetailsDto productDetails;
    @NotNull
    @Valid
    private PreferredBranchDto preferredBranch;
    @NotNull
    private String workTimeSchedule;
    @NotNull
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate companyStartDate;
    @NotNull
    private Long companyCapital;
    @NotNull
    private String customerType;
}
