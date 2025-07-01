package ReportGenerator;

public class ReportFactory {
    public static Report getReportType(String report, Type type, String title, String content, Delivery delivery){
        switch (report){
            case "sales":
                return new SalesReport(type, title, content, delivery);
            case "user":
                return new UserReport(title, content, type, delivery);
            default:
                return null;
        }
    }
}
