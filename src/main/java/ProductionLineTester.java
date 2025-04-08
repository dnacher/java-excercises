import java.util.stream.Stream;

/**
 * Daniel Nacher
 * 2024-12-30
 */
public class ProductionLineTester {
    private final ProductVerifier verifier;

    ProductionLineTester(ProductVerifier verifier) {
        this.verifier = verifier;
    }

    ProductLineTestReport test(Stream<Product> products) {
        if (products == null) {
            return new ProductLineTestReport(0, 0, 0, 0);
        }

        long[] counters = new long[4]; // [correctCounter, checkedExcCounter, uncheckedExcCounter, otherExcCounter]

        products
                .filter(product -> product != null) // Filtrar valores nulos
                .filter(product -> product.getStatus() != null && !product.getStatus().equalsIgnoreCase("invalid")) // Filtrar status "invalid"
                .skip(10) // Ignorar los primeros 10 productos
                .limit(20) // Limitar a 20 productos
                .forEach(product -> {
                    try {
                        verifier.verify(product);
                        counters[0]++; // Incrementar correctCounter
                    } catch (RuntimeException e) {
                        counters[2]++; // Incrementar uncheckedExcCounter
                    } catch (Exception e) {
                        counters[1]++; // Incrementar checkedExcCounter
                    } catch (Error e) {
                        counters[3]++; // Incrementar otherExcCounter
                    }
                });

        return new ProductLineTestReport(counters[0], counters[1], counters[2], counters[3]);
    }
}

interface ProductVerifier {
    void verify(Product product) throws Exception;
}

class Product {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class ProductLineTestReport {
    long correctCounter;
    long checkedExcCounter;
    long uncheckedExcCounter;
    long otherExcCounter;

    ProductLineTestReport(long correctCounter, long checkedExcCounter, long uncheckedExcCounter, long otherExcCounter) {
        this.correctCounter = correctCounter;
        this.checkedExcCounter = checkedExcCounter;
        this.uncheckedExcCounter = uncheckedExcCounter;
        this.otherExcCounter = otherExcCounter;
    }
}

