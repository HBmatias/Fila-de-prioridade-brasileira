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
    private Scanner leitor;

    public String read(File file) {
        String code = "";

        try {
            leitor = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        return code;
    }

    public boolean hasNext() {
        return leitor.hasNext();
    }

    public String nextLine() {
        return leitor.nextLine();
    }

    public void readAndProcessHTML(File file) {
        String html = read(file);

        Document doc = Jsoup.parse(html);

        Elements elements = doc.getAllElements();

        for (Element element : elements) {
            processElement(element);
        }
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
