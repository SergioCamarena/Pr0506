package pr0506;

public class PruebaEstructurasPersona {
	
	public static void main(String[] args) {
		AccesoAPersonasAL procAL = new AccesoAPersonasAL();
		long tiempoAL = BancoDePruebas.realizaTest( procAL, 50000 );
		int espacioAL = BancoDePruebas.getTamanyoTest();
		System.out.println( "Prueba ArrayList de 50000 -- tiempo: " + tiempoAL + " msgs. / espacio = " + espacioAL + " bytes.");
		AccesoAPersonasHS procHS = new AccesoAPersonasHS();
		long tiempoHS = BancoDePruebas.realizaTest( procHS, 500000 );
		int espacioHS = BancoDePruebas.getTamanyoTest();
		System.out.println( "Prueba HashSet de 50000 -- tiempo: " + tiempoHS + " msgs. / espacio = " + espacioHS + " bytes.");
		AccesoAPersonasLL procLL = new AccesoAPersonasLL();
		long tiempoLL = BancoDePruebas.realizaTest( procLL, 50000 );
		int espacioLL = BancoDePruebas.getTamanyoTest();
		System.out.println( "Prueba ArrayList de 50000 -- tiempo: " + tiempoLL + " msgs. / espacio = " + espacioLL + " bytes.");
		AccesoAPersonasTS procTS = new AccesoAPersonasTS();
		long tiempoTS = BancoDePruebas.realizaTest( procTS, 500000 );
		int espacioTS = BancoDePruebas.getTamanyoTest();
		System.out.println( "Prueba TreeSet de 50000 -- tiempo: " + tiempoTS + " msgs. / espacio = " + espacioTS + " bytes.");
	}

}
