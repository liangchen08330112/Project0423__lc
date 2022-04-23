package cn.edu.sict;

public class Test01 {
    public static void main(String[] args){
        //初始化两个变量值，一个是具体的数，另一个是符合条件的个数
        int count=0, n=0;
            for(int i=1;i<5;i++){
                //循环的嵌套
                for(int j=1;j<5;j++){
                    //如果j=i，跳出当前循环，进入下一个程序
                    if(j==i) {
                        continue;
                    }
                    //再次循环嵌套。
                    for(int k=1;k<5;k++){
                        //如果k不等于i也不等于j
                        if(k!=i&&k!=j){
                            //运算
                            n = i*100+j*10+k;
                            System.out.print(n+" ");
                            //符合条件，个数自增，每五个为一行
                            if((++count)%5==0) {
                                System.out.println();
                            }
                        }
                    }
                }
            }
            //输出最终结果
            System.out.println("共"+count+"个");
        }
}
