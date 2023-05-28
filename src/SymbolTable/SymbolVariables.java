package SymbolTable;

public class SymbolVariables extends symbol {
    String value;

    public SymbolVariables(String name, String type, scope current, String value) {
        super(name, type, current);
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
