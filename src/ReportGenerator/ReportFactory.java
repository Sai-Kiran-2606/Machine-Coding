package ReportGenerator;

public class ReportFactory {
    public static Report getReportType(ReportType report, Format format, String title, String content, Delivery delivery){
        switch (report){
            case ReportType.SALES:
                return new SalesReport(format, title, content, delivery);
            case ReportType.USER:
                return new UserReport(title, content, format, delivery);
            default:
                throw new IllegalArgumentException();
        }
    }
}
