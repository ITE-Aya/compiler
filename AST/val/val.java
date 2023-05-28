package AST.val;

import AST.value;

public class val
{
    value v;

    public val() {

    }

    public void setV(value v) {
        this.v = v;
    }

    public value getV() {
        return v;
    }

    @Override
    public String toString() {
        return v.toString() ;
    }
}
