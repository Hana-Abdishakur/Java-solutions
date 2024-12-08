public class Ambulance extends Vehicle {

        public Ambulance(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int age) {
            super(cif, seatingCapacity, grossWeight, engineCapacity, age);
        }

        @Override
        public void calculateTaxes() {
            double sd = 35000;
            double ff = 20000;
            double ed = 200000;
            double il = (age > 10) ? cif * 0.15 : 150000;

            double totalTaxes = sd + ff + ed + il;
            System.out.println("Ambulance Tax Breakdown:");
            System.out.println("Stamp Duty: " + sd);
            System.out.println("Form Fees: " + ff);
            System.out.println("Excise Duty: " + ed);
            System.out.println("Infrastructure Levy: " + il);
            System.out.println("Total Taxes: " + totalTaxes);
        }
    }

