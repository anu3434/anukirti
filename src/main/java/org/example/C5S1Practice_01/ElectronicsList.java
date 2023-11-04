package org.example.C5S1Practice_01;

public class ElectronicsList {

    private String electronicsItems;

    public ElectronicsList(String electronicsItems) {
        this.electronicsItems = electronicsItems;
    }

    public String getElectronicsItems() {
        return electronicsItems;
    }

    public void setElectronicsItems(String electronicsItems) {
        this.electronicsItems = electronicsItems;
    }

    @Override
    public String toString() {
        return "ElectronicsList{" +
                "electronicsItems='" + electronicsItems + '\'' +
                '}';
    }
}
