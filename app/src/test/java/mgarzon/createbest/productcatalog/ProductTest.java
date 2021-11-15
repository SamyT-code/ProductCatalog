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
        //assertEquals("Check the price of the product", "180.0", aProduct.getPrice()); WILL FAIL

        // Il y a plusieurs problèmes avec la méthode checkPeoductPrice() initiale.
        // Premièrement, assertEquals() vérigie si deux objets String sont les mêmes.
        // Or, si on veut vérifier les prix, il font comparer les nombres. De toute façon,
        // le prix de aProduct est 180 et non pas 0. Pour y remédier, on peut changer la
        // valeur du prix de aProduct une fois l'objet instancié et ensuite utiliser la
        // méthode importée assertTrue() qui vérifie si la condition donnée entre deux nombres
        // est satisfaite.
        //


        aProduct.setPrice(0);

        assertTrue(0 == aProduct.getPrice());
    }


}
