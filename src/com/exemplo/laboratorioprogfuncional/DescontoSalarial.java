package com.exemplo.laboratorioprogfuncional;

public class DescontoSalarial {

	public static void main(String[] args) {
		double[] salariosBrutos = { 1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00 };

		double[] salariosLiquidos = DoubleArrayUtils.transformaValores(salariosBrutos, b -> 0.10 * b);

		DoubleArrayUtils.processaValores(salariosLiquidos, sl -> System.out.println(sl));

	}

}
