package com.josh.repository.utils;

import com.josh.domain.data.DataModel;
import com.josh.domain.event.Event;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataSetFileReader {

    public Set<Event> getDataModels(String path){
        return getDataModelFromFile(path);
    }

    private Set<Event> getDataModelFromFile(String path){
        Set<Event> data = new HashSet<>();

        try(Reader in = new FileReader(path)) {
            Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(in);
            for (CSVRecord record : records) {
                Event dataModel = new Event();
                dataModel.eventid = record.get("eventid");
                dataModel.iyear = record.get("iyear");
                dataModel.imonth = record.get("imonth");
                dataModel.iday = record.get("iday");
                dataModel.approxdate = record.get("approxdate");
                dataModel.extended = record.get("extended");
                dataModel.resolution = record.get("resolution");
                dataModel.country = record.get("country");
                dataModel.countryName = record.get("country_txt");
                dataModel.region = record.get("region");
                dataModel.region_txt = record.get("region_txt");
                dataModel.provstate = record.get("provstate");
                dataModel.city = record.get("city");
                dataModel.latitude = record.get("latitude");
                dataModel.longitude = record.get("longitude");
                dataModel.specificity = record.get("specificity");
                dataModel.vicinity = record.get("vicinity");
                dataModel.location = record.get("location");
                dataModel.summary = record.get("summary");
                dataModel.crit1 = record.get("crit1");
                dataModel.crit2 = record.get("crit2");
                dataModel.crit3 = record.get("crit3");
                dataModel.doubtterr = record.get("doubtterr");
                dataModel.alternative = record.get("alternative");
                dataModel.alternative_txt = record.get("alternative_txt");
                dataModel.multiple = record.get("multiple");
                dataModel.success = record.get("success");
                dataModel.suicide = record.get("suicide");
                dataModel.attacktype1 = record.get("attacktype1");
                dataModel.attacktype1_txt = record.get("attacktype1_txt");
                dataModel.attacktype2 = record.get("attacktype2");
                dataModel.attacktype2_txt = record.get("attacktype2_txt");
                dataModel.attacktype3 = record.get("attacktype3");
                dataModel.attacktype3_txt = record.get("attacktype3_txt");
                dataModel.targtype1 = record.get("targtype1");
                dataModel.targtype1_txt = record.get("targtype1_txt");
                dataModel.targsubtype1 = record.get("targsubtype1");
                dataModel.targsubtype1_txt = record.get("targsubtype1_txt");
                dataModel.corp1 = record.get("corp1");
                dataModel.target1 = record.get("target1");
                dataModel.natlty1 = record.get("natlty1");
                dataModel.natlty1_txt = record.get("natlty1_txt");
                dataModel.targtype2 = record.get("targtype2");
                dataModel.targtype2_txt = record.get("targtype2_txt");
                dataModel.targsubtype2 = record.get("targsubtype2");
                dataModel.targsubtype2_txt = record.get("targsubtype2_txt");
                dataModel.corp2 = record.get("corp2");
                dataModel.target2 = record.get("target2");
                dataModel.natlty2 = record.get("natlty2");
                dataModel.natlty2_txt = record.get("natlty2_txt");
                dataModel.targtype3 = record.get("targtype3");
                dataModel.targtype3_txt = record.get("targtype3_txt");
                dataModel.targsubtype3 = record.get("targsubtype3");
                dataModel.targsubtype3_txt = record.get("targsubtype3_txt");
                dataModel.corp3 = record.get("corp3");
                dataModel.target3 = record.get("target3");
                dataModel.natlty3 = record.get("natlty3");
                dataModel.natlty3_txt = record.get("natlty3_txt");
                dataModel.gname = record.get("gname");
                dataModel.gsubname = record.get("gsubname");
                dataModel.gname2 = record.get("gname2");
                dataModel.gsubname2 = record.get("gsubname2");
                dataModel.gname3 = record.get("gname3");
                dataModel.gsubname3 = record.get("gsubname3");
                dataModel.motive = record.get("motive");
                dataModel.guncertain1 = record.get("guncertain1");
                dataModel.guncertain2 = record.get("guncertain2");
                dataModel.guncertain3 = record.get("guncertain3");
                dataModel.individual = record.get("individual");
                dataModel.nperps = record.get("nperps");
                dataModel.nperpcap = record.get("nperpcap");
                dataModel.claimed = record.get("claimed");
                dataModel.claimmode = record.get("claimmode");
                dataModel.claimmode_txt = record.get("claimmode_txt");
                dataModel.claim2 = record.get("claim2");
                dataModel.claimmode2 = record.get("claimmode2");
                dataModel.claimmode2_txt = record.get("claimmode2_txt");
                dataModel.claim3 = record.get("claim3");
                dataModel.claimmode3 = record.get("claimmode3");
                dataModel.claimmode3_txt = record.get("claimmode3_txt");
                dataModel.compclaim = record.get("compclaim");
                dataModel.weaptype1 = record.get("weaptype1");
                dataModel.weaptype1_txt = record.get("weaptype1_txt");
                dataModel.weapsubtype1 = record.get("weapsubtype1");
                dataModel.weapsubtype1_txt = record.get("weapsubtype1_txt");
                dataModel.weaptype2 = record.get("weaptype2");
                dataModel.weaptype2_txt = record.get("weaptype2_txt");
                dataModel.weapsubtype2 = record.get("weapsubtype2");
                dataModel.weapsubtype2_txt = record.get("weapsubtype2_txt");
                dataModel.weaptype3 = record.get("weaptype3");
                dataModel.weaptype3_txt = record.get("weaptype3_txt");
                dataModel.weapsubtype3 = record.get("weapsubtype3");
                dataModel.weapsubtype3_txt = record.get("weapsubtype3_txt");
                dataModel.weaptype4 = record.get("weaptype4");
                dataModel.weaptype4_txt = record.get("weaptype4_txt");
                dataModel.weapsubtype4 = record.get("weapsubtype4");
                dataModel.weapsubtype4_txt = record.get("weapsubtype4_txt");
                dataModel.weapdetail = record.get("weapdetail");
                dataModel.nkill = record.get("nkill");
                dataModel.nkillus = record.get("nkillus");
                dataModel.nkillter = record.get("nkillter");
                dataModel.nwound = record.get("nwound");
                dataModel.nwoundus = record.get("nwoundus");
                dataModel.nwoundte = record.get("nwoundte");
                dataModel.property = record.get("property");
                dataModel.propextent = record.get("propextent");
                dataModel.propextent_txt = record.get("propextent_txt");
                dataModel.propvalue = record.get("propvalue");
                dataModel.propcomment = record.get("propcomment");
                dataModel.ishostkid = record.get("ishostkid");
                dataModel.nhostkid = record.get("nhostkid");
                dataModel.nhostkidus = record.get("nhostkidus");
                dataModel.nhours = record.get("nhours");
                dataModel.ndays = record.get("ndays");
                dataModel.divert = record.get("divert");
                dataModel.kidhijcountry = record.get("kidhijcountry");
                dataModel.ransom = record.get("ransom");
                dataModel.ransomamt = record.get("ransomamt");
                dataModel.ransomamtus = record.get("ransomamtus");
                dataModel.ransompaid = record.get("ransompaid");
                dataModel.ransompaidus = record.get("ransompaidus");
                dataModel.ransomnote = record.get("ransomnote");
                dataModel.hostkidoutcome = record.get("hostkidoutcome");
                dataModel.hostkidoutcome_txt = record.get("hostkidoutcome_txt");
                dataModel.nreleased = record.get("nreleased");
                dataModel.addnotes = record.get("addnotes");
                dataModel.scite1 = record.get("scite1");
                dataModel.scite2 = record.get("scite2");
                dataModel.scite3 = record.get("scite3");
                dataModel.dbsource = record.get("dbsource");
                dataModel.INT_LOG = record.get("INT_LOG");
                dataModel.INT_IDEO = record.get("INT_IDEO");
                dataModel.INT_MISC = record.get("INT_MISC");
                dataModel.INT_ANY = record.get("INT_ANY");
                dataModel.related = record.get("related");
                data.add(dataModel);
            }

            System.out.println("Initialized repository with " + data.size() + " records.");
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return data;
    }
}
