/**
 * Created by pc06 on 2017/8/9.
 */
public class MyThread extends Thread{
    public void run(){
       try {
           for (int i=0;i<10;i++){
               int time=(int) (Math.random()*1000);
               Thread.sleep(time);
               System.out.println("run="+Thread.currentThread().getName());
           }
       }catch (InterruptedException e){
           e.printStackTrace();
       }
    }
}
