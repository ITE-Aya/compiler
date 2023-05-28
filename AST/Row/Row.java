package AST.Row;

import AST.children.Children;
import AST.widget.Widget;

public class Row extends Widget {
    Children child;

    public Row() {
        child = new Children();

    }
    public void addchild(Children text) {
        child=text;
    }

    @Override
    public String toString() {
        return "Row(" + child +
                ')';
    }
}
