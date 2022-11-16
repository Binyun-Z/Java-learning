import java.net.SocketTimeoutException;

/**
 * @Package : PACKAGE_NAME
 * @Author : Binyun
 * @Date : 2022-11-16 10:39
 * @Desc :
 */
public class HelloWorld {
     public static void main(String[] args) {
         System.out.println("hello world");
         byte a = 100;
         short b = 1000;
         int c = 10000;
         long d = 10000L;
         float e = 1.1f;
         double f = 1.2;
         char name = 'e';

    //     int——>Integer
         int i = 13;
         Integer integer = Integer.valueOf(i);

         Integer integer1 = 10;
         int j = integer1.intValue();
    //     其他的类型转换类似上述方法

    //     boolean ——>Boolean
         Boolean abool = new Boolean(true);

    //      进制
         int x= 10;
         int x2 = 010;
         int x3 = 0x10;

         System.out.println(x);
         System.out.println((x2));
         System.out.println((x3));

         System.out.println("==============================");
    //     浮点数拓展？银行业务如何表示
    //     float:
    //     double:
    //     避免浮点数比较
    //     因为浮点数是有限的、离散的、具有舍入误差的、一般会存在接近但不等于的问题
    //     因此在银行业务中使用BigDecimal在这个类进行数据操作
         float f1 = 0.1f;
         double d1 = 1.0/10;
         System.out.println(f1==d1);
         System.out.println(f1);
         System.out.println((d1));

         char c11 = 'a';
         System.out.println(c11);
         System.out.println((int)c11);

         char c22 = '中';
         System.out.println(c22);
         System.out.println((int)c22);

    //     转义字符
    //     \t \n
         System.out.println("hello\tWorld");

         boolean flag = true;
         if(flag==true){
             System.out.println("true");
         }




    }
}
