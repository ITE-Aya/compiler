package AST.val;

import AST.value;

public class boolval extends value {
    String child;

    public boolval() {

    }

    public void setChild(String child) {
        if(child.equals("true"))
            this.child = "true";
        else if (child.equals("false"))
            this.child="false";
        else this.child=null;
    }

    @Override
    public String toString() {

        return child;
    }
}
