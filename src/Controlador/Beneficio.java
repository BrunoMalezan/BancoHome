package Controlador;

public class Beneficio {

	public double tabela(double recebedado) {
		
		if(recebedado <= 200) {
			return 0;
			
		} else if(recebedado > 200 && recebedado <= 400) {
			return calculadados(recebedado, 0.20);
			
		} else if(recebedado > 400 && recebedado <= 600) {
			return calculadados(recebedado, 0.30);
			
		} else {
			return calculadados(recebedado, 0.40);
			
		}
		
	}
	
	private double calculadados(double media, double percentagem) {
		
		return (media * percentagem);
		
	}

}
