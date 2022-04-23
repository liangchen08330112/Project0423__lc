package cn.edu.sict;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //引入扫描器
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数（1-50）：");
        //接受用户收入
        int num = scanner.nextInt();
        //1到50之间，符合要求，打印星号
        if(num>=1&&num<=50){
            for (int i=0;i<num;i++) {
                System.out.print("*");
            }
            //不符合要求，提示错误
        }else{
            System.out.println("输入错误！");
        }
    }
}
