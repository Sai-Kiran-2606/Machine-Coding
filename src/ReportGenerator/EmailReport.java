package ReportGenerator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EmailReport extends Delivery{
    private static final Logger logger = Logger.getLogger(EmailReport.class.getName());

    @Override
    public void deliverReport(){
//        System.out.println("Report delivered via email.");
        logger.log(Level.INFO, "Report delivered via email.");
    }
}
