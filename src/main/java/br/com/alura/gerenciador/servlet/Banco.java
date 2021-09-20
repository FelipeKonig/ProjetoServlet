package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();

	public void adicionaEmpresa(Empresa empresa) {
		lista.add(empresa);
		System.out.println("empresa adicionada");
	}

	public static List<Empresa> getEmpresas() {
		return Banco.lista;
	}

}
