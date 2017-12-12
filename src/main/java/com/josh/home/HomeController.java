package com.josh.home;

import com.josh.data.DataHolder;
import com.josh.data.DataSetFileReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        String path = "C:/data/globalterrorismdb_0617dist.csv";

        if(DataHolder.getInstance().getData().isEmpty()){
            DataSetFileReader reader = new DataSetFileReader();
            DataHolder.getInstance().setData(reader.getDataModel(path));
        }

        return "index";
    }

}
