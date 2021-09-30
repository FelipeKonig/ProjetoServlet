package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edita-empresa")
public class EditaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String idEmpresa = request.getParameter("id");
		String nomeEmpresa = request.getParameter("nome");
		String dataEmpresa = request.getParameter("data");
		
		Date dataAbertura;
		try {
			SimpleDateFormat sdfEmpresa = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdfEmpresa.parse(dataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa(nomeEmpresa, dataAbertura);
		empresa.setId(Integer.valueOf(idEmpresa));
		
		Banco banco = new Banco();
		banco.editaEmpresa(empresa);
		
//		redirecionamento client side
		response.sendRedirect("lista-empresas");
		
//		redirecionamento server side		
//		RequestDispatcher rd = request.getRequestDispatcher("/lista-empresas");
//		request.setAttribute("empresa", empresa.getNome());
//		rd.forward(request, response);
	}

}
