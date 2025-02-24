package eci.edu.cvds.Parcial;
import eci.edu.cvds.Parcial.model.Agents;
import eci.edu.cvds.Parcial.model.Agentlog;
import eci.edu.cvds.Parcial.model.AgentWarning;
import static org.junit.jupiter.api.Assertions.*;

import eci.edu.cvds.Parcial.model.Product;
import eci.edu.cvds.Parcial.service.ServiecAgent;
import org.junit.jupiter.api.Test;



public class AgentServiceTest {
    @Test
    public void addProductTest(){
        ServiecAgent service = new ServiecAgent();
        Product product = new Product("ps5", 10,10,"electronic");
        assertTrue(service.add(product));
    }
    @Test
    public void updateProductTest(){
        ServiecAgent service = new ServiecAgent();
        Product product = new Product("ps5", 10,10,"electronic");
        service.add(product);
        assertTrue(service.update("ps5",15));
    }

    @Test
    public void notUpdateProductTestWithNotAddedProduct(){
        ServiecAgent service = new ServiecAgent();
        Product product = new Product("ps5", 10,10,"electronic");
        service.add(product);
        assertFalse(service.update("ps4",15));
    }

    @Test
    public void notUpdateProductTestWithNegativeQuantity(){
        ServiecAgent service = new ServiecAgent();
        Product product = new Product("ps5", 10,10,"electronic");
        service.add(product);
        assertFalse(service.update("ps5",-10));
    }
}
