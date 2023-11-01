package projeto.filadeprioridadebrasileira.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projeto.filadeprioridadebrasileira.modulo.Parser;

import java.io.File;

@SpringBootApplication
public class FilaDePrioridadeBrasileiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilaDePrioridadeBrasileiraApplication.class, args);


			File file = new File("entrada.txt");
			Parser parser = new Parser();

			while (parser.hasNext()) {
				String line = parser.nextLine();
				String tokens[] = line.split(" ");
				System.out.println("Linha: "+line);
				for (int i = 0; i < tokens.length; i++) {
					System.out.println("token "+i+" "+tokens[i]);
				}
			}

	}

}
