package AST;

public class varname {
String string;

    public varname() {
        string =new String();
    }

    public void setString(String string) {
        this.string =new String(string);
    }

    @Override
    public String toString() {
        return   string ;
    }
}
