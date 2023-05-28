package AST.appBar;

import AST.decoration.col;

public class AppBar {
    col color;
    public AppBar()
    {
        this.color=new col();
    }
    public void addChild(col color)
    {
        this.color=color;
    }

    @Override
    public String toString() {
        return "appBar:AppBar(" +
                 "backgroundColor:"+ color +
                ")";
    }
}

