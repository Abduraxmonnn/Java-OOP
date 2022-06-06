package com.company;

import java.util.Date;

public class DriverLicense {
    private String serialCode;
    public String type;
    public Date issuanceDate;
    public Date expirationDate;
    public String organization;

    public DriverLicense() {
    }

    public DriverLicense(String serialcode, String type) {
        this.serialCode = serialcode;
        this.type = type;
    }

    public String getSerialCode() {
        return serialCode;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getGivenDate() {
        return issuanceDate;
    }

    public void setGivenDate(Date issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public Date getDueDate() {
        return expirationDate;
    }

    public void setDueDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public void show(){
        System.out.println("--> certificate serial code: "+this.getSerialCode());
        System.out.println("--> type of certificate: "+this.getType());
        System.out.println("--> certificate issuance: "+this.getGivenDate());
        System.out.println("--> certificate expiration date: "+this.getDueDate());
        System.out.println("--> certification body: "+this.getOrganization());
    }
}
