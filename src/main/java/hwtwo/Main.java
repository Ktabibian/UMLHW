package hwtwo;

public class Main {
    public static void main(String[] args) {
        Dimension dimensions = new Dimension(6, 10, 8);
        Resolution res = new Resolution(4, 3);
        Case myCase = new Case("winston", "dell", "hamster wheel", dimensions);
        Monitor myMonitor = new Monitor(res, "asus", "acer");
        MotherBoard board = new MotherBoard("5x3500", "ryzen", "biors", 6, 2);
        PC computer = new PC(myCase, board, myMonitor);

        computer.description();

        computer.powerUp();
    }
}
