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

        for(Event event: statisticsService.getTotalEventsCountForCountry("United States")){
            System.out.println("Saving event: " + event.eventid + ":" + event.countryName);
            if(event.summary.length() > 2000){
                System.out.printf("Trimming summary length from " + event.summary.length() + " to 2000");
                event.summary = event.summary.substring(0, Math.min(event.summary.length(), 2000));
            }

            if(event.motive.length() > 2000){
                System.out.printf("Trimming motive length from " + event.motive.length() + " to 2000");
                event.motive = event.motive.substring(0, Math.min(event.motive.length(), 2000));
            }

            if(event.addnotes.length() > 2000){
                System.out.printf("Trimming addnotes length from " + event.addnotes.length() + " to 2000");
                event.addnotes = event.addnotes.substring(0, Math.min(event.addnotes.length(), 2000));
            }

            if(event.related.length() > 2000){
                System.out.printf("Trimming related length from " + event.related.length() + " to 2000");
                event.related = event.related.substring(0, Math.min(event.related.length(), 2000));
            }

            if(event.scite3.length() > 2000){
                System.out.printf("Trimming scite3 length from " + event.scite3.length() + " to 2000");
                event.scite3 = event.scite3.substring(0, Math.min(event.scite3.length(), 2000));
            }

            if(event.weapdetail.length() > 2000){
                System.out.printf("Trimming weapdetail length from " + event.weapdetail.length() + " to 2000");
                event.weapdetail = event.weapdetail.substring(0, Math.min(event.weapdetail.length(), 2000));
            }

            if(event.propcomment.length() > 2000){
                System.out.printf("Trimming propcomment length from " + event.propcomment.length() + " to 2000");
                event.propcomment = event.propcomment.substring(0, Math.min(event.propcomment.length(), 2000));
            }


            repository.save(event);
        }

        int totalRecords = repository.findAll().size();
        int num2015Events = repository.findEventsByIyear("2015").size();
        int numUnitedStatesEvents = repository.findEventsByCountryName("United States").size();


        model.addAttribute("totalRecords", totalRecords);
        model.addAttribute("num2015Events", num2015Events);
        model.addAttribute("numUnitedStatesEvents", numUnitedStatesEvents);
        return "data";
    }
}
