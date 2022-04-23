package cn.edu.sict;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        //引入扫描器
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        //接受用户输入
        String string = scanner.next();
        //输出字符串长度值。
        System.out.println(getLength(string));
    }
    //定义一个getLength方法获取字符串长度（int类型）
    public static int getLength(String a){
        int length = a.length();
        return length;
    }
}
