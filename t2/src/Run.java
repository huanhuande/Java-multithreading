/**
 * Created by pc06 on 2017/8/9.
 */
public class Run {
    public static void main(String[] args){
        Runnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("运行结束");
    }
}
