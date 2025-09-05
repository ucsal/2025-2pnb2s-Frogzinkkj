package br.com.mariojp.solid.srp;

public class ReceiptFormatter {

  public String generate(String sbFinished, Double subtotal,Double tax,Double total) {
    StringBuilder sb = new StringBuilder(); //Formatando o Recibo
    sb.append("=== RECIBO ===\n");

    sb.append("Lista de Itens:").append(sbFinished).append("\n");
    sb.append("Subtotal: ").append(subtotal).append("\n");
    sb.append("Tax: ").append(tax).append("\n");
    sb.append("Total: ").append(total).append("\n");
    return sb.toString();
  }
}
