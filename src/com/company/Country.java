package com.company;

public enum Country {
    ITALY("Italian","IT",80000000.0), POLAND("Polish", "PL",5000654000.0),
    SPAIN("Spanish","ES", 45102154151541.0), ENGLAND("English", "UK",45152102154.0),
    GERMANY("GERMAN", "DE",44411551154.0);


    private String language;
    private String code;
    private double GDPInUSD;


    Country(String language, String code, double GDPInUSD) {
        this.language = language;
        this.code = code;
        this.GDPInUSD = GDPInUSD;
    }

    public String getLanguage() {
        return language;
    }

    public String getCode() {
        return code;
    }

    public double getGDPInUSD() {
        return GDPInUSD;
    }

    public double getGDPtoPLN(){
        return Country.ITALY.getGDPInUSD()*4.00;
    }
}

