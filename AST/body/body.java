package AST.body;

import AST.widget.wid;

public class body {
    wid widget;

    public body(){

    }
    public void addChild(wid widget)
    {
        this.widget=widget;
    }

    @Override
    public String toString() {
        return "body:"+widget;
    }
}
