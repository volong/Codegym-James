package com.codegym.model;

public class Province {
    private int id;
    private String province;

    public Province() {
    }

    public Province(int id, String province) {
        this.id = id;
        this.province = province;
    }

    public int getId_province() {
        return id;
    }

    public void setId_province(int id_province) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
