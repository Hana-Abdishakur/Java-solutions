abstract class Vehicle {

    double cif;
    int seatingCapacity;
    double grossWeight;
    int engineCapacity;
    int age;

    public Vehicle(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int age) {
        this.cif = cif;
        this.seatingCapacity = seatingCapacity;
        this.grossWeight = grossWeight;
        this.engineCapacity = engineCapacity;
        this.age = age;
    }

    public abstract void calculateTaxes();

    public double getCIF() {
        return cif;
    }

    public int getAge() {
        return age;
    }
}

