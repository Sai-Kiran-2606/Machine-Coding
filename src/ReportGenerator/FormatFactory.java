package ReportGenerator;

public class FormatFactory {
    public static Format getFormatType(FormatType format){
        switch (format) {
            case FormatType.PDF:
                return new Pdf();
            case FormatType.DOCX:
                return new Docx();
            default:
                throw new IllegalArgumentException();
        }
    }
}
