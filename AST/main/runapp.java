package AST.main;

import AST.varname;

public class runapp {
    varname child;

    public runapp() {
        this.child = new varname();
    }

    public void setchild(varname v) {
        this.child=v;

    }

    @Override
    public String toString() {
        return "runApp( " + child + "() );";
    }
}
