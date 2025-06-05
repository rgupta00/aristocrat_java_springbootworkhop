package com.productapp.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ScheduleService {

    @Autowired
    private ProductService service;

    @Scheduled(initialDelay = 5000, fixedRate = 15000)
    public void evictCache() {
        log.info("-------------------Evicting cache------------------------");
        service.evictCache();
    }
}
