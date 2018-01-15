package com.josh.repository;

import com.josh.domain.data.DataModel;
import com.josh.domain.event.Event;
import com.josh.repository.utils.DataSetFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class DataRepository {

    private String pathToDataFile = "/Users/christiannabrenden/Documents/josh/globalterrorismdb_0617dist.csv";

    @Autowired
    private DataSetFileReader dataSetFileReader;

    public void initialize() {
        if(getAllRecords().isEmpty()) {
            DataHolder.getInstance().setEvents(dataSetFileReader.getDataModels(pathToDataFile));
        }
    }

    public Set<Event> getAllRecords(){
        return DataHolder.getInstance().getEvents();
    }

    public int getTotalRecords(){
        return getAllRecords().size();
    }

    public long getTotalRecordsForYear(String year) {
        return getAllRecords().stream().filter(dataModel -> dataModel.iyear.equals(year)).count();
    }

    public long getTotalRecordsForCountry(String country) {
        return getAllRecords().stream().filter((dataModel -> dataModel.country_txt.equals(country))).count();
    }


    private static class DataHolder {
        private static DataHolder instance = null;
        private static Set<Event> events = null;

        protected DataHolder() {

        }

        public static DataHolder getInstance() {
            if(instance == null) {
                instance = new DataHolder();
            }

            return instance;
        }

        public void setEvents(Set<Event> data) {
            this.events = data;
        }

        public Set<Event> getEvents() {
            if(events == null){
                return new HashSet<>();
            } else {
                return events;
            }
        }
    }
}
