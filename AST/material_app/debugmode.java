package AST.material_app;

public class debugmode  {
    String boolval;

    public debugmode() {
        this.boolval = new String();
    }

    public void addmode(String text) {
       this.boolval=new String(text);
    }

    @Override
    public String toString() {
        return "debugShowCheckedModeBanner:" + boolval+',' ;
    }

}
