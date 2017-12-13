package com.josh;


import com.josh.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;import org.springframework.stereotype.Component;


@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private DataRepository dataRepository;

    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {
        System.out.println("Initializing Repository.");
        dataRepository.initialize();
    }
}
