package AST;

public class navigate {
    String name;
    String status;
    public navigate() {
    }
    public navigate(String name, String status) {
        this.name = name;
        this.status = status;
    }



    @Override
    public String toString() {
        return "get." + status +
                "(" + name + "())"
                ;
    }
}
