package Lambda.Ex004.programm;

import Lambda.ex002.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("tv", 245.4));
        productList.add(new Product("tv 2", 2.4));
        productList.add(new Product("tv 3", 145.4));
        productList.add(new Product("tv 4", 40.4));


        List<String> namesUpper = productList.stream()
                .map(p -> p.getName().toUpperCase())
                .collect(Collectors.toList());

        namesUpper.forEach(System.out::println);
    }
}
