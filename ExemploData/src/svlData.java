

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/svlData")
public class svlData extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		Date dataAtual = converterStringDate(request.getParameter("dataAtual"));
		Date dataNascimento = converterStringDate(request.getParameter("dataNascimento"));		
		
		response.getWriter().append("Data Atual: " + dataAtual + "    Data Nascimento: " + dataNascimento);
	}
	
	private Date converterStringDate(String data) {
		int ano = Integer.parseInt(data.substring(0, 4));
		int mes = Integer.parseInt(data.substring(5, 7)) - 1;
		int dia = Integer.parseInt(data.substring(8, 10));
		return new Date(ano, mes, dia);
	}

}
