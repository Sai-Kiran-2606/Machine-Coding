package ReportGenerator;

public abstract class Format {
    protected String alignment;
    protected int fontSize;
    protected String fontFamily;

    public abstract void generateReport(String title, String content);

    public String getAlignment() {
        return alignment;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }
}
