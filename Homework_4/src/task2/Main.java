package task2;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] files = {".doc", ".txt", ".xml"};

        String docType = files[(int) (Math.random() * 3)];

        System.out.println("File" + docType);

        if (docType == ".doc") {
            DOCHandler doc = new DOCHandler();

            doc.open(doc.docFormat);
            doc.change(doc.docFormat);
            doc.save(doc.docFormat);

            System.out.println("========================================");
        } else if (docType == ".txt") {
            TXTHandler txt = new TXTHandler();

            txt.open(txt.txtFormat);
            txt.change(txt.txtFormat);
            txt.save(txt.txtFormat);

            System.out.println("========================================");
        }
        else {
            XMLHandler xml = new XMLHandler();

            xml.open(xml.xmlFormat);
            xml.change(xml.xmlFormat);
            xml.save(xml.xmlFormat);

            System.out.println("========================================");
        }
    }
}
