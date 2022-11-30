public class Coche {
    private int puertas;

    public Coche(int door) {
        this.puertas = door;
    }

    public void addOneDoor() {
        this.puertas = this.puertas + 1;
    }

    public int getPuertas() {
        return this.puertas;
    }
}
