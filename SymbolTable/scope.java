package SymbolTable;

import java.time.format.SignStyle;
import java.util.HashMap;
import java.util.Map;

public class scope {
    scope parentScope;
    private Map<String, symbol> symbols ;

    public scope(scope parentScope) {
        symbols= new HashMap<>();
        this.parentScope = parentScope;
    }

    public scope getParentScope() {
        return parentScope;
    }

    public void define(symbol symbol) {

        symbols.put(symbol.getName(), symbol);
    }

    public symbol lookup(String name) {
        symbol symbol = symbols.get(name);
        if (symbol == null && parentScope != null) {
            symbol = parentScope.lookup(name);
        }
        return symbol;
    }

    public void print() {

        System.out.println(symbols.size());

        for (symbol s : symbols.values()) {
            System.out.println("id: " + s.getName() + "      type : " + s.getType() + "    scope : " + s.getScope().toString());
        }
//        if(parentScope!=null)
//        parentScope.print();
//
    }

}
