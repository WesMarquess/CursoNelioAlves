package Lambda.Ex005.programm;

import Lambda.Ex005.model.Product;
import Lambda.Ex005.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("tv", 245.4));
        productList.add(new Product("tv 2", 2.4));
        productList.add(new Product("tv 3", 145.4));
        productList.add(new Product("tv 4", 40.4));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(productList, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum" + String.format("%.2f", sum));

    }
}
