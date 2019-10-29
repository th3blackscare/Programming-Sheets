package com.company;

public class Main {
    public static void main(String[] args){
        intStack s = new IntArrayStack();
        for(int i = 0;i<9;i++){
            s.push(i);
        }
        System.out.print("Top: "+s.peek()+"\nStack Size: "+s.size());

    }
}
