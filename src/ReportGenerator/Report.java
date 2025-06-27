package ReportGenerator;

public abstract class Report {
    protected String title;
    protected String content;
    protected Type type;

    public Report(String title, String content, Type type) {
        this.title = title;
        this.content = content;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Type getType() {
        return type;
    }

    public abstract void generate();
}