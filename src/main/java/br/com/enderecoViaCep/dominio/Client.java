package br.com.enderecoViaCep.dominio;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Informe o seu CEP: ");
		@SuppressWarnings("resource")
		String cep = new Scanner(System.in).nextLine();
		Endereco endereco = ServicoDeCep.buscarEnderecoPelo(cep);
		
		System.out.println("Logradouro: " + endereco.getLogradouro());
		System.out.println("Complemento: " + endereco.getComplemento());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Localidade: " + endereco.getLocalidade());
		System.out.println("Uf: " + endereco.getUf());
		System.out.println("DDD: " + endereco.getDdd());
	}
}
