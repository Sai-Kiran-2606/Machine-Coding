package ReportGenerator;

public class SalesReport extends Report{

    public SalesReport(Format format, String title, String content, Delivery delivery){
        super(title, content, format, delivery);
    }

    @Override
    public void generate() {
        format.generateReport(title, content);
    }

    public void deliver(){
        delivery.deliverReport();
    }
}
