package dev.alexengrig.designpatterns.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SingletonMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        executorService.execute(() -> SingletonByDoubleCheck.getInstance().print("Double check is power!"));
        executorService.execute(() -> SingletonByDoubleCheck.getInstance().print("Double check is super!"));
        executorService.execute(() -> SingletonByHolder.getInstance().print("Holder is power!"));
        executorService.execute(() -> SingletonByHolder.getInstance().print("Holder is super!"));
        executorService.execute(() -> SingletonByEnum.INSTANCE.print("Enum is power!"));
        executorService.execute(() -> SingletonByEnum.INSTANCE.print("Enum is super!"));
        executorService.shutdown();
        if (!executorService.awaitTermination(3, TimeUnit.SECONDS)) {
            executorService.shutdownNow();
        }
    }
}
