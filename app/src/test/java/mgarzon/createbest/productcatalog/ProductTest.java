package mgarzon.createbest.productcatalog;
import static org.junit.Assert.*;
import org.junit.Test;

public class ProductTest {

    @Test
    public void checkProductName() {
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the name of the product", "DELL MONITOR", aProduct.getProductName());
    }

    @Test
    public void checkProductId() {
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the id of the product", "1", aProduct.getId());
    }

    @Test
    public void checkProductPrice() {
        // I am making this test to fail
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        // La ligne 29 ci-dessous échoue initialement car le prix de "DELL MONITOR" est de 180 alors que
        // le test vérifie si le prix est 0. Pour y remédier, on peut soit changer le prix de "DELL MONITOR",
        // ou on peut changer la clause dans la méthode assertEqual() de 0 à 180. Dans l'exemple ci-bas,
        // je modifie le prix de "DELL MONITOR" après que l'objet a été instancié.

        aProduct.setPrice((int)0);
        assertEquals("Check the price of the product", "0", aProduct.getPrice());
    }


}
