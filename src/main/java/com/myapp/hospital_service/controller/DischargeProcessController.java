package com.myapp.hospital_service.controller;

import com.myapp.hospital_service.dto.PatientDischargeRequest;
import com.myapp.hospital_service.service.PatientDischargeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discharge")
@RequiredArgsConstructor
public class DischargeProcessController {

    private final PatientDischargeService patientDischargeService;

    @PostMapping("/process")
    public String dischargePatient(@RequestBody PatientDischargeRequest patientDischargeRequest) {
        return patientDischargeService.dischargePatient(patientDischargeRequest);
    }

}
