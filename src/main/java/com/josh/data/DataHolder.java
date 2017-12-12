package com.josh.data;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jbrenden on 12/12/2017.
 */
public class DataHolder {
    private static DataHolder instance = null;
    private static Set<DataModel> data = null;
    protected DataHolder() {

    }

    public static DataHolder getInstance() {
        if(instance == null) {
            instance = new DataHolder();
        }

        return instance;
    }

    public void setData(Set<DataModel> data) {
        this.data = data;
    }

    public Set<DataModel> getData() {
        if(data == null){
            return new HashSet<>();
        } else {
            return data;
        }
    }
}
