package AST.Class;

import java.util.ArrayList;


public class Class {
    ArrayList<ClassFull>classFulls;
    ArrayList<ClassLess>classLesses;
    public Class(){
        classFulls=new ArrayList<>();
        classLesses=new ArrayList<>();

    }
    public void addCF(ClassFull classFull){
        classFulls.add(classFull);

    }
    public void addCL(ClassLess classFull){
        classLesses.add(classFull);

    }

    @Override
    public String toString() {
        if (classLesses.size()==0){
            return ""+classFulls.get(0);
        }else return ""+classLesses.get(0);


    }
}
