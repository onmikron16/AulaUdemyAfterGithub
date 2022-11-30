package Exercicios.Aula161S14.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{


    private Date manufactureDate;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + sdf.format(manufactureDate)
                + ")";
    }
}
