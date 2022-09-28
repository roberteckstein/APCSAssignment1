package com.shs;

public class DeansClass {
    private String hi3 = "yes";
    private String hi2 = "yes";
    private int hi = 20;

    public DeansClass(String hi3, String hi2, int hi){
        this.hi = 20;
        this.hi2 = hi2;
        this.hi3 = hi3;
        System.out.println(hi + hi2 + hi3);
    }

    /********************************
     *
     *
     * Getters and Setters
     *
     *
     *******************************/

    public int getHi() {
        return hi;
    }

    public void setHi(int hi) {
        this.hi = hi;
    }

    public String getHi2() {
        return hi2;
    }

    public void setHi2(String hi2) {
        this.hi2 = hi2;
    }

    public String getHi3() {
        return hi3;
    }

    public void setHi3(String hi3) {
        this.hi3 = hi3;
    }
}
