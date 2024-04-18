package org.example.thread;

public class ThreadX extends Thread{

    private String threadName;

    public ThreadX(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        // Xử lý logic của luồng ở đây
        for (int i = 0; i < 5; i++) {
            System.out.println("Luồng " + threadName + " đang chạy. Giá trị của i: " + i);
            try {
                Thread.sleep(2000); // Ngủ 1 giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Luồng " + threadName + " đã kết thúc.");
    }

    public static void main(String[] args) {
        ThreadX threadX = new ThreadX("Minh");
        ThreadX threadX1 = new ThreadX("Minh2");

        threadX.start();
        threadX1.start();

        // Khoi tao va goi phuong thuc start nhung Thread co the chua start ngay lap tuc

        System.out.println(threadX.getName());
        System.out.println(threadX.getPriority());
        System.out.println(threadX.getState());

        System.out.println("ThreadX1's name: " + threadX1.getName());
        System.out.println("ThreadX1's priority: "+ threadX1.getPriority());
        System.out.println("ThreadX1's state: "+ threadX1.getState());

//        threadX.interrupt();
        System.out.println("ThreadX: "+ threadX.isInterrupted());
        System.out.println("ThreadX1: "+ threadX1.isInterrupted());
    }
}
