package ReportGenerator;

public class SalesReport extends Report{

    public SalesReport(Type type, String title, String content){
        super(title, content, type);
    }

    @Override
    public void generate() {
        type.generateReport(title, content);
    }
}
