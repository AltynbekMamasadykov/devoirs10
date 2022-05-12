package peaksoft;

public class Horse implements Animal{
    @Override
    public void animalPlus() {
        System.out.println("You can ride horse");
    }

    @Override
    public void animalMinus() {
        System.out.println("Eats a lot");
    }

}
