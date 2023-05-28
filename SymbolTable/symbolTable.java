package SymbolTable;

import java.util.ArrayList;

public class symbolTable {
    ArrayList<scope> scopes;

    public symbolTable() {
        scopes = new ArrayList<>();
    }
    public int getsize(){
        return scopes.size();
    }
    public void addScopes(scope s) {
        scopes.add(s);
    }

    public void printSymbols() {
        for (int i = 0; i < scopes.size(); i++) {
            System.out.println("--------"+(i+1)+"--------------");
            scopes.get(i).print();
        }
    }
}
