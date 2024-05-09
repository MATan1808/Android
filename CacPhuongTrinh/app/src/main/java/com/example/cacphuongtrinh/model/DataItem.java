package com.example.cacphuongtrinh.model;

public class DataItem {
    private String name;

    public DataItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tan Ma Dep Trai Vai Lon !!! \n"+this.name;
    }
}
