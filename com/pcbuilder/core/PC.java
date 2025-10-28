package com.pcbuilder.core;

// Import dari paket komponen yang baru
import com.pcbuilder.components.maincomponents.CPU;
import com.pcbuilder.components.maincomponents.Motherboard;
import com.pcbuilder.components.maincomponents.RAM;
import java.util.List;

public class PC {
    private CPU cpu;
    private Motherboard motherboard;
    private List<RAM> ramSticks;

    public PC(CPU cpu, Motherboard motherboard, List<RAM> ramSticks) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.ramSticks = ramSticks;
    }

    public CPU getCPU() { return cpu; }
    public Motherboard getMotherboard() { return motherboard; }
    public List<RAM> getRamSticks() { return ramSticks; }

    // ✅ METODE HASIL REFRACTOR TAHAP 1
    // (Dipindahkan dari PCReportGenerator ke sini)
    public void generateReport() {
        System.out.println("--- PC Build Report ---");
        System.out.println("CPU: " + this.getCPU().getName());
        System.out.println("Motherboard: " + this.getMotherboard().getName());
        System.out.println("RAM Sticks: " + this.ramSticks.size());
        System.out.println("-----------------------");
    }
}