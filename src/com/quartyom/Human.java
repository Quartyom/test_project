package com.quartyom;

class Human extends Being {
    private boolean is_male = true;
    private int age = 18;

    public Human(){}
    public Human(String name, boolean is_alive, boolean is_male, int age){
        super(name, is_alive);
        this.age = age;
        this.is_male = is_male;
    }

    public boolean get_is_male(){ return is_male; }
    public void set_is_male(boolean is_male){ this.is_male = is_male;}

    public int get_age(){return age;}
    public void set_age(){this.age = age;}

    public String get_full_info(){
        String output = super.get_full_info();
        output += "Is male : " + is_male + '\n';
        output += "Age : " + age + '\n';
        return output;
    }
}