package com.company;
import Task1.Furniture;
import Task1.Furniture.*;
import Task2.*;

public class Main {


    public static void main(String[] args) {
        Furniture f = new Furniture();
        f.setBasePrice(10);
        f.setYearMade(2016);
        System.out.println(Furniture.estimatePrice(f));

        ScalableFigure a = new ScalableFigure( 23, 234, 2  ,new int[]{230, 23, 43});
        StretchableFigure b = new StretchableFigure( 23, 234, 2, 1.2, 1.3  ,new int[]{230, 23, 43});
        Triangle c = new Triangle ( 23, 234, 2, 1.2, 1.3, new int[]{230, 23, 43});
	// write your code here
    }
}
