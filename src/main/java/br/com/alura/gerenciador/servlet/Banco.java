package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa1 = new Empresa();
		empresa1.setId(chaveSequencial);
		empresa1.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial + 1);
		empresa2.setNome("Caelum");
		lista.add(empresa1);
		lista.add(empresa2);
	}

	public void adicionaEmpresa(Empresa empresa) {
		lista.add(empresa);
		empresa.setId(chaveSequencial + 1);
	}

	public static List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa empresa = it.next();

			if (empresa.getId() == id) {
				it.remove();
			}
		}
	}

	public void editaEmpresa(Empresa empresaAtualizada) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == empresaAtualizada.getId()) {
				empresa = empresaAtualizada;
			}
		}
	}

	public Empresa buscaEmpresaPorId(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

}
