public class Trailer extends Vehicle {

    public Trailer(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int age) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, age);
    }

    @Override
    public void calculateTaxes() {
        double id = cif * 0.25;
        double vat = cif * 0.18;
        double wht = cif * 0.06;
        double sd = 35000;
        double ff = 20000;
        double ed = 200000;
        double il = 150000;

        double weightTax = 0;
        if (grossWeight < 15000) {
            weightTax = cif * 0.05;
        } else if (grossWeight <= 20000) {
            weightTax = cif * 0.15;
        } else {
            weightTax = cif * 0.25;
        }

        double engineTax = 0;
        if (engineCapacity > 20000) {
            engineTax = cif * 0.1;
        } else if (engineCapacity >= 15000) {
            engineTax = cif * 0.05;
        } else {
            engineTax = cif * 0.025;
        }

        if (age > 15) {
            System.out.println("Trailer older than 15 years cannot be imported.");
            return;
        }
        double ageTax = 0;
        if (age >= 10) {
            ageTax = cif * 0.1;
        } else if (age >= 5) {
            ageTax = cif * 0.05;
        } else {
            ageTax = cif * 0.015;
        }

        double totalTaxes = id + vat + wht + sd + ff + ed + il + weightTax + engineTax + ageTax;

        System.out.println("Trailer Tax Breakdown:");
        System.out.println("Import Duty: " + id);
        System.out.println("VAT: " + vat);
        System.out.println("Withholding Tax: " + wht);
        System.out.println("Stamp Duty: " + sd);
        System.out.println("Form Fees: " + ff);
        System.out.println("Excise Duty: " + ed);
        System.out.println("Infrastructure Levy: " + il);
        System.out.println("Gross Weight Tax: " + weightTax);
        System.out.println("Engine Capacity Tax: " + engineTax);
        System.out.println("Age Tax: " + ageTax);
        System.out.println("Total Taxes: " + totalTaxes);
    }
}
