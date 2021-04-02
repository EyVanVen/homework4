import task2.DOCHandler;
import task2.TXTHandler;
import task2.XMLHandler;
import task3.Player;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.task2();
        main.task3();
    }

    void task2 (){
        System.out.println("Task 2");
        System.out.println("");

        String[] files = {".doc", ".txt", ".xml"};

        String docType = files[(int) (Math.random() * 3)];

        System.out.println("File" + docType);

        if (docType == ".doc") {
            DOCHandler doc = new DOCHandler();

            doc.open(doc.docFormat);
            doc.change(doc.docFormat);
            doc.save(doc.docFormat);

            System.out.println("========================================");
            System.out.println("");
        } else if (docType == ".txt") {
            TXTHandler txt = new TXTHandler();

            txt.open(txt.txtFormat);
            txt.change(txt.txtFormat);
            txt.save(txt.txtFormat);

            System.out.println("========================================");
            System.out.println("");
        }
        else {
            XMLHandler xml = new XMLHandler();

            xml.open(xml.xmlFormat);
            xml.change(xml.xmlFormat);
            xml.save(xml.xmlFormat);

            System.out.println("========================================");
            System.out.println("");
        }
    }

    void task3(){
        System.out.println("Task 3");
        System.out.println("");

        Player pl = new Player();

        pl.record();
        pl.play();
        pl.pause();
        pl.stop();
    }
}
