package com.company;
import Task1.Furniture;
import Task1.Furniture.*;
public class Main {


    public static void main(String[] args) {
        Furniture f = new Furniture();
        f.setBasePrice(10);
        f.setYearMade(2016);
        System.out.println(Furniture.estimatePrice(f));

	// write your code here
    }
}
