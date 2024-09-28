package labexps;

public class five {
    public static void main(String[] args) {
        MyThread a = new MyThread();
        a.name = 'a';
        // a.a();
        a.start();

        MyThread b = new MyThread();
        b.name = 'b';
        // b.a();
        b.start();
    }
}

class MyThread extends Thread{
    char name;
    public void run(){
        System.out.println("[new thread running]");

        try{
            for(int i=0;i<10;i++){
                System.out.println(name+": "+(i+1));
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            
        }
    }
    public void a(){
        for(int i=0;i<10;i++){
            System.out.println(name+": "+i);
            // Thread.sleep(1000);
        }
    }
}

