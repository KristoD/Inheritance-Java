public class Human extends Mammal {
    public void goToWork() {
        System.out.println("I'm going to work only shit humans can do");
    }

    public void startSleeping() {
        System.out.println("Toss and turn");
        super.startSleeping();
    }
}