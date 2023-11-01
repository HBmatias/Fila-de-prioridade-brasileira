package app.Config;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;

public class Parser {
    /**
     * This method is responsible for reading the file and parsing it
     * 
     * @param file - The file to be read
     * @return Scanner
     */
    public Scanner read(File file) {
        // Scanned file
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);

            // Print in console the file content
            while (this.hasNext(scanner)) {
                System.out.println(this.nextLine(scanner));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        return scanner;
    }

    public boolean hasNext(Scanner scanner) {
        return scanner.hasNext();
    }

    public String nextLine(Scanner scanner) {
        return scanner.nextLine();
    }

    public void readAndProcessHTML(File file) {
        // leitor html = read(file);

        // Document doc = Jsoup.parse(html);

        // Elements elements = doc.getAllElements();

        // for (Element element : elements) {
        // processElement(element);
        // }
    }

    private void processElement(Element element) {
        // Aqui você pode adicionar o código para processar o elemento, por exemplo:
        if (element.tagName().equals("var")) {
            // Se o elemento é uma tag 'var', substitua seu conteúdo por algum valor.
            element.text("valor substituto");
        }

        // Imprima o elemento (ou faça o que quiser com ele).
        System.out.println(element.outerHtml());
    }

}
