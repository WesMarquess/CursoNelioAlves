package lambda.ex001.programm;

import lambda.ex001.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 451.04));
        productList.add(new Product("TV 2", 415.14));
        productList.add(new Product("TV 3", 412.44));

        /*Comparator<Product> comparator = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            productList.sort(comparator);
        };*/

        /*Comparator<Product> comparator2 = (p1, p2) ->
                p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        productList.sort(comparator2);
        */

        productList.sort(
                (p1, p2) ->
                p1.getName().toUpperCase()
                .compareTo(p2.getName().toUpperCase()));

        for (Product product : productList) {
            System.out.println(product);
        }

    }
}
