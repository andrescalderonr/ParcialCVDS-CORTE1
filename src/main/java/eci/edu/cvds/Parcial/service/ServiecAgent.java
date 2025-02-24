package eci.edu.cvds.Parcial.service;

import eci.edu.cvds.Parcial.model.AgentWarning;
import eci.edu.cvds.Parcial.model.Agentlog;
import eci.edu.cvds.Parcial.model.Agents;
import eci.edu.cvds.Parcial.model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiecAgent{
    private Map<String, Product> products;
    private Agents agentLog = new Agentlog();
    private Agents agentWarn = new AgentWarning();

    public ServiecAgent(){
        products = new HashMap<>();
        this.agentLog = agentLog;
        this.agentWarn = agentWarn;
    }


    public boolean add(Product product) {
        if(!productIsOk(product)){
            return false;
        }
        String name = product.getName();
        if(products.containsKey(name)){
            return false;
        }
        products.put(name,product);
        return true;
    }

    public boolean update(String name, int quantity) {
        if(quantity < 0){
            return false;
        }
        if(!products.containsKey(name)) {
            return false;
        }
        Product product = products.get(name);
        product.setQuantity(quantity);
        notifyAgents(product);
        return true;
    }

    public void delete(String name) {
        products.remove(name);
    }

    public List<Product> getAllProduct() {
        return products.values().stream().toList();
    }

    public void notifyAgents(Product product) {
        agentLog.Change(product);
        agentWarn.Change(product);
    }

    private boolean productIsOk(Product product){

        if (product == null) return false;

        String name = product.getName();
        int price = product.getPrice();
        int quantity = product.getQuantity();
        String category = product.getCategory();

        if (!validateString(name) || !validateString(category)) {
            return false;
        }

        if (quantity < 0){
            return false;
        }
        if (price < 0) {
            return false;
        }
        return true;
    }

    private boolean validateString(String param){
        return param != null && !param.isEmpty();
    }
}
