package AST.Class;

import AST.varname;

public class ClassFull1 {
    varname child1;
    state child2;

    public ClassFull1() {
    child1=new varname();
    child2=new state();
    }

    public void setChild1(varname child1) {
        this.child1 = child1;
    }

    public void setChild2(state child2) {
        this.child2 = child2;
    }

    @Override
    public String toString() {
        return "class " +
                child1 +" extends StatefulWidget {\n @override\n "+
                  child2 +
                "}\n";
    }
}
