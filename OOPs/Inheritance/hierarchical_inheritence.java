package OOPs;

public class hierarchical_inheritence {
    public static void main(String[] args) {
        customer c1 = new customer();
        c1.setData("kunal",20);
        c1.display();

        employee e1 = new employee();
        e1.setData("parth",22);
        e1.display();
    }
}

class person{
    String name;
    int age;

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class customer extends person{

}

class employee extends person{

}
