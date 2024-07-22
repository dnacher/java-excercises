package topics.forkJoinPool;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Daniel Nacher
 * 2024-07-22
 *
 * ForkJoinPool es una clase en Java que se utiliza para implementar la programación de tareas paralelas y asíncronas.
 * La clase se basa en la técnica de "Divide y Vencerás" para dividir una tarea en tareas más pequeñas y ejecutarlas en
 * paralelo en hilos separados, utilizando todos los núcleos disponibles en el procesador.
 *
 * ForkJoinPool se utiliza en aplicaciones que requieren el procesamiento de grandes cantidades de datos en paralelo,
 * como la ordenación de grandes arreglos de datos, la suma de grandes colecciones de números, la multiplicación de
 * matrices, entre otros.
 *
 * ForkJoinPool es capaz de realizar una tarea de manera más eficiente que los hilos regulares de Java, ya que utiliza
 * una cola de trabajo y una técnica de robo de trabajo para asignar tareas a los hilos disponibles. Los hilos se
 * mantienen ocupados ejecutando tareas hasta que no hay más trabajo disponible para realizar, y luego roban tareas de
 * la cola de trabajo de otros hilos que aún tienen tareas pendientes.
 *
 * Para utilizar ForkJoinPool, se debe extender la clase RecursiveTask o RecursiveAction, que son clases abstractas que
 * representan tareas que pueden dividirse en tareas más pequeñas y que se pueden ejecutar en paralelo. Las tareas se
 * dividen en tareas más pequeñas utilizando el método compute() y se realizan en paralelo utilizando el método invoke()
 * de ForkJoinPool.
 */
public class ForkJoinPoolTopic extends RecursiveTask<Long> {

    private static final int THRESHOLD = 10000;
    private List<Long> list;
    private int start;
    private int end;

    public ForkJoinPoolTopic(List<Long> list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }

    protected Long compute() {
        if (end - start <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += list.get(i);
            }
            return sum;
        } else {
            int mid = start + (end - start) / 2;
            ForkJoinPoolTopic left = new ForkJoinPoolTopic(list, start, mid);
            ForkJoinPoolTopic right = new ForkJoinPoolTopic(list, mid, end);
            left.fork();
            long rightResult = right.compute();
            long leftResult = left.join();
            return leftResult + rightResult;
        }
    }

    /**
    *
     * En este ejemplo, se define la clase ForkJoinPoolTopic que extiende la clase RecursiveTask y representa la
     * tarea de sumar los elementos de una lista de números. La tarea se divide en tareas más pequeñas si la cantidad de
     * elementos en la lista supera el valor del umbral THRESHOLD. Se utiliza el método fork() para dividir la tarea en
     * tareas más pequeñas.
    * */
    public static void main(String[] args) {
        List<Long> list = Arrays.asList(1L,2L,3L,4L,5L,6L,7L,8L,9L,10L);
        ForkJoinPool pool = new ForkJoinPool();
        long sum = pool.invoke(new ForkJoinPoolTopic(list, 0, list.size()));
        System.out.println(sum);
    }

}
