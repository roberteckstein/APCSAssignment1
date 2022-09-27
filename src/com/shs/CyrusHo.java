package com.shs;

public class CyrusHo {
    private String getAnime;
    private int hoursSlept;
    private int passingClasses;

    public void CyrusHo(String getAnime, int hoursSlept, int passingClasses) {
        this.getAnime = getAnime;
        this.hoursSlept = hoursSlept;
        this.passingClasses = passingClasses;
    }

    public void CyrusHo() {
        getAnime = "Overflow";
        hoursSlept = 10000000;
        passingClasses = 0;
    }

}
