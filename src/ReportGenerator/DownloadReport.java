package ReportGenerator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DownloadReport extends Delivery{
    private static final Logger logger = Logger.getLogger(DownloadReport.class.getName());

    @Override
    public void deliverReport(){
//        System.out.println("Report downloaded to local storage.");
        logger.log(Level.INFO, "Report downloaded to local storage.");
    }
}
