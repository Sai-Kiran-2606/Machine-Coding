package ReportGenerator;

public class BlobStorage extends Delivery{
    @Override
    public void deliverReport(){
        System.out.println("Report saved to blob storage.");
    }
}
