package com.shs;

public class CyrusHo {
    private String Anime;
    private int hoursSlept;
    private int passingClasses;

 //   public void CyrusHo(String Anime, int hoursSlept, int passingClasses) {
    public CyrusHo(String Anime, int hoursSlept, int passingClasses) {
       this.Anime = Anime;
        this.hoursSlept = hoursSlept;
        this.passingClasses = passingClasses;
    }

    public String getAnime() {
        return(this.Anime);
    }

    public void setAnime(String Anime) {
        this.Anime = Anime;
    }

    public int getHoursSlept() {
        return(this.hoursSlept);
    }

    public void setHoursSlept(int hoursSlept) {
        this.hoursSlept = hoursSlept;
    }

    public int getPassingClasses() {
        return(this.passingClasses);
    }

    public void setPassingClasses(int passingClasses) {
        this.passingClasses = passingClasses;
    }

    public void CyrusHo() {
        Anime = "Overflow";
        hoursSlept = 10000000;
        passingClasses = 0;
    }

}
