package SymbolTable;

public class symbol {
    String name;
    String type;
    scope currentScope;

    public symbol(String name, String type, scope currentScope) {
        this.name = name;
        this.type = type;
        this.currentScope = currentScope;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return type;
    }

    public scope getScope() {
        return currentScope;
    }

}
