package AST.List;

import java.util.ArrayList;

public class Objects {
    ArrayList<Varible> varibles;

    public Objects()
    {
        this.varibles=new ArrayList<>();
    }

    public void addChild(Varible varible)
    {
        this.varibles.add(varible);
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<varibles.size();i++)
        {
            if(i>0)
                stringBuilder.append(",\n");
            stringBuilder.append(varibles.get(i));


        }
        stringBuilder.append('\n');
        return stringBuilder.toString();
    }

}
