package aula20170420.abstractFactory;

import java.io.InputStream;
import java.util.Properties;

public class MontadoraFactory {

	public static Montadora criarMontadora() {
		
		try {
			InputStream arquivo = Montadora.class.getResourceAsStream("montadora-factory.properties");
			Properties propriedades = new Properties();
			propriedades.load(arquivo);
			String nomeDaClasseDaMontadora = propriedades.getProperty("nome.classe.da.montadora");
			Class classeDaMontadora = Class.forName(nomeDaClasseDaMontadora);
			Montadora montadora = (Montadora)classeDaMontadora.newInstance();
			return montadora;
		} catch (Exception e) {
			throw new RuntimeException("Não foi possível criar a montadora!", e);
		}
	}

}
