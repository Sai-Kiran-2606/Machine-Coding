package ReportGenerator;

public class TypeFactory {
    public static Type getFormatType(String format){
        switch (format) {
            case "pdf":
                return new Pdf();
            case "docx":
                return new Docx();
            default:
                return null;
        }
    }
}
