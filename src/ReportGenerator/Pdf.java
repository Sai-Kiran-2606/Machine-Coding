package ReportGenerator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Pdf extends Format {
    private static Logger logger = Logger.getLogger(Pdf.class.getName());

    @Override
    public void generateReport(String title, String content) {
        alignment = "Justify";
        fontFamily = "Sans Serif";
        fontSize = 14;

//        System.out.println();

//        System.out.println("Generating the report in PDF format with "+alignment+" alignment, "
//                +fontFamily+" font family, and " + fontSize + " font size");
//        System.out.println("Title of the report: " + title);
//        System.out.println("Content of the report: " + content);
//        System.out.flush();

        logger.log(Level.INFO, "Generating the report in PDF format with "+alignment+" alignment, "
                +fontFamily+" font family, and " + fontSize + " font size");
        logger.log(Level.INFO, "Title of the report: " + title);
        logger.log(Level.INFO, "Content of the report: " + content);
    }
}
