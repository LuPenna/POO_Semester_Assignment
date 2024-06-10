package org.example;

public class DataManagement {

    public Product findName(String name, Product[] products) {
        Product tmp_product = new Product();
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(name)) {
                tmp_product = products[i];
            }
        }
        return tmp_product;
    }

    public Product[] sortNames(Product[] products) {
//        for (int i = 0; i < produto.length; i++) {
//            for (int j = i + 1; j < produto.length; j++) {
//                if (produto[i].getName().equals(produto[j].getName())) {
//                    Product temp = produto[i];
//                    produto[i] = produto[j];
//                    produto[j] = temp;
//                }
//            }
//        }
        return products;
    }

    public Product[] sortPrices(Product[] products) {
        return products;
    }

    public Product[] sortBrand(Product[] products) {
        return products;
    }

    public Product[] sortCategory(Product[] products) {
        return products;
    }

    public Product[] sortID(Product[] products) {
        return products;
    }

}
