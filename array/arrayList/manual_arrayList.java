package array.arrayList;

public class manual_arrayList {
    public static void main(String[] args) {
        ArrayList2<Integer> arrayList = new ArrayList2();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.print();

        ArrayList2<String> arrayList2 = new ArrayList2();
        arrayList2.add("kunal");
        arrayList2.add("hitesh");
        arrayList2.add("kirtan");
        arrayList2.add("harsh");
        arrayList2.add("jatin");
        arrayList2.print();
    }
}

class ArrayList2<E> {
    Object[] array = new Object[5];
    int p = 0;

    public void add(E val) {
        if (p == array.length){
            grow();
        }
        array[p] = val;
        p++;
    }

    public void print() {
        for (int i = 0; i < p; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void grow() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}