import java.util.ArrayList;
import java.util.Scanner;
/* averiguar como poner int en un integer */
class Enteros
{
	public static void main( String[] args )
	{
		Scanner teclado = new Scanner( System.in );
		ArrayList<Integer> numeros = new ArrayList();
		int opt, pos;
		Integer valor;

		do { 
			System.out.println();
			System.out.println( "\t1. AddNew" );
			System.out.println( "\t2. Size" );
			System.out.println( "\t3. ShowAll" );
			System.out.println( "\t4. DelAll" );
			System.out.println( "\t5. DelOne" );
			System.out.println( "\t6. ShowOne" );
			System.out.println( "\t7. isEmpty" );
			System.out.println( "\t0. Exit" );
			System.out.println();

			opt = teclado.nextInt();

			switch( opt ) 
			{
				// añadir elemento
				case 1:
					valor = teclado.nextInt();
					numeros.add( valor );	
					break;
				// tamaño del array
				case 2:
					System.out.println( numeros.size() );
					break;
				// mostrar todo
				case 3:
					for ( int i = 0; i < numeros.size(); i++ ) 
					{
						System.out.println( numeros.get( i ) );
					}
					break;
				// eliminar todo
				case 4:
					numeros.clear();
					break;
				// eliminar un elemento
				case 5:
					pos = teclado.nextInt();
					numeros.remove( pos );
					break;
				// mostrar un elemento
				case 6:
					pos = teclado.nextInt();
					System.out.println( numeros.get( pos ) );	
					break;
				// comprobar vacio
				case 7:
					System.out.println( numeros.isEmpty() );
					break;
			}


		} while ( opt != 0 );
	}
}
