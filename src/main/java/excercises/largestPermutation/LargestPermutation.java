package excercises.largestPermutation;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Daniel Nacher
 * 2024-11-18
 */
public class LargestPermutation {

    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        int n = arr.size();
        // Mapeo para encontrar índices de manera eficiente
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            valueToIndex.put(arr.get(i), i);
        }

        int swaps = 0;
        for (int i = 0; i < n && swaps < k; i++) {
            // Valor deseado en la posición actual
            int expectedValue = n - i;

            // Si el valor actual ya es el máximo, continuar
            if (arr.get(i) == expectedValue) {
                continue;
            }

            // Obtener el índice del valor esperado
            int idxToSwap = valueToIndex.get(expectedValue);

            // Realizar el intercambio
            valueToIndex.put(arr.get(i), idxToSwap);
            valueToIndex.put(expectedValue, i);
            Collections.swap(arr, i, idxToSwap);

            swaps++;
        }

        return arr;
    }

}
