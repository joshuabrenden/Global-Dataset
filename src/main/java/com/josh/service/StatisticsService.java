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

    public int getTotalEvents(){
        return dataRepository.getTotalRecords();
    }

    public long getTotalEventsForYear(String year) {
        return dataRepository.getTotalRecordsForYear(year);
    }

}
