package com.github.youssefagagg.testredisqueue;

import lombok.Getter;

@Getter
public enum DocumentType {
    NATIONAL_ID("البطاقة الشخصية"),
    COMPANY_COMMERCIAL_REGISTER("السجل التجاري"),
    COMPANY_TAX_CARD("البطاقة الضريبية"),
    FINANCIAL_STATEMENTS("القوائم المالية"),
    COMPANY_TAX_POSITION("الموقف الضريبي"),
    COMPANY_ESTABLISHMENT_CONTRACT("عقد التأسيس"),

    ;
    private final String value;

    DocumentType(String value) {
        this.value = value;
    }
}
