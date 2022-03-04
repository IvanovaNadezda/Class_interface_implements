package com.company;

public interface Animal {

    String speak();

}
class Cat implements Animal{

   public String speak() {
        return null;
    }
}

class Dog implements Animal{
    public String speak(){
        return "Gav";
    }
}