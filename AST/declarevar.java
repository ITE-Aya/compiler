package AST;

import AST.val.*;

import java.util.ArrayList;

public class declarevar {
    String type;
    ArrayList<varname> varnames;
    ArrayList<val> vals;
    RuntimeException e;

    public declarevar() {
        type = new String();
        varnames = new ArrayList<>();
        vals = new ArrayList<>();

    }

    public void setType(String type) {
        this.type = type;
    }

    public void addval(val v) {
        vals.add(v);
    }

    public void addvarnames(varname v) {
        varnames.add(v);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(type + ' ');
        s.append(varnames.get(0).toString() + ' ');
        if (vals.size() != 0)
            s.append(" = " + vals.get(0).toString() + ' ');
        for (int i = 1; i < varnames.size(); i++) {
            s.append(" , " + varnames.get(i).toString() + ' ');
            if (vals.size() != 0) {
                s.append(" = " + vals.get(i).toString() + ' ');
            }
        }
        return s.toString() + ";\n";
    }

    public boolean semanticType(String type, val v) {
        if (type.equals("String") && !v.toString().matches("\'.*\'")) {
            e = new RuntimeException(v.toString() + "cannot be converted to String");
            System.out.println(e.toString());
            throw e;
        } else if (type.equals("int") && !v.toString().matches("[0-9]+")) {
            e = new RuntimeException(v.toString() + "cannot be converted to int");
            System.out.println(e.toString());
            throw e;
        } else if (type.equals("float") && !v.toString().matches("[0-9]+(\\.[0-9]+)?")) {
            e = new RuntimeException(v.toString() + "cannot be converted to float");
            System.out.println(e.toString());
            throw e;
        } else return true;
    }
}
