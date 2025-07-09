package ReportGenerator;

public class UserReport extends Report{
    public UserReport(String title, String content, Format format, Delivery delivery) {
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
