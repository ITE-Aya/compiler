package AST.padding;

import AST.child.Child;
import AST.widget.Widget;

public class Padding extends Widget {
    Child child;
    Padding1 padding1;
    public Padding()
    {
        this.child=new Child();
        this.padding1=new Padding1();
    }
    public void addChild(Child child,Padding1 padding1)
    {
               this.child=child;
               this.padding1=padding1;
    }

    @Override
    public String toString() {
        return "Padding("+padding1+",\n"+child+")";
    }
}
