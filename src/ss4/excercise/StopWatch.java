package ss4.excercise;

import javafx.scene.paint.Stop;

public class StopWatch {
    private long startTime = 0;
    private long endTime = 0;
    private boolean running = false;


    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (endTime - startTime);
        }
        return elapsed;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.setStartTime();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 100000; j++) {
                for (int k = 0; k < 100000; k++) {
                    long a = k * 2;
                }
            }
        }
        stopWatch.setEndTime();
        System.out.println(stopWatch.getElapsedTime());
    }
}

