import core.PC;
import maincomponent.*;
import peripheral.*;
import storage.*;

public class Main {
    public static void main(String[] args) {
        PC myPc = new PC();

        myPc.addComponent(new Motherboard("ASUS Prime B450", 1992000.0));
        myPc.addComponent(new CPU("Ryzen 5 3600", 3320000.0));
        myPc.addComponent(new RAM("Corsair Vengeance 16GB", 1328000.0));

        myPc.addComponent(new SSD("Samsung 970 EVO 1TB", 2158000.0));
        myPc.addComponent(new Flashdisk("SanDisk Ultra 64GB", 332000.0));

        myPc.addComponent(new Mouse("Logitech G102", 415000.0));
        myPc.addComponent(new Keyboard("Keychron K6", 1245000.0));
        myPc.addComponent(new Monitor("Dell 24\"", 2490000.0));

        myPc.showSpecs();
    }
}