package AST.decoration;

public class border {
    String borderradius;
    String circular;
    int numval;

    public border() {
        this.borderradius = new String();
        this.circular = new String();
    }
    public void addmode(String text,String text2,int numval) {
        this.borderradius=text;
        this.circular=text2;
        this.numval = numval;
    }

    @Override
    public String toString() {
        return
                "borderRadius:" + borderradius  +
                        "."+ circular  +
                        "(" + numval +")"
                ;
    }
}
