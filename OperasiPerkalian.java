package Modul5;

public class OperasiPerkalian extends OperasiBilangan{
       protected void setA(double a){
        this.a=a;
    }
    protected void setB(double b){
        this.b=b;
    }
    protected void setC(){
        this.c=a*b;
    }
    protected double getA(){
        return a;
    }
    protected double getB(){
        return b;
    }
    protected double getC(){
        return c;
    }
    protected void tampil(){
        System.out.println("nilai "+a+ " * " + "Nilai "+b+" = "+ getC());
    }
}
