package Exercicios.Aula165S14.entities;

public class Company extends TaxPayer{

    private int numberofEmployee;

    public Company(String name, Double anualIncome, int numberofEmployee) {
        super(name, anualIncome);
        this.numberofEmployee = numberofEmployee;
    }


    @Override
    public double tax() {
         if(numberofEmployee >= 10){
             return super.getAnualIncome() * 0.14;
        }else return super.getAnualIncome() * 0.16;

    }

    public int getNumberofEmployee() {
        return numberofEmployee;
    }

    public void setNumberofEmployee(int numberofEmployee) {
        this.numberofEmployee = numberofEmployee;
    }
}
