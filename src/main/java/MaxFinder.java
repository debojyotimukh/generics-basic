import java.util.Arrays;
import java.util.Comparator;

public class MaxFinder<T extends Comparable<T>> {

    @SafeVarargs
    public final T findMax(T... params){
        Arrays.sort(params, Comparator.reverseOrder());
        return params[0];
    }
}
