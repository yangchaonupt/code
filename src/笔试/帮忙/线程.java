package ±  ‘.∞Ô√¶;

public class œﬂ≥Ã {
    static final Object object = new Object();
    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            String a[] = {"A","B","A","B","A","B"};
            @Override
            public void run() {
                for(int i=0;i< 6 ;i++){
                    synchronized (object){
                        object.notify();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print(a[i]+":");
                        object.notify();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            int a[] = {1,1,2,2,3,3};
            @Override
            public void run() {
                for(int i=0;i<6;i++){
                    synchronized (object){
                        object.notify();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print(a[i]+" ");
                    }
                }

            }
        }).start();
    }
}
