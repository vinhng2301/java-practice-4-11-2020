package com.codegym;

public class Country {

    private int id;
    private String code;
    private String name;

    public Country(){
        super();

    }

    public Country(int id, String code, String name){
        super();
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public String toString(){
        return "Country [id=" + id + ", code=" + code + ", name" + name + "]";
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }
}
