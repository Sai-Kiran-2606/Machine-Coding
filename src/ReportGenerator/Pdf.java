package ReportGenerator;

public class Pdf extends Type{

    @Override
    public void generateReport(String title, String content) {
        alignment = "Justify";
        fontFamily = "Sans Serif";
        fontSize = 14;

        System.out.println();

        System.out.println("Generating the report in PDF format with "+alignment+" alignment, "
                +fontFamily+" font family, and " + fontSize + " font size");
        System.out.println("Title of the report: " + title);
        System.out.println("Content of the report: " + content);
    }
}
