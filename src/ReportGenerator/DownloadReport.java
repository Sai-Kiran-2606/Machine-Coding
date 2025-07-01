package ReportGenerator;

public class DownloadReport extends Delivery{
    @Override
    public void deliverReport(){
        System.out.println("Report downloaded to local storage.");
    }
}
