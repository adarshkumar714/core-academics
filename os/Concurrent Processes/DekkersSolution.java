public class DekkersSolution {
    static int favouredThread = 1;
    static boolean thread1WantsToEnter = false;
    static boolean thread2WantsToEnter = false;
    static boolean completed = false; // Declaration of the shared variable

    public static void main(String[] args) {
        startThreads();
    }

    static void startThreads() {
        Thread thread1 = new Thread(() -> Thread1());
        Thread thread2 = new Thread(() -> Thread2());

        thread1.start();
        thread2.start();
    }

    static void Thread1() {
        do {
            thread1WantsToEnter = true;
            while (thread2WantsToEnter) {
                System.out.println("thread 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (favouredThread == 2) {
                    thread1WantsToEnter = false;
                    while (favouredThread == 2);
                    thread1WantsToEnter = true;
                }
            }
            favouredThread = 2;
            thread1WantsToEnter = false;
        } while (!completed);
    }

    static void Thread2() {
        do {
            thread2WantsToEnter = true;
            while (thread1WantsToEnter) {
                System.out.println("thread 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (favouredThread == 1) {
                    thread2WantsToEnter = false;
                    while (favouredThread == 1);
                    thread2WantsToEnter = true;
                }
            }
            favouredThread = 1;
            thread2WantsToEnter = false;
        } while (!completed);
    }
}
