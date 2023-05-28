package AST.setstate;

import AST.string_val.stringval;

public class setstate1 {
    String VAR_NAME;
    String VAR_NAME2;
    stringval str;

    public setstate1() {
        this.VAR_NAME = new String();
        this.VAR_NAME2 = new String();
        this.str = new stringval();
    }

    public void addchild(String VAR_NAM, String VAR_NAM2, stringval st) {
        this.VAR_NAME=VAR_NAM;
        this.VAR_NAME2=VAR_NAM2;
        this.str=st;
    }

    @Override
    public String toString() {
        return
                VAR_NAME + "="+ VAR_NAME2+"[index]"+"["+str+"]"+";";

    }
}

