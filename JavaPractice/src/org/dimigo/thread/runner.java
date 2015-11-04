package org.dimigo.thread;

class runner extends Thread {
    private String name;

    public runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " 출발");
            for (int dist = 100; dist >= 0; dist -= 10) {
                System.out.printf("%s %d 미터\n", name, dist);
                sleep(1000);
            }
            System.out.println(name + " 골인");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
} 
