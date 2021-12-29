package pr0506;

import java.util.TreeSet;

public class AccesoAPersonasTS implements ProcesoProbable {

	private TreeSet<Persona> p;
	
	@Override
	public void init(int tamanyoTest) {
		p = new TreeSet<>();
		for (int i=0; i<tamanyoTest; i++) {
			p.add( new Persona( i*2+1, "Nombre " + i, "Apellido " + i ));
		}
	}

	public int cont;  // Se hace el contador atributo para que la actualización del contador del test no pueda ser optimizada (y eliminada) por el compilador
	@Override
	public Object test() {
		cont = 0;
		for (int i=0; i<p.size(); i++) {
			if (p.contains( new Persona(i,"","") )) cont++;
		}
		// System.out.println( "Número personas encontradas: " + cont );
		return p;
	}

	/** Método de prueba de la clase
	 * @param args
	 */
	public static void main(String[] args) {
		AccesoAPersonasTS proc = new AccesoAPersonasTS();
		long tiempo = BancoDePruebas.realizaTest( proc, 500000 );
		int espacio = BancoDePruebas.getTamanyoTest();
		System.out.println( "Prueba TreeSet de 50000 -- tiempo: " + tiempo + " msgs. / espacio = " + espacio + " bytes.");
	}

}
