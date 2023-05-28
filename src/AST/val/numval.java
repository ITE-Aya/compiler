package AST.val;

import AST.value;

public class numval extends value
{
    String string;
    public numval(){

    }

    public void setString(String string) {
        this.string =new String(string);
    }

    @Override
    public String toString() {
        return  string ;
    }
}
