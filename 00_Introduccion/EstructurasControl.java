class EstructurasControl{
	public static void main(String [] argumentos){
		/*BUCLE FOR
		for(int i=0;  i< argumentos.length ;i++){
			System.out.println("Arg "+ i);
			System.out.println("Arg "+argumentos[i]);
		}
		*/
		
		//BUCLE WHILE
		/*
		int i=0;
		while(i < argumentos.length){
			System.out.println("Arg "+ i);
			System.out.println("Arg "+argumentos[i]);
			i++;
		}
		*/
		
		//BUCLE INFINITO
		/*
		for( ; ; ){
			System.out.println("Arg "+ i);
		*/
		
		//BUCLE DO WHILE
		/*
		do{
			System.out.println("siempre se muestra");
		}while(false);
		*/
		boolean siEjecutar = (5<3) && (20==20);
		
		if (siEjecutar){
			System.out.println("cuando la condicion es true");
		}else if(5==3){
			System.out.println("cuando la condicion es lala");
		}else{
			System.out.println("cuando la condicion es false");
		}
		
		int valor = 1;
		switch(valor){
			case 0:
				System.out.println("valor cero");
			break;
			case 1:
				System.out.println("valor uno");
			break;
			case 2:
				System.out.println("valor dos");
			break;
			default:
				System.out.println("valor otro");
		}
		
	}
}