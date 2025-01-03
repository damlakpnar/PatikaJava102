public class NoteBook extends Product{
    private int ram;
    private int depolama;
    private double screenSize;

    public NoteBook(int id, String name, double price, double discountRate, int stock, Brand brand, int ram, int storage, double screenSize){
        super(id, name, price, discountRate, stock, brand);
        this.ram=ram;
        this.depolama=depolama;
        this.screenSize=screenSize;
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

    @Override
    public String toString(){
        return super.toString() + String.format(" %-8d GB | %-9.1f\" | %-2d GB |", depolama, screenSize, ram);

    }

}
