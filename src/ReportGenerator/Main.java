package ReportGenerator;

public class Main {
    public static void main(String[] args) {
        Format pdf = FormatFactory.getFormatType(FormatType.PDF);
        Format docx = FormatFactory.getFormatType(FormatType.DOCX);

        Report sales = ReportFactory.getReportType(ReportType.SALES, pdf, "Sales report of Range Rover",
                "There has been a rapid increase in the sales of all cars. However, the all new Range Rover sport has " +
                        "outperformed among others.", new EmailReport());

        Report user = ReportFactory.getReportType(ReportType.USER, docx, "The Great RATAN TATA",
                "Ratan Tata is a philanthropist and had done a lot of charity work for people in India and Europe.", new DownloadReport());

        sales.generate();
        sales.deliver();
        user.generate();
        user.deliver();
    }
}
