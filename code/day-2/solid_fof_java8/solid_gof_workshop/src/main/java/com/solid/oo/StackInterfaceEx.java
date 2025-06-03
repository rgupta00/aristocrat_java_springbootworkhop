package com.solid.oo;
//why interface: contract bw two parties
//sr engg -> ravi , kapil
interface Stack{
    public void push(int element);
    public int pop();
}
class StackImpUsingRavi implements Stack{
    private int x[];
    private final int SIZE;
    private int top;

    public StackImpUsingRavi(int size) {
        this.SIZE=size;
        this.x=new int[SIZE];
        top=-1;

    }
    public void push(int element){
        if(top>=SIZE)
            return ;
        else
            x[top++]=element;
    }


    public int pop(){
        if(top==-1)
            return -99;
        else
            return x[top--];
    }
}
class StackImpUsingKapil implements Stack {
    private int x[];
    private final int SIZE;
    private int top;

    public StackImpUsingKapil(int size) {
        this.SIZE=size;
        this.x=new int[SIZE];
        top=-1;

    }
    public void push(int element){
        if(top>=SIZE)
            return ;
        else
            x[top++]=element;
    }


    public int pop(){
        if(top==-1)
            return -99;
        else
            return x[top--];
    }
}
//me
public class StackInterfaceEx {
    public static void main(String[] args) {
        //good coder must be lazy!
        Stack stack=new StackImpUsingRavi(5);;

        stackOperation(stack);
    }

    private static void stackOperation(Stack stack) {

         stack.push(11);
        System.out.println( stack.pop());
    }
}
