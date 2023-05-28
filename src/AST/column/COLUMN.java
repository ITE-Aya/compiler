package AST.column;


import AST.children.Children;
import AST.widget.Widget;

public class COLUMN extends Widget {
    Children child;

    public COLUMN() {
        child = new Children();

    }

    public void addchild(Children text) {
        child = text;
    }

    @Override
    public String toString() {
        return "Column(" + child +
                ')';
    }
}