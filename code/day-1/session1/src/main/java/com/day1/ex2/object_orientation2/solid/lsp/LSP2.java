package com.day1.ex2.object_orientation2.solid.lsp;
class Rectangle{
    private  int l, b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getArea(){
        return l*b;
    }
}
class Square {

}
public class LSP2 {
    public static void main(String[] args) {
      
    }
}
