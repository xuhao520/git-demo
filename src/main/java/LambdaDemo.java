/**
 * @author xuhao
 * @date 2022/5/28-13:07
 */
public class LambdaDemo {
    public static void main(String[] args) {
       /* Myrunnable myrunnable = new Myrunnable();
        Thread t1=new Thread(myrunnable);
        Thread t2=new Thread(myrunnable);
        Thread t3 = new Thread(myrunnable);
        */
      /* new Thread(()->{
           System.out.println("多线程启动了");
       }).start();*/
      test1((x,y)->x+y);
//      test2((s)-> System.out.println(s));
        test2(System.out::println);

    }
    public static void test1(InterfaceA ia){
        System.out.println(ia.sum(10,20));
    }

    public static void test2(InterfaceB ib) {
        ib.fly("hello");
    }
}
