public class Phone extends Product{
    private int ram;
    private int depolama;
    private double screenSize;
    private int pilGücü;
    private String color;

    public Phone(int id, String name, double price, double discountRate, int stock, Brand brand, int ram, int depolama, double screenSize, int pilGücü, String color) {
        super(id, name, price, discountRate, stock, brand);
        this.ram = ram;
        this.depolama = depolama;
        this.screenSize = screenSize;
        this.pilGücü = pilGücü;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDepolama() {
        return depolama;
    }

    public void setDepolama(int depolama) {
        this.depolama = depolama;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getPilGücü() {
        return pilGücü;
    }

    public void setPilGücü(int pilGücü) {
        this.pilGücü = pilGücü;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" %-7d GB | %-9.1f\" | %-4d mAh | %-2d GB | %-8s |",
                depolama, screenSize, pilGücü, ram, color);
    }

}
