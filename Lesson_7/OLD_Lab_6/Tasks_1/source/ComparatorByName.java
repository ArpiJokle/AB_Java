import java.util.Comparator;

public class ComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}