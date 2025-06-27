package ReportGenerator;

public class Docx extends Type{

    @Override
    public void generateReport(String title, String content) {
        alignment = "Text left";
        fontFamily = "Times New Roman";
        fontSize = 12;

        System.out.println();

        System.out.println("Generating the report in DOCX format with "+alignment+" alignment, "
                +fontFamily+" font family, and " + fontSize + " font size");
        System.out.println("Title of the report: " + title);
        System.out.println("Content of the report: " + content);
    }
}
