package hwtwo;

public class MotherBoard {
    private String model, manufacturer, bios;
    private int ramSlots, cardSlots;

    public MotherBoard(String model, String manufacturer, String bios, int ramSlots, int cardSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", bios='" + bios + '\'' +
                ", ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                '}';
    }

    public void loadProgram(String programName){
        System.out.println(programName + " is now running");
    }
}
