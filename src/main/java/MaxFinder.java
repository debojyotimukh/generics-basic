public class MaxFinder<T extends Comparable<T>> {

    public T findMax(T a,T b,T c){
        if(a.compareTo(b)>0&&a.compareTo(c)>0 )
            return a;
        if(b.compareTo(a)>0&&b.compareTo(c)>0)
            return b;
        return c;
    }
}
