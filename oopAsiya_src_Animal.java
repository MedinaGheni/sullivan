import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements eatble {

        // OOP -- core java
        // 1. inheritance -- 遗传 --> whatever in the patent class, will happen to child class.
        // extends keywords;
        // 这个是不可逆的 只有父母继承给孩子但孩子无法继承给父母
        // so we can not use the child class method to the parent class
        // 单向继承；
        // 2. encapsulation --> getter / setter , data hiding;
        // for get the data we have to use getter/ setter ;
        // getter method ---> is the return method;
        // setter method ---> is the void method ;
        // use this keyword to set the data;
        // 3.abstraction --> no object creation
        // it cannot create obj use the parent class;
        // --> abstract class -- abstract keyword;
        // --> abstract method  -- abstract keyword;
        // >>>> interface --> eatebels
        //                        |
        //                      Animal
        //                       /   \
        //                 Rabbit    Makaka
        // interface is same level with class
        //  we cannot said interface is class so interface is for abstract method
        //  in interface wo cannot create regular method ;
        // 4. polymorphism --> reference type is patent class, object type is child class ;
        // Animal a = new Rabbit();
        //  1. static poly --> overloading
        //	2. Dynamic poly --> overRiding --> static cannot overriding;




        String color;
        private  String name;
        int age;
        String food;

        // action --> method
    public void run(){
        System.out.println("parent class is running");
    }
    public void work(){
        System.out.println("parent is working");
    }
     public void  speak (){
         System.out.println("parent class is Speaking ");
     }


}
