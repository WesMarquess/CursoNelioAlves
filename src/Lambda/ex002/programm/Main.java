package Lambda.ex002.programm;

import Lambda.ex002.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("tv", 245.4));
        productList.add(new Product("tv 2", 2.4));
        productList.add(new Product("tv 3", 145.4));
        productList.add(new Product("tv 4", 40.4));

        double min = 100.0;

        productList.removeIf(p -> p.getPrice() >= min);

        for (Product p : productList) {
            System.out.println(p);
        }
    }
}
