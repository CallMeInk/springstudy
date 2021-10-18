package com.kuang.pojo;

public class User {

    private String name;

    //ioc 使用无参构造创建对象方式
    public User(){
        System.out.println("User no param constructor");
    }

    public User(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName(){
        System.out.println("user name is " + this.getName());
    }
}
