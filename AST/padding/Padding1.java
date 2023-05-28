package AST.padding;

public class Padding1 {
    String string;
    public Padding1()
    {
        this.string=new String();
    }

    public void addChild(String text)
    {
    this.string=new String(text);
    }

    @Override
    public String toString() {
        return "padding:EdgeInsets.all("+string+")";
    }
}
