package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface<T>  {
    @Override
    public String toString() {
        return ""+
                 group ;
    }

    List<T> group;
    public Group() {
        this.group = new ArrayList<>();
    }

    public Integer count() {

        return Math.toIntExact(this.group.stream().count());
    }



    public void insert(T value) {
        this.group.add(value);
    }

    public Boolean has(T value) {

        return this.group.contains(value);
    }

    public T fetch(int indexOfValue) {

        return this.group.get(indexOfValue);
    }





    public void delete(T value) {
        this.group.remove(value);
    }

    public void clear() {
        this.group.clear();
    }

    public Iterator<T> iterator() {

        return group.iterator();
    }
}
