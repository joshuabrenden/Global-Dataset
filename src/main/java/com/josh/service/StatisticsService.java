package com.josh.service;

import com.josh.domain.event.Event;
import com.josh.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StatisticsService {

    public StatisticsService(){
    }

    @Autowired
    private DataRepository dataRepository;

    public Set<Event> getAllEvents(){
        return dataRepository.getAllRecords();
    }
    public int getTotalEventsCount(){
        return dataRepository.getTotalRecords();
    }

    public long getTotalEventsCountForYear(String year) {
        return dataRepository.getTotalRecordsForYear(year);
    }

    public long getTotalEventsCountForCountry(String country) {
        return dataRepository.getTotalRecordsForCountry(country);
    }

}
