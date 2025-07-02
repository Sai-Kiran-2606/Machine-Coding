package ReportGenerator;

public abstract class Report {
    protected String title;
    protected String content;
    protected Format format;
    protected Delivery delivery;

    public Report(String title, String content, Format format, Delivery delivery) {
        this.title = title;
        this.content = content;
        this.format = format;
        this.delivery = delivery;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Format getType() {
        return format;
    }

    public abstract void generate();

    public void deliver(){
        System.out.println("Deliver method in Report abstract class");
    }
}