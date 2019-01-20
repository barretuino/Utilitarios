package barretuino.carrinho;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Utils {
	public static double round(double valor, int casas) {
		valor *= Math.pow(10, casas);
		valor = Math.floor(valor);
		return (valor / Math.pow(10, casas));
	}
	
	public static String formatarCasas(double valor, int casas) {
		String mascara = "#,##0";
		if (casas > 0) {
			mascara +=".";
			for(int i=0; i<casas; i++) {
				mascara +="0";
			}				
		}		
		DecimalFormat df = new DecimalFormat(mascara);
		df.setRoundingMode(RoundingMode.HALF_UP);
		return df.format(valor);
	}
}
