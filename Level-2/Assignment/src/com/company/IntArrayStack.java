package com.company;
import java.util.EmptyStackException;
import com.company.intStack;
//import com.sun.org.apache.xml.internal.utils.IntStack;

public class IntArrayStack implements intStack {
    private int top = -1;
    private int[] data;
    private static final int DEFAULT_CAPACITY = 10;
    public IntArrayStack(){
        data = new int[DEFAULT_CAPACITY];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int peek() {
        if(!isEmpty()){
            return data[top];
        }
        else{
            return -1;
        }
    }

    @Override
    public int pop() {
        if (isEmpty())
            throw new EmptyStackException();
        return data[top--];
    }

    public void push(int item){
        if( top == data.length - 1) resize(2 * data.length);
        data[++top] = item;
    }

    @Override
    public int size() {
        return top +1 ;
    }

    private void resize(int newCapacity) {
        int[] newData = new int[newCapacity];
        for(int i = 0 ; i<= top; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

}
