package StackCreation;

import java.util.Arrays;

public class StackHelper {
    private int arrsize;
    private int stackpointer=0;
    private int[] arr;
    //constructor overriding
    //we are finding array size by using length method of array class
    //so the constructor only reqires the array to be passed to it and not its's size alse
    public StackHelper(int arr[]){
        this.arrsize=arr.length;
        this.arr=new int[arrsize];
    }

    public void insert(int value) {
        if (stackpointer < arrsize) {
            this.arr[stackpointer] = value;
            stackpointer++;
        }
        else{
            System.out.println("stack full already");
        }
    }

    //pop method doesnt actually removes element from array, it just returns the last value and decreases the value of  stackpointer
    public int pop(){
        if(stackpointer!=0){
            stackpointer--;
            return arr[stackpointer];
        }
        else{
            System.out.println("stack empty");
            return '\0';
        }
    }
    //returns the index at which the value is found else prints the message
    public int search(int a){
        for (int i = 0; i < stackpointer; i++) {
            if(arr[i]==a){
                return i;
            }
        }
        System.out.println("value not found in stack");
        return '\0';
    }

    public int getArrsize() {
        return arrsize;
    }

    public int getStackpointer() {
        return stackpointer;
    }

    public void setArrsize(int arrsize) {
        this.arrsize = arrsize;
    }

    public void setStackpointer(int stacksize) {
        this.stackpointer = stacksize;
    }

    @Override
    public String toString() {
        return "StackHelper{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

}
