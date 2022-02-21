package com.company;

public class SelectIce {
    int ice;
    public SelectIce(int ice){
        this.ice=ice;
    }
    public SelectIce(){
        this(0);
    }
    public static void main(String[]args){
        SelectIce ice1=new SelectIce(3);
        System.out.println(ice1.ice);
        SelectIce ice2=new SelectIce();
        System.out.println(ice2.ice);
    }
}
