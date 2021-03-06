package tsi.web.services.app;

import java.io.File;

import tsi.web.services.file.Validar;

public class App {

	public static void main(String[] args) throws Exception {
		Validar validador = new Validar();
		validador.valida(new File("arquivos/atividade1.xml"), new File("arquivos/atividade2xsd.xsd"));
	}

}
