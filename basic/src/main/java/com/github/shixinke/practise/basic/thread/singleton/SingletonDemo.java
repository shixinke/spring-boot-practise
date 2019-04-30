package com.github.shixinke.practise.basic.thread.singleton;



/**
 * 单例模式演示(多线程版)
 * @author shixinke
 */
public class SingletonDemo {

    /*public static void singleThread() {
        HungrySingleton obj1 = HungrySingleton.getInstance();
        HungrySingleton obj2 = HungrySingleton.getInstance();
        System.out.println(obj1 == obj2);
    }

    public static void multiThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                HungrySingleton.getInstance();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                HungrySingleton.getInstance();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                HungrySingleton.getInstance();
            }
        }).start();
    }


    public static void main(String[] args) {
        //singleThread();
        multiThread();
    }*/

   /* public static void singleThread() {
        LazySingleton obj1 = LazySingleton.getInstance();
        LazySingleton obj2 = LazySingleton.getInstance();
        System.out.println(obj1 == obj2);
    }

    public static void multiThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton.getInstance();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton.getInstance();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton.getInstance();
            }
        }).start();
    }


    public static void main(String[] args) {
        //singleThread();
        multiThread();
    }*/

   /* public static void singleThread() {
        SynchronizedSingleton obj1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton obj2 = SynchronizedSingleton.getInstance();
        System.out.println(obj1 == obj2);
    }

    public static void multiThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedSingleton.getInstance();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedSingleton.getInstance();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedSingleton.getInstance();
            }
        }).start();
    }


    public static void main(String[] args) {
        //singleThread();
        multiThread();
    }*/

    public static void singleThread() {
        SynchronizedMethodSingleton obj1 = SynchronizedMethodSingleton.getInstance();
        SynchronizedMethodSingleton obj2 = SynchronizedMethodSingleton.getInstance();
        System.out.println(obj1 == obj2);
    }

    public static void multiThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedMethodSingleton.getInstance();
            }
        }).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedMethodSingleton.getInstance();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedMethodSingleton.getInstance();
            }
        }).start();
    }


    public static void main(String[] args) {
        //singleThread();
        multiThread();
    }
}



