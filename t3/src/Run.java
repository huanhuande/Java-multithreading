/**
 * Created by pc06 on 2017/8/9.
 */
public class Run {
    public static void main (String[] args){
        MyThread a=new MyThread("A");
        MyThread b=new MyThread("B");
        MyThread c=new MyThread("C");
        a.start();
        b.start();
        c.start();

    }
}
