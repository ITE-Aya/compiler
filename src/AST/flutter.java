package AST;

import AST.Class.Class;
import AST.Import.*;
import AST.main.*;

import java.util.ArrayList;
import java.util.List;

public class flutter {
    ArrayList<Import> imports;
    main main;
    ArrayList<Class> classes;
    ArrayList<AST.List.List> lists;

    public flutter() {
        imports = new ArrayList<>();
        classes = new ArrayList<>();
        lists = new ArrayList<>();
    }

    public void setMain(main main) {
        this.main = main;
    }

    public void addimport(Import Import) {
        imports.add(Import);
    }

    public void addclass(Class Import) {
        classes.add(Import);
    }

    public void addlist(AST.List.List Import) {
        lists.add(Import);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (imports.size() > 0) {
            for (int i = 0; i < imports.size(); i++) {
                stringBuilder.append(imports.get(i));
                stringBuilder.append("\n");
            }
        }
        stringBuilder.append(main);
        stringBuilder.append("\n");
        if (lists.size() > 0) {
            for (int i = 0; i < lists.size(); i++) {
                stringBuilder.append(lists.get(i));
                stringBuilder.append("\n");
            }
        }

        if (classes.size() > 0) {
            for (int i = 0; i < classes.size(); i++) {
                stringBuilder.append(classes.get(i));
                stringBuilder.append("\n");
            }

        }
        return stringBuilder.toString();
    }
}