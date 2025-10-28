import core.PC;
import maincomponent.*;
import storage.*;
import peripheral.*;

public class Main {
    public static void main(String[] args) {
        PC myPc = new PC();

        // === Komponen Utama (Composition) ===
        myPc.addComponent(new Motherboard("ASUS Prime B450", 120.0));
        myPc.addComponent(new CPU("Ryzen 5 3600", 200.0));
        myPc.addComponent(new RAM("Corsair Vengeance 16GB", 80.0));

        // === Komponen Penyimpanan (Aggregation) ===
        myPc.addComponent(new SSD("Samsung 970 EVO 1TB", 130.0));
        myPc.addComponent(new Flashdisk("SanDisk Ultra 64GB", 20.0));

        // === Periferal (Aggregation, Opsional) ===
        myPc.addComponent(new Mouse("Logitech G102", 25.0));
        myPc.addComponent(new Keyboard("Keychron K6", 75.0));
        myPc.addComponent(new Monitor("Dell 24\"", 150.0));

        System.out.println(myPc);
    }
}
