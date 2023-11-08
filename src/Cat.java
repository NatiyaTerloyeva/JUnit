public class Cat {
    private String name; //Must NOT be null and must NOT be empty
    private char gender; //Must be either 'M' or 'F'
    private double weighhtInKg; //Must be greater than zero AND lower than or equal to 10

    public Cat(String name, char gender, double weighhtInKg) {
        this.name = name;
        this.gender = gender;
        this.weighhtInKg = weighhtInKg;
    }

    public String getName(){
        return name;
    }

    public char getGender() {
        return gender;
    }

    public double getWeighhtInKg() {
        return weighhtInKg;
    }
}
