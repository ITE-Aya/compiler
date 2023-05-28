package AST.main;

public class main {
    runapp child;

    public main() {
        this.child = new runapp();
    }

    public void setchild(runapp v) {
        this.child=v;

    }

    @Override
    public String toString() {
        return "void main() {\n"  + child +
                "\n}";
    }
}
