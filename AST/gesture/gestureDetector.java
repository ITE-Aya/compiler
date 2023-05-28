package AST.gesture;


import AST.child.Child;
import AST.ontap.ontap;
import AST.widget.Widget;

public class gestureDetector extends Widget {
    ontap on;
    Child child;


    public gestureDetector() {
        this.on = new ontap();
        this.child=new Child();

    }
    public void addchild(ontap on) {
        this.on=on;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "GestureDetector(" + on + ","+ child +
                ')';
    }
}
