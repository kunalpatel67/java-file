package OOPs;

public class single_inheritence {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.run();
        d1.eat();
    }
}

class animal{
    public void eat(){
        System.out.println("Animal eat food");
    }
}

class dog extends animal{
    public void run(){
        System.out.println("Dog run fast");
    }
}