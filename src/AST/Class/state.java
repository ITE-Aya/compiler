package AST.Class;

import AST.varname;

public class state {
    varname child1,child2;

    public state() {
        this.child1 = new varname();
        this.child2 = new varname();
    }

    public void setChild1(varname child1) {
        this.child1 = child1;
    }

    public void setChild2(varname child2) {
        this.child2 = child2;
    }

    @Override
    public String toString() {
        return "State <" +
                 child1 +"> createState() => "+
                 child2 +
                "();\n";
    }
}
