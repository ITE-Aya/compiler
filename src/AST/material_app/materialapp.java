package AST.material_app;

import AST.widget.Widget;

public class materialapp extends Widget {
    home home;
    debugmode debugmode;

    public materialapp() {
        this.home = new home();
        this.debugmode = new debugmode();
    }

    public void addchild( home home, debugmode debugmode) {
        this.home = home;
        this.debugmode = debugmode;

    }


    @Override
    public String toString() {
        return "MaterialApp(" +"\n " + debugmode+
                "\n " + home +
                 "\n)";
    }
}
