package ReportGenerator;

public class ReportFactory {
    public static Report getReportType(String report, Type type, String title, String content){
        switch (report){
            case "sales":
                return new SalesReport(type, title, content);
            case "user":
                return new UserReport(title, content, type);
            default:
                return null;
        }
    }
}
