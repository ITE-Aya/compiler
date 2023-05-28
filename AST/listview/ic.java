package AST.listview;
import AST.*;
import AST.val.*;

import java.util.ArrayList;

public class ic {
    ArrayList<varname> children;
    numval child2;
    public ic(){
       children=new ArrayList<>();
        child2=new numval();
    }

    public void addchild1(varname child1) {
        this.children.add(child1) ;
    }

    public void setChild2(numval child2) {
        this.child2 = child2;
    }


    @Override
    public String toString() {
        if (children.size()>0){
        return "itemCount:" +
                 children.get(0) +
                "." + children.get(1);

    }else {
            return " itemCount:"+child2;
        }

    }
}
