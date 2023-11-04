package org.example.C5S1Challange;

public class Mobile {

    private String brandName;
    private int cost;
    private String screenSize;
    private String batteryLife;

    public Mobile(String brandName, int cost, String screenSize, String batteryLife) {
        this.brandName = brandName;
        this.cost = cost;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brandName='" + brandName + '\'' +
                ", cost=" + cost +
                ", screenSize='" + screenSize + '\'' +
                ", batteryLife='" + batteryLife + '\'' +
                '}';
    }
}
