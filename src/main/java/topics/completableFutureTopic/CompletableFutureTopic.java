package topics.completableFutureTopic;

import org.testng.annotations.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.testng.Assert.assertEquals;

/**
 * Daniel Nacher
 * 2024-07-22
 *
 * CompletableFuture es una clase que se utiliza para trabajar con operaciones asíncronas y concurrentes.
 * Un CompletableFuture representa un resultado futuro que puede ser completado con un valor o una excepción en
 * algún momento en el futuro.
 *
 * En otras palabras, un CompletableFuture es una promesa que se utilizará para obtener un resultado en algún
 * momento posterior.
 *
 * Los CompletableFuture pueden ser completados de manera manual mediante la invocación de los métodos complete(T value)
 * o completeExceptionally(Throwable ex), o de manera automática mediante la ejecución de una tarea en un hilo separado
 * o en un Executor que se encarga de ejecutar tareas en segundo plano.
 *
 */
public class CompletableFutureTopic {

    public static String completableFutureProcess(String resultValue) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = new CompletableFuture<>();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        System.out.println("starting process");
        executor.submit(() -> {
            future.complete(process(resultValue));
        });
        String page = future.get();
        System.out.println("finish process returning: " + page);
        return page;
    }

    // Los CompletableFuture también permiten encadenar múltiples tareas asíncronas en una secuencia.
    public static String completableFutureCombineProcess(String resultValue, String resultValue2) throws ExecutionException, InterruptedException {
        System.out.println("starting process 1");
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> process(resultValue));
        System.out.println("starting process 2");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> process(resultValue2));

        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (result1, result2) -> result1 + result2);

        String combinedResult = combinedFuture.get();
        System.out.println("finish process returning: " + combinedResult);
        return combinedResult;
    }

    private static String process(String str) {
        try {
            Thread.sleep(3000);
            return str;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Test
    public void completableFutureProcessTest() throws ExecutionException, InterruptedException {
        assertEquals("Processed", completableFutureProcess("Processed"));
    }

    @Test
    public void completableFutureCombineProcessTest() throws ExecutionException, InterruptedException {
        assertEquals("Hello World", completableFutureCombineProcess("Hello", " World"));
    }

}
