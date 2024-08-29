package com.myapp.hospital_service.service;

import com.myapp.hospital_service.dto.PatientDischargeRequest;
import com.myapp.hospital_service.event.PatientDischargeEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PatientDischargeService {

    private final ApplicationEventPublisher eventPublisher;

    public String dischargePatient(PatientDischargeRequest patientDischargeRequest) {
        log.info("publishing the event for patient {} ", patientDischargeRequest.getPatientName());
        eventPublisher.publishEvent(new PatientDischargeEvent(this, patientDischargeRequest.getPatientId(), patientDischargeRequest.getPatientName()));
        log.info("Patient discharge process completed for {} ", patientDischargeRequest.getPatientName());
        return String.format("Patient %s discharged successful", patientDischargeRequest.getPatientName());
    }
}
