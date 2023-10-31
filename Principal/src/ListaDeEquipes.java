
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ListaDeEquipes {
        private Scanner leitor;

        public ListaDeEquipes(File file) {
            try {
                leitor = new Scanner(file);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }

        public ListaDeEquipes(String input) {
            leitor = new Scanner(input);
        }

        public boolean hasNext() {
            return leitor.hasNext();
        }

        public String nextLine() {
            return leitor.nextLine();
        }


}
