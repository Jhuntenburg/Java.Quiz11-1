package rocks.zipcode.io.quiz4.generics;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> extends Group<T> {

    @Override
    public void insert(T value) {
        group.add(value);
        Set<T> set = new TreeSet<>(group);
        group.clear();
        group.addAll(set);




    }

    @Override
    public void delete(T value) {
        Set<T> set = new TreeSet<>(group);
        group.clear();
        group.addAll(set);
        group.remove(value);


    }

    public Integer indexOf(T value) {

        return group.indexOf(value);
    }
}
