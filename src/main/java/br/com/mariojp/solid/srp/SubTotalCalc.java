package br.com.mariojp.solid.srp;

public class SubTotalCalc {
  public double subTotal(Order order){
    return order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
  }
}
