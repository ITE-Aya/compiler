package AST.scaffold;

import AST.appBar.AppBar;
import AST.body.body;
import AST.widget.Widget;

public class Scaffold extends Widget {
AppBar appBar;
body body;
public Scaffold(){
    this.body=new body();
    this.appBar=new AppBar();
}
public void addChild(body body,AppBar appBar)
{
    this.body=body;
    this.appBar=appBar;
}

    @Override
    public String toString() {
        return "Scaffold( \n" + appBar +
                ",\n" + body +
                "\n )";
    }
}
