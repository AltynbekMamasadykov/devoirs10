package peaksoft;

public class Camel implements Animal{
    @Override
    public void animalPlus() {
        System.out.println("Can stay long without water");
    }

    @Override
    public void animalMinus() {
        System.out.println("moves very slowly");
    }
}
