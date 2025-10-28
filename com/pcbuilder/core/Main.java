package com.pcbuilder.core;

import com.pcbuilder.customer.Customer;
import com.pcbuilder.reporting.PCReportGenerator;
import com.pcbuilder.sales.SalesReport;
import com.pcbuilder.components.maincomponents.CPU;
import com.pcbuilder.components.maincomponents.Motherboard;
import com.pcbuilder.components.maincomponents.RAM;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel i7");
        Motherboard mb = new Motherboard("ASUS Prime");
        RAM ram1 = new RAM("Corsair 8GB");
        RAM ram2 = new RAM("Corsair 8GB");

        PC pc = new PC(cpu, mb, Arrays.asList(ram1, ram2));
        PCReportGenerator report = new PCReportGenerator();
        report.generateReport(pc);

        System.out.println();

        // --- Verifikasi Tahap 2 ---
        Customer cust = new Customer("Daniel Budianto", "budi@mail.com", 21000);
        SalesReport salesReport = new SalesReport();
        salesReport.generateCustomerReport(cust);
    }
}