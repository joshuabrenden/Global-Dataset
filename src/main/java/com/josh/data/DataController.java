package com.josh.data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class DataController {

    @RequestMapping("/data")
    public String viewData(Model model) {
        Set<DataModel> dataModelList = DataHolder.getInstance().getData();

        Integer totalRecords = dataModelList.size();

        long num2015Events = dataModelList.stream().filter(dataModel -> dataModel.iyear.equals("2015")).count();

        model.addAttribute("totalRecords", totalRecords);
        model.addAttribute("num2015Events", num2015Events);
        return "data";
    }
}
