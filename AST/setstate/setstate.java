package AST.setstate;

import java.util.ArrayList;

public class setstate {
    ArrayList<setstate1>setst;


    public setstate() {
        this.setst = new ArrayList<>();
    }
    public void addchild(setstate1 ee) {
        this.setst.add(ee);
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("\n");
        for(setstate1 child: this.setst){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString()+" });";

    }
}
