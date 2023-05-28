package AST.string_val;

import AST.value;

public class stringval extends value {
    String string;

    public stringval() {
    }

    public void addArrayList(String text) {
        string =new String(text);


    }

    @Override
    public String toString() {
        return "'" + string + "'";
    }
}