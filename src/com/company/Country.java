package com.company;

public enum Country {
    ITALY("Italian","IT",80000000.0), POLAND("Polish", "PL",5000654000.0), SPAIN("Spanish","ES", 45102154151541.0), UNITEDKINDOM("English", "UK",45152102154.0), GERMANY("GERMAN", "DE",44411551154.0);
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

    public double getGDPInUsD() {
        return GDPInUSD;
    }

    public double GDPtoPLN(){
        return Country.ITALY.getGDPInUsD()/4.00;
    }
}

