package com.kuang.pojo;

public class Hello {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showName(){
        System.out.println("my name is " + name);
    }

}
