package br.com.fiap.util;

import java.math.BigInteger;
import java.security.MessageDigest;

public class CriptografarUtils {
	
	public static String criptografar(String senha) throws Exception {
		
		//Obtem a instancia de um algoritmo
		MessageDigest md = MessageDigest.getInstance("MD5");
		
		//Passa os dados a serem criptografados a estipula encoding padrao
		md.update(senha.getBytes("ISO-8859-1"));
		
		//Gera a chave criptografada em array de Bytes para posterior hashing
		BigInteger hash = new BigInteger(1, md.digest());
		
		return hash.toString(16);
	}

}
