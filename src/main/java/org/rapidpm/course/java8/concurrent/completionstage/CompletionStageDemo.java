package org.rapidpm.course.java8.concurrent.completionstage;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

/**
 * Created by ts40 on 05.03.14.
 */
public class CompletionStageDemo {


    public static void main(String[] args) {
        final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);

        Supplier<String> task = ()-> "das Ergebnis";

            final CompletableFuture<String> future
                    = CompletableFuture.supplyAsync(task, fixedThreadPool);
            final CompletableFuture<Void> accept = future
                    .thenAccept(System.out::println);
        try {
            final Void aVoid = accept.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


    }
}
