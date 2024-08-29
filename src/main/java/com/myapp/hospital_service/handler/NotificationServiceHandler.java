package com.myapp.hospital_service.handler;

import com.myapp.hospital_service.event.PatientDischargeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NotificationServiceHandler {

    @EventListener
    @Async
    public void notifyPatient(PatientDischargeEvent dischargeEvent) {
        log.info("NotificationService: sending discharge notification for {} ", dischargeEvent.getPatientName());
    }
}
