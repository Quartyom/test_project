package com.quartyom;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        var Residents = new LinkedList<Being>();

        Residents.add(new Being());
        Residents.add(new Being("Butterfly", 0));
        Residents.add(new Human());
        Residents.add(new Trader("Marques", 1, 1, 43, 0.79f));
        Residents.add(new Doctor());

        for (var item : Residents){
            System.out.println(item.get_full_info());
        }
    }
}