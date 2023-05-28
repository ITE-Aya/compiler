package AST.Class;

public class ClassFull {
    ClassFull1 classFull1;
    ClassFull2 classFull2;
    public ClassFull(){
        classFull1 =new ClassFull1();
        classFull2 =new ClassFull2();
    }

    public void setClassFull1(ClassFull1 classFull1) {
        this.classFull1 = classFull1;
    }

    public void setClassFull2(ClassFull2 classFull2) {
        this.classFull2 = classFull2;
    }

    @Override
    public String toString() {
        return  ""+classFull1 + classFull2 ;
    }
}
