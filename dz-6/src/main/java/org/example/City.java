package org.example;

import java.util.ArrayList;

public class City {
    public String name=null;
    public int pop = 0;


    public City(String name, int pop) {
    this.name=name;
    this.pop=pop;
    }


    public String getName() {
        return this.name;
    }

    public int getPop(){
        return this.pop;
    }

    public void setPop(int pop){
        this.pop=pop;
    }
}
