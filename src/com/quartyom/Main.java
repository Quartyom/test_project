package com.quartyom;

import java.util.LinkedList;

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