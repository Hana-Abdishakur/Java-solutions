public class SUV extends Vehicle {

    public SUV(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int age) {
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

        double extraSeatTax = (seatingCapacity > 5) ? (seatingCapacity - 5) * 350000 : 0;

        double weightTax = (grossWeight > 5) ? cif * 0.15 : 0;

        double ageTax = 0;
        if (age >= 1 && age <= 5) {
            ageTax = cif * 0.01;
        } else if (age > 5 && age <= 10) {
            ageTax = cif * 0.15;
        } else if (age > 10) {
            ageTax = cif * 0.25;
        }

        double totalTaxes = id + vat + wht + sd + ff + ed + il + extraSeatTax + weightTax + ageTax;

        System.out.println("SUV Tax Breakdown:");
        System.out.println("Import Duty: " + id);
        System.out.println("VAT: " + vat);
        System.out.println("Withholding Tax: " + wht);
        System.out.println("Stamp Duty: " + sd);
        System.out.println("Form Fees: " + ff);
        System.out.println("Excise Duty: " + ed);
        System.out.println("Infrastructure Levy: " + il);
        System.out.println("Extra Seat Tax: " + extraSeatTax);
        System.out.println("Gross Weight Tax: " + weightTax);
        System.out.println("Age Tax: " + ageTax);
        System.out.println("Total Taxes: " + totalTaxes);
    }
}
