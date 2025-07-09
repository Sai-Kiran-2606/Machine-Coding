package ReportGenerator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Docx extends Format {
    private static final Logger logger = Logger.getLogger(Docx.class.getName());

    @Override
    public void generateReport(String title, String content) {
        alignment = "Text left";
        fontFamily = "Times New Roman";
        fontSize = 12;

//        System.out.println();

//        System.out.println("Generating the report in DOCX format with "+alignment+" alignment, "
//                +fontFamily+" font family, and " + fontSize + " font size");
//        System.out.println("Title of the report: " + title);
//        System.out.println("Content of the report: " + content);

        logger.log(Level.INFO, "Generating the report in DOCX format with "+alignment+" alignment, "
                +fontFamily+" font family, and " + fontSize + " font size");
        logger.log(Level.INFO, "Title of the report: " + title);
        logger.log(Level.INFO, "Content of the report: " + content);
    }
}
