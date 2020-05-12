package co.com.habi.screenplay.util.enums;

public enum Citys {

    BOGOTA("Bogotá");


    private String city;

    Citys(String city){
        this.city = city;
    }

    public String city() {
        return city;
    }

}
