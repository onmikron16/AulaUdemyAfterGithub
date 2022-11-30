package Exercicios.Aula161S14.entities;

public class ImportedProduct extends Product{


    public Double customsFee;


    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price,Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }


    public double totalPrice(){
        return getPrice() + getCustomsFee();
    }

    @Override
    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";
    }


    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }



}
