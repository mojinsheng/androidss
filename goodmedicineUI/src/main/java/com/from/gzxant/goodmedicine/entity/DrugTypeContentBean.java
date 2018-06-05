package com.from.gzxant.goodmedicine.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 2018/6/5.
 */

public class DrugTypeContentBean {
    private String twoType;
    private List<String> list=new ArrayList<>();

    public String getTwoType() {
        return twoType;
    }

    public void setTwoType(String twoType) {
        this.twoType = twoType;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
