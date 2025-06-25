package array.arrayList;

import java.util.ArrayList;

public class simple {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        // Specific index pe add
        list.add(1, 15); // index 1 pe 15 insert hoga

        // get value
        System.out.println(list.get(2));

        // remove element
        list.remove(1);

        // find size
        System.out.println(list.size());

        // check number array me he ya nahi
        System.out.println(list.contains(30));

        for (int num : list){
            System.out.print(num + " ");
        }
    }
}
