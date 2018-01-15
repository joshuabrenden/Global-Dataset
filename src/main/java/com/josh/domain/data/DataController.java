package com.josh.domain.data;

import com.josh.domain.event.Event;
import com.josh.repository.EventRepository;
import com.josh.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class DataController {

    @Autowired
    private StatisticsService statisticsService;

    @Autowired
    private EventRepository repository;

    @RequestMapping("/data")
    public String viewData(Model model) {
        repository.deleteAll();
        Set<Event> events = statisticsService.getAllEvents();

        for(Event event: events){
            System.out.println("Saving: " + event.eventid + "," + event.country_txt);
            repository.save(event);
        }

        for(Event ev : repository.findAll()){
            System.out.println("found: " + ev.eventid + " " + ev.country_txt);
        }


        model.addAttribute("totalRecords", statisticsService.getTotalEventsCount());
        model.addAttribute("num2015Events", statisticsService.getTotalEventsCountForYear("2015"));
        model.addAttribute("numUnitedStatesEvents", statisticsService.getTotalEventsCountForCountry("United States"));
        return "data";
    }
}
