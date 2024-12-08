public class Sedan extends Vehicle{

        public Sedan(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int age) {
            super(cif, seatingCapacity, grossWeight, engineCapacity, age);
        }

        @Override
        public void calculateTaxes() {
            if (age > 15) {
                System.out.println("Sedan older than 15 years cannot be imported.");
                return;
            }

            double id = cif * 0.25;
            double vat = cif * 0.18;
            double wht = cif * 0.06;
            double sd = 35000;
            double ff = 20000;
            double ed = 200000;
            double il = 150000;

            double weightTax = 0;
            if (grossWeight < 1.5) {
                weightTax = cif * 0.02;
            } else if (grossWeight <= 2.0) {
                weightTax = cif * 0.1;
            } else {
                weightTax = cif * 0.15;
            }


            double engineTax = 0;
            if (engineCapacity > 2000) {
                engineTax = cif * 0.1;
            } else if (engineCapacity >= 1500) {
                engineTax = cif * 0.05;
            } else {
                engineTax = cif * 0.025;
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

            System.out.println("Sedan Tax Breakdown:");
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