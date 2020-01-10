package StackCreation;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size the array");
        int a=s.nextInt();
        int[] arr=new int[a];
        StackHelper sh=new StackHelper(arr);
        sh.insert(10);
        sh.insert(20);
        sh.insert(30);
        System.out.println(sh.pop()+"  "+sh.pop()+"  "+sh.pop());

    }
}
