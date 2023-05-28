package AST.ifDart;

import AST.string_val.stringval;
import AST.widget.wid;

import java.util.ArrayList;
import java.util.List;

public class IfDart {
    stringval child1;
    List<wid> child2= new ArrayList<wid>()  ;
    String string;

    public IfDart() {
        child1 = new stringval();

    }

    public void setChild2(List<wid> child2) {
        this.child2 = child2;
    }

    public List<wid> getChild2() {
        return child2;
    }

    public void addchild1(stringval text)
    {
        child1 = text;

    }

    public void setString(String string) {
        this.string = new String(string);
    }

    @Override
    public String toString() {
        return string+"==" + child1 +
                "?" + child2.get(0)+" : "+child2.get(1) ;
    }
}