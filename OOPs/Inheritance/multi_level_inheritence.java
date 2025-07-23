package OOPs;

public class multi_level_inheritence {
    public static void main(String[] args) {
        parrotBaby p1 = new parrotBaby();
        p1.fly();
        p1.cry();
        p1.speak();
    }
}

class bird{
    public void fly(){
        System.out.println("bird can fly");
    }
}

class parrot extends bird{
    public void speak(){
        System.out.println("parrot can speak");
    }
}

class parrotBaby extends parrot{
    public void cry(){
        System.out.println("Parrot baby cry");
    }
}