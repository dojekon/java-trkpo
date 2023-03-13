package Lab4;

import java.util.List;

public class Lab4<T> {
    public List<T> swap(int i, int j, List<T> list) {
        List<T> resultList = list;

        T tmp = resultList.get(i);
        resultList.set(i, resultList.get(j));
        resultList.set(j, tmp);

        return resultList;
    }
}
