package com.josh.data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

@Controller
public class DataController {

    @RequestMapping("/data")
    public String viewData(Model model) {
        Set<DataModel> dataModelList = DataHolder.getInstance().getData();

        Integer totalRecords = dataModelList.size();

        model.addAttribute("totalRecords", totalRecords);
        return "data";
    }
}
