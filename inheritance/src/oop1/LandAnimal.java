package oop1;

public class LandAnimal extends Animal{
    @Override
    String move() {
        return "Swings on trees";
    }


    public static void main(String[] args) {

        LandAnimal lion = new LandAnimal();
        LandAnimal monkey = new LandAnimal();
        monkey.name "Monkey";
        System.out.println (monkey.name+" " monkey.move());

    }
}
