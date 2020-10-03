import java.util.Arrays;
import java.util.Comparator;

public class MaxFinder<T extends Comparable<T>> {

    @SafeVarargs
    public final T findMax(T... params) {
        Arrays.sort(params, Comparator.reverseOrder());
        printMax(params[0]);
        return params[0];
    }

    public final void printMax(T max) {
        System.out.println("Maximum is: " + max.toString());
    }

    public static void main(String[] args) {
        MaxFinder<Integer> maxFinder = new MaxFinder<>();
        maxFinder.findMax(6, 3, 2, 6, 4);
    }

}


