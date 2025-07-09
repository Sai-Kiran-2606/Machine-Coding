package ReportGenerator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BlobStorage extends Delivery{
    private static final Logger logger = Logger.getLogger(BlobStorage.class.getName());

    @Override
    public void deliverReport(){
//        System.out.println("Report saved to blob storage.");
        logger.log(Level.INFO, "Report saved to blob storage.");
    }
}
