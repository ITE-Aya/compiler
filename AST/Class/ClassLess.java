package AST.Class;

import AST.*;
import AST.build.*;

import java.util.ArrayList;

public class ClassLess {
    varname varname;
    ArrayList<declarevar> declarevars;
    build build;

    public ClassLess() {
        declarevars = new ArrayList<>();

    }

    public void setVarname(varname varname) {
        this.varname = varname;
    }

    public void setBuild(build build) {
        this.build = build;
    }

    public void adddeclarevar(declarevar declarevar) {
        declarevars.add(declarevar);

    }


    @Override
    public String toString() {
        if (declarevars.size() != 0) {

            StringBuilder s = new StringBuilder();
            for (int i = 0; i < declarevars.size(); i++) {
                s.append(declarevars.get(i));
                //s.append('\n');
            }
            return "class " + varname
                    + " extends StatelessWidget{ \n" + s.toString() +
                    "@override\n" +
                    build + "\n}"
                    ;
        }
        return "class " + varname
                + " extends StatelessWidget{ \n" + "\n" +
                "@override\n" +
                build + "\n}"
                ;

    }
}
