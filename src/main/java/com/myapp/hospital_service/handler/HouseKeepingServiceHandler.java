package com.myapp.hospital_service.handler;

import com.myapp.hospital_service.event.PatientDischargeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HouseKeepingServiceHandler {

    @EventListener
    @Async
    public void cleanAndAssign(PatientDischargeEvent dischargeEvent) {
        log.info("HouseKeepingService: preparing room for next patient after discharging the {} ", dischargeEvent.getPatientName());
    }
}
