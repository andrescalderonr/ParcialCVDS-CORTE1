package eci.edu.cvds.Parcial.model;

import java.util.ArrayList;
import java.util.List;

public class AgentWarning implements Agents {
    private List<String> messages = new ArrayList<>();


    @Override
    public void Change(Product product) {
        if(product.getQuantity() < 5){
            String messageWarning =  "ALERTA!!! El stock del Producto:" + product.getName() + "es muy bajo, solo quedan 4 unidades.";
            messages.add(messageWarning);
            System.out.println(messageWarning);
        }
    }
}
