package projeto.filadeprioridadebrasileira.modulo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;

public class ParserScr extends Parser {
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
