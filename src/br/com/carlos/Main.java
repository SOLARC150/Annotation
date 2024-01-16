package br.com.carlos;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Cliente cliente = new Cliente();
	
		System.out.print(cliente.getClass().getDeclaredAnnotation(Tabela.class));
	}

}
