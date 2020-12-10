package com.company;

interface Interface {
    public static final int a=0;
    abstract void pika();
    public static void name() {

    }

}
interface Interface1 extends Interface{


}
class Aastha implements Interface{


    @Override
    public void pika() {

        System.out.println("lklhjjhv");
    }

    public static void main(String[] args) {
        //Interface obj= new Interface();
        Aastha obj1= new Aastha();
        int a=9;
        System.out.println(a);
        obj1.pika();

    }
}
