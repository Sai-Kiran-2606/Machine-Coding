package ReportGenerator;

public class EmailReport extends Delivery{
    @Override
    public void deliverReport(){
        System.out.println("Report delivered via email.");
    }
}
