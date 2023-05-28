package AST.material_app;

public class home {
    String homeval;

    public home() {
        this.homeval = new String();
    }
    public void addmode(String text) {

        this.homeval=new String(text);
    }

    @Override
    public String toString() {
        return "home:" + homeval + "()" ;
    }

}
