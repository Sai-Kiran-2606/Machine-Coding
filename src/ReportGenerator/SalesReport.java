package ReportGenerator;

public class SalesReport extends Report{

    public SalesReport(Type type, String title, String content, Delivery delivery){
        super(title, content, type, delivery);
    }

    @Override
    public void generate() {
        type.generateReport(title, content);
    }

    public void deliver(){
        delivery.deliverReport();
    }
}
