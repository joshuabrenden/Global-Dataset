package com.josh.service;

import com.josh.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticsService {

    public StatisticsService(){
    }

    @Autowired
    private DataRepository dataRepository;

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
