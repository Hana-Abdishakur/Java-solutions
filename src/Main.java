public class Main {
    public static void main(String[] args) {
        Vehicle ambulance = new Ambulance(5000000, 2, 1.2, 2500, 12);
        Vehicle estate = new Estate(3000000, 7, 1.8, 1600, 3);
        Vehicle sedan = new Sedan(4000000, 5, 1.5, 1800, 9);
        Vehicle suv = new SUV(6000000, 6, 4.5, 3000, 5);
        Vehicle trailer = new Trailer(2000000, 0, 15, 18000, 8);

        ambulance.calculateTaxes();
        System.out.println();
        estate.calculateTaxes();
        System.out.println();
        sedan.calculateTaxes();
        System.out.println();
        suv.calculateTaxes();
        System.out.println();
        trailer.calculateTaxes();
    }
}