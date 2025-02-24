package eci.edu.cvds.Parcial.model;

import java.util.ArrayList;
import java.util.List;

public class Agentlog implements Agents {
    private List<String> messages = new ArrayList<>();

    @Override
    public void Change(Product product) {
       String messageLog = "Producto" + product.getName() + "->" + product.getQuantity() + "unidades disponibles";
       messages.add(messageLog);
       System.out.println(messageLog);
    }
}
