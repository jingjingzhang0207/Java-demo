package com.company;

interface Addable{
    public void add();
}
interface  Reducible{
    public  void reduce();
}

interface changeable extends Addable , Reducible{
    public void change();
}

class Test implements changeable {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void reduce() {
        System.out.println("reduce");
    }

    @Override
    public void change() {
        System.out.println("change");
    }
}

public class Calculate {
    public static void main(String[] args){
        Test t = new Test();
        t.add();
        t.change();
        t.reduce();
    }

}