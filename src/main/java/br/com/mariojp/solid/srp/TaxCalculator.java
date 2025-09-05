package br.com.mariojp.solid.srp;

public class TaxCalculator {
  private Double taxValue;

  public TaxCalculator(Double taxValue) {
    this.taxValue = taxValue;
  }

  public Double Calculate(Double subtotal){

    return subtotal * taxValue ;
  }
}
