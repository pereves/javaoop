package org.example;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Cat cat = new Cat();
    //по полям
    //cat.name = "Тиша";
    //cat.color = "Black";
    //cat.age = 21;
    //инкапсулировали
    cat.setName("Тиша");
    cat.setColor("Black");
    cat.setAge(21);
    System.out.println("cat = " +cat);
    cat.animalJump();
    cat.animalVoice();
    cat.animalInfo();
    if(cat instanceof Cat){
        System.out.println("это точно кот");
    }

//    Point3d pointA = new Point3d(2, 3   , 4);
//    Point3d pointB = new Point3d(3, 4, 5);
//    System.out.println(pointA.lenghtVector());
//    System.out.println(pointA.scalarMultiplay(pointB));
//    System.out.println(pointA.multi(pointB).x+","+pointA.multi(pointB).y+","+pointA.multi(pointB).z+",");
//    System.out.println(pointA.cosTriangle(pointB));



    }
}