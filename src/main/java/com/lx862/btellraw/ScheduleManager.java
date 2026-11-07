package com.lx862.btellraw;

import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private static final List<ScheduledTask> scheduledTasks = new ArrayList<>();
    private static int tick = 0;

    public static void submit(Runnable runnable, int tickDelay) {
        scheduledTasks.add(new ScheduledTask(tick+tickDelay, runnable));
    }

    public static void tick() {
        tick++;
        scheduledTasks.removeIf(task -> {
            boolean shouldRun = tick >= task.tickToRun();
            if(shouldRun) task.runnable.run();
            return shouldRun;
        });
    }

    public record ScheduledTask(int tickToRun, Runnable runnable) {}
}
