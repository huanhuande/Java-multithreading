/**继承Thread类
 * Created by pc06 on 2017/8/9.
 */
public class run {
    public static void main(String[] args){
        try {
            MyThread thread=new MyThread();
            thread.setName("myThread");
            thread.start();

            for (int i=0;i<10;i++){
                int time=(int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }



    }
}
