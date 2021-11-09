package com.quartyom;

import java.util.Random;

class Being {
    private Random rand = new Random();
    private boolean is_alive = true;
    private String name = "id " + rand.nextInt(1<<31 - 1); // 2^31

    public Being(){}
    public Being(String name, boolean is_alive){
        this.name = name;
        this.is_alive = is_alive;
    }

    public boolean get_is_alive(){ return is_alive; }
    public void set_is_alive(boolean is_alive){ this.is_alive = is_alive;}

    public String get_name(){return name;}
    public void set_name(){this.name = name;}

    public String get_full_info(){
        String output = "";
        output += "Name : " + name + '\n';
        output += "Is alive : " + is_alive + '\n';
        return output;
    }
}