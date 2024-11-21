package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
    private Date expirationDate;

    // Constructor
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }
    public Date getExpirationDate() {
        return expirationDate;
    }
    public String getFormattedDate(Date date) {
        return DATE_FORMAT.format(date);
    }
    @Override
    public String getSpecificData() {
        StringBuilder sb = new StringBuilder();
        sb.append("Localización: ");
        sb.append(getLocation());
        sb.append(" | ");
        sb.append("Fecha de caducidad: ");
        sb.append(DATE_FORMAT.format(expirationDate));
        return sb.toString();
    }
    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}
