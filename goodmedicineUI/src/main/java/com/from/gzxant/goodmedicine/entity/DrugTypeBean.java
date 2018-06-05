package com.from.gzxant.goodmedicine.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 2018/6/5.
 */

public class DrugTypeBean {
    private List<String> drugstrList=new ArrayList<>();
    private List<DrugTypeContentBean> drugList=new ArrayList<>();

    public List<String> getDrugstrList() {
        return drugstrList;
    }

    public void setDrugstrList(List<String> drugstrList) {
        this.drugstrList = drugstrList;
    }

    public List<DrugTypeContentBean> getDrugList() {
        return drugList;
    }

    public void setDrugList(List<DrugTypeContentBean> drugList) {
        this.drugList = drugList;
    }
}
