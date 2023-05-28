package AST.container;

import AST.child.Child;

import AST.decoration.decoration;
import AST.padding.Padding;
import AST.padding.Padding1;
import AST.widget.Widget;

public class Container extends Widget {
Padding1 padding1;
Child child;
decoration decoration;

public Container ()
{
    this.child=new Child();
    this.padding1=new Padding1();
    this.decoration=new decoration();
}

public void addChild(Padding1 padding,Child child,decoration decoration)
{
    this.child=child;
    this.padding1=padding;
    this.decoration=decoration;

}

    @Override
    public String toString() {
        return "Container( \n" + padding1 +
                ", \n" + child + ",\n"+decoration+
                "\n )";
    }
}
