package AST.expanded;

import AST.child.Child;
import AST.widget.Widget;

public class Expanded extends Widget {
    Child widget;

    public Expanded() {
        widget = new Child();
    }

    public void addChild(Child widget) {
        this.widget = widget;
    }

    @Override
    public String toString() {
        return "Expanded(" + widget + ")";
    }


}
