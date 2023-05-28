package AST.child;

import AST.widget.Widget;
import AST.widget.wid;

public class Child {
    wid widget;

    public Child(){
        widget=new wid();

    }
    public void addChild(wid widget)
    {

        this.widget=widget;
    }

    @Override
    public String toString() {
        return "child:"+widget;
    }
}
