package ReportGenerator;

public class UserReport extends Report{
    public UserReport(String title, String content, Type type, Delivery delivery) {
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
