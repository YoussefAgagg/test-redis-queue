package com.github.youssefagagg.testredisqueue;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

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

}
