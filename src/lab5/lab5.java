package Lab5;

import java.util.List;

public class Lab5<T extends Comparable<T>> {
    public T minElement(int begin, int end, List<T> list) {
        if (end < begin || begin < 0 || end > list.size()) {
            throw new IllegalArgumentException();
        } 
        else {

            T minelement = list.get(begin);

            for (int i = begin + 1; i < end; i++) {
                
                if (list.get(i).compareTo(minelement) < 0) {
                    minelement = list.get(i);
                }
            }

            return minelement;
        }
    }
}
