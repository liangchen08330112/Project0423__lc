package cn.edu.sict;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数（1-50）：");
        int num = scanner.nextInt();
        if(num>=1&&num<=50){
            for (int i=0;i<num;i++) {
                System.out.print("*");
            }
        }else{
            System.out.println("输入有误，请重新输入。");
        }
    }
}
