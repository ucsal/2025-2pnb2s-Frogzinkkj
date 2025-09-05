package br.com.mariojp.solid.srp;

public class ReceiptService {
	public String generate(Order order) {
		Double taxa = Double.parseDouble( System.getProperty("tax.rate") );

		ReceiptFormatter receiptFormatter = new ReceiptFormatter();
		TaxCalculator taxCalculator = new TaxCalculator(taxa);
		StringBuilder sb = new StringBuilder(); //Formatando o Recibo

		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		double impostoCalculado = taxCalculator.Calculate(subtotal);
		double total = impostoCalculado +subtotal;

		for (var i : order.getItems()) {
			sb.append(i.getName()).append(" x").append(i.getQuantity()).append(" = ").append(i.getUnitPrice() * i.getQuantity())
					.append("\n");
		}
		return receiptFormatter.generate(sb.toString(),subtotal,impostoCalculado,total);

	}
}
