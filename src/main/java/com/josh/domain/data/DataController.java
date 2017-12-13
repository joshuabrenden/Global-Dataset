package com.josh.domain.data;

import com.josh.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataController {

    @Autowired
    private StatisticsService statisticsService;


    @RequestMapping("/data")
    public String viewData(Model model) {
        model.addAttribute("totalRecords", statisticsService.getTotalEvents());
        model.addAttribute("num2015Events", statisticsService.getTotalEventsForYear("2015"));
        return "data";
    }
}
