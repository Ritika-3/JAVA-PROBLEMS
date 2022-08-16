package com.stackroute.oops;

import java.util.ArrayList;
import java.util.List;

import static com.stackroute.oops.ProductRepository.getProducts;

/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {

    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode) {
            for (Product product : getProducts()) {
            if (product.getProductCode() == productCode) {
                return product.getName();
            }
        }
        return null;

    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {

   /*   (i might have not commented some the code before editing, so i might be correcting some vague or incomplete bits)
        Product maxPriceProduct = getProducts() ;  (you're assigning Product[] to a Product variable)
        for (Product product : getProducts()) {
            if (product.getCategory().equals(category)) {
                if (product.getPrice() > maxPriceProduct.getPrice()) {  (here if maxPriceProduct were a Product[], maxPriceProduct & getProduct in this loop are also the same)
                    maxPriceProduct = product;
                    return maxPriceProduct;
                }
            }
        }

    */
        if(category=="computers" || category=="toys" || category=="clothing"){
            Product max = new Product(01,"dummy",0.0,"");
            max.setPrice(0);
            int i=0;
            //(you're assigning Product[] to a Product variable)
            for (Product product : getProducts()) {
                if (product.getCategory().equals(category)) {
                    if (product.getPrice() > max.getPrice()) {
                        max = product;
                    }
                }
            }
            return max;
        }
        return null;
    }


/*
        Returns an array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {
       /*

        Product[] productsByCategory = new Product[getProducts().length];   (we're already defining array length, but the actual answer might now have that defined length)
        int count = 0;
        for (Product product : getProducts()) {
            if (product.getCategory().equals(category)) {
                productsByCategory[count] = product;
                count++;
            }
        }

        */
        List<Product> newList = new ArrayList<Product>();

        if(category=="computers" || category=="toys" || category=="clothing")
        {
            for (Product product : getProducts()) {
                if (product.getCategory().equals(category)) {
                    newList.add(product);
                }
            }
            if(newList==null) return null;
            Product[] newArray = new Product[newList.size()];
            newArray = newList.toArray(newArray);


            return newArray;
        }
        // IF NON EXISTING CATEGORY INPUT
        return null;

    }
}
