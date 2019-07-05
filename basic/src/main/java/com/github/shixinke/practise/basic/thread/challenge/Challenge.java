package com.github.shixinke.practise.basic.thread.challenge;

import java.util.concurrent.Executor;

public class Challenge implements Runnable {

   private int stock = 10;

    @Override
    public void run() {
        if (stock > 0) {
            System.out.println(Thread.currentThread().getName() + "拿到库存:" + stock);
            stock --;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        new Thread(challenge).start();

        new Thread(challenge).start();
        new Thread(challenge).start();
        new Thread(challenge).start();
        new Thread(challenge).start();
        new Thread(challenge).start();
        new Thread(challenge).start();
        new Thread(challenge).start();
        new Thread(challenge).start();
        new Thread(challenge).start();
        new Thread(challenge).start();
        new Thread(challenge).start();
        new Thread(challenge).start();
        new Thread(challenge).start();
        new Thread(challenge).start();
    }
}
