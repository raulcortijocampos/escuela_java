/**
*clase de introduccion
*@author Raul
*/

class HolaMundo{
	public static void main(String [] args){
		System.out.println("Hola mundo!");
		String nombre = "Raul";
		System.out.println("Hola "+nombre+"!");
		byte unByte = -128; //hasta 127
		System.out.println("Byte: "+unByte);
		int numero = 1000;
		System.out.println("Entero: "+numero);
		float decimalFloat = 1.2345678901f;
		System.out.println("Decimal: "+decimalFloat);
		double decimalDoble = 1.2345678901234567;
		System.out.println("Doble: "+decimalDoble);
		long enteroLargo = 1234567890123456789L;
		System.out.println("enteroLargo: "+enteroLargo);
		char caracter = 65; //'z';
		System.out.println("caracter: "+caracter);
		{
			char[] texto = {'a', 'b', 'c'};
			for(int i = 0; i<texto.length; i++){
				System.out.println("caracterArray: "+texto[i]);
			}
		}

	}
}


