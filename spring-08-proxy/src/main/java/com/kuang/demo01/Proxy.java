package com.kuang.demo01;

public class Proxy implements Rent{

    private Host host;

    public Proxy(){}

    public Proxy(Host host){
        this.host = host;
    }

    public void rent() {
        host.rent();
    }

    public void foundHouse(){
        System.out.println("proxy found house");
    }
}
