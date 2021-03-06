package com.josh.domain.event;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event {
    @Id
    public String eventid;

    public String iyear;
    public String imonth;
    public String iday;
    public String approxdate;
    public String extended;
    public String resolution;
    public String country;
    public String countryName;
    public String region;
    public String region_txt;
    public String provstate;
    public String city;
    public String latitude;
    public String longitude;
    public String specificity;
    public String vicinity;
    @Column(length = 2000)
    public String location;

    @Column(length = 2000)
    public String summary;
    public String crit1;
    public String crit2;
    public String crit3;
    public String doubtterr;
    public String alternative;
    public String alternative_txt;
    public String multiple;
    public String success;
    public String suicide;
    public String attacktype1;
    public String attacktype1_txt;
    public String attacktype2;
    public String attacktype2_txt;
    public String attacktype3;
    public String attacktype3_txt;
    public String targtype1;
    public String targtype1_txt;
    public String targsubtype1;
    public String targsubtype1_txt;
    public String corp1;
    public String target1;
    public String natlty1;
    public String natlty1_txt;
    public String targtype2;
    public String targtype2_txt;
    public String targsubtype2;
    public String targsubtype2_txt;
    public String corp2;
    public String target2;
    public String natlty2;
    public String natlty2_txt;
    public String targtype3;
    public String targtype3_txt;
    public String targsubtype3;
    public String targsubtype3_txt;
    public String corp3;
    public String target3;
    public String natlty3;
    public String natlty3_txt;
    public String gname;
    public String gsubname;
    public String gname2;
    public String gsubname2;
    public String gname3;
    public String gsubname3;

    @Column(length = 2000)
    public String motive;
    public String guncertain1;
    public String guncertain2;
    public String guncertain3;
    public String individual;
    public String nperps;
    public String nperpcap;
    public String claimed;
    public String claimmode;
    public String claimmode_txt;
    public String claim2;
    public String claimmode2;
    public String claimmode2_txt;
    public String claim3;
    public String claimmode3;
    public String claimmode3_txt;
    public String compclaim;
    public String weaptype1;
    public String weaptype1_txt;
    public String weapsubtype1;
    public String weapsubtype1_txt;
    public String weaptype2;
    public String weaptype2_txt;
    public String weapsubtype2;
    public String weapsubtype2_txt;
    public String weaptype3;
    public String weaptype3_txt;
    public String weapsubtype3;
    public String weapsubtype3_txt;
    public String weaptype4;
    public String weaptype4_txt;
    public String weapsubtype4;
    public String weapsubtype4_txt;
    @Column(length = 2000)
    public String weapdetail;
    public String nkill;
    public String nkillus;
    public String nkillter;
    public String nwound;
    public String nwoundus;
    public String nwoundte;
    public String property;
    public String propextent;
    public String propextent_txt;
    public String propvalue;
    @Column(length = 2000)
    public String propcomment;
    public String ishostkid;
    public String nhostkid;
    public String nhostkidus;
    public String nhours;
    public String ndays;
    public String divert;
    public String kidhijcountry;
    public String ransom;
    public String ransomamt;
    public String ransomamtus;
    public String ransompaid;
    public String ransompaidus;
    @Column(length = 2000)
    public String ransomnote;
    public String hostkidoutcome;
    public String hostkidoutcome_txt;
    public String nreleased;
    @Column(length = 2000)
    public String addnotes;
    @Column(length = 2000)
    public String scite1;
    @Column(length = 2000)
    public String scite2;
    @Column(length = 2000)
    public String scite3;
    public String dbsource;
    public String INT_LOG;
    public String INT_IDEO;
    public String INT_MISC;
    public String INT_ANY;
    @Column(length = 2000)
    public String related;

    public Event() { }

}
