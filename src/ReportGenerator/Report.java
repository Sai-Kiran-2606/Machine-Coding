package ReportGenerator;

public abstract class Report {
    protected String title;
    protected String content;
    protected Type type;
    protected Delivery delivery;

    public Report(String title, String content, Type type, Delivery delivery) {
        this.title = title;
        this.content = content;
        this.type = type;
        this.delivery = delivery;
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

    public void deliver(){
        System.out.println("Deliver method in Report abstract class");
    }
}