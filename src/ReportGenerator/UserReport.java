package ReportGenerator;

public class UserReport extends Report{
    public UserReport(String title, String content, Type type) {
        super(title, content, type);
    }

    @Override
    public void generate() {
        type.generateReport(title, content);
    }


}
