package com.myapp.hospital_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientDischargeRequest {

    private String patientId;
    private String patientName;
}
