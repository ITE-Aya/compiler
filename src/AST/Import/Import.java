package AST.Import;

import AST.string_val.stringval;

import java.util.ArrayList;

public class Import   {

    stringval child;

    public Import() {
        child=new stringval();
    }

    public void addchild(stringval text) {
        child=text;
    }

    @Override
    public String toString() {
        return "import " + child.toString() + ";\n";
    }
   public void checkArray(ArrayList<String> st){
        for (String s: st  ) {
            if(child.toString().equals(s) )
                return ;
        }
        RuntimeException e = new RuntimeException("Target of URI doesn't exist:" + child);
        System.out.println( e);
        throw e;
    }
}