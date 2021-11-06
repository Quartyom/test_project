package com.quartyom;

import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var Residents = new LinkedList<Being>();

        Residents.add(new Being());
        Residents.add(new Being("Butterfly", false));
        Residents.add(new Human());
        Residents.add(new Trader("Marques", true, true, 43, 0.79f));
        Residents.add(new Doctor());

        for (var item : Residents){
            System.out.println(item.get_full_info());
        }
    }
}

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

class Trader extends Human {
    private float goods_uniqueness = 0.5f; // 0 -> 1 more uniq

    public Trader(){}
    public Trader(String name, boolean is_alive, boolean is_male, int age, float goods_uniqueness){
        super(name, is_alive, is_male, age);
        set_goods_uniqueness(goods_uniqueness);
    }

    public float get_goods_uniqueness(){return goods_uniqueness;}
    public void set_goods_uniqueness(float goods_uniqueness){
        if (goods_uniqueness >= 0 && goods_uniqueness <= 1) {
            this.goods_uniqueness = goods_uniqueness;
        }
    }
    public String get_full_info(){
        String output = super.get_full_info();
        output += "Goods uniqueness : " + goods_uniqueness + '\n';
        return output;
    }
}

class Doctor extends Human {
    private int experience_in_years = 2;

    public Doctor(){}
    public Doctor(String name, boolean is_alive, boolean is_male, int age, int experience_in_years){
        super(name, is_alive, is_male, age);
        this.experience_in_years = experience_in_years;
    }

    public int get_experience_in_years(){return experience_in_years;}
    public void set_experience_in_years(int experience_in_years){this.experience_in_years = experience_in_years;}

    public String get_full_info(){
        String output = super.get_full_info();
        output += "Experience in years : " + experience_in_years + '\n';
        return output;
    }
}