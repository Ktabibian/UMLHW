package hwtwo;

public class PC {
    private Case aCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PC(Case aCase, MotherBoard motherBoard, Monitor monitor) {
        this.aCase = aCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    public Case getaCase() {
        return aCase;
    }

    public void setaCase(Case aCase) {
        this.aCase = aCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PC{" + "aCase=" + aCase + ", motherBoard=" + motherBoard + ", monitor=" + monitor + '}';
    }

    private void drawLogo(){
        monitor.drawPixel(5, 7, "red");
    }

    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc sale today\n" + aCase + monitor + motherBoard);
    }

    public void powerUp(){
        aCase.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("Windows XP");
    }
}
