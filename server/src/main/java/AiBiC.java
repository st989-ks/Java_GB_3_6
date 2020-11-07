

public class AiBiC {
    static Object mon = new Object();
    static volatile int seqNum = 1;
    static final int num = 5;

    public static void main(String[] args) {
        new Thread( () -> {
            try {
                for (int i = 0; i < num; i++) {
                    synchronized (mon) {
                        while (seqNum != 1) {
                            mon.wait();
                        }
                        System.out.print( "A" );
                        seqNum = 2;
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } ).start();

        new Thread( () -> {
            try {
                for (int i = 0; i < num; i++) {
                    synchronized (mon) {
                        while (seqNum != 2) {
                            mon.wait();
                        }
                        System.out.print( "B" );
                        seqNum = 3;
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } ).start();

        new Thread( () -> {
            try {
                for (int i = 0; i < num; i++) {
                    synchronized (mon) {
                        while (seqNum != 3) {
                            mon.wait();
                        }
                        System.out.print( "C" );
                        seqNum = 1;
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } ).start();
    }
}
