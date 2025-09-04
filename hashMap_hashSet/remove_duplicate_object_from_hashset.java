package hashMap_hashSet;

import java.util.HashSet;
import java.util.Objects;

public class remove_duplicate_object_from_hashset {
    public static void main(String[] args) {
        HashSet<student> hashSet = new HashSet<>();
        hashSet.add(new student(1,"kunal"));
        hashSet.add(new student(2,"jay"));
        hashSet.add(new student(3,"parth"));
        hashSet.add(new student(1,"kunal"));

        System.out.println(hashSet.size());
    }
}

class student {
    int r_no;
    String name;

    public student(int r_no, String name) {
        this.r_no = r_no;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return r_no == student.r_no && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r_no, name);
    }
}