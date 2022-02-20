package com.company;

public enum Country {
    ITALY("Italian","IT",80000000.0), POLAND("Polish", "PL",5000654000.0), SPAIN("Spanish","ES", 45102154151541.0);
    private String language;
    private String code;
    private double GDPInUSD;


    Country(String language, String code, double GDdInUsD) {
        this.language = language;
        this.code = code;
        this.GDPInUSD = GDdInUsD;
    }

    public String getLanguage() {
        return language;
    }

    public String getCode() {
        return code;
    }

    public double getGDdInUsD() {
        return GDPInUSD;
    }

    public double GDPtoPLN(){
        return Country.ITALY.getGDdInUsD()/4.00;
    }
}

