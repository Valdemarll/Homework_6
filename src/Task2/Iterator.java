package Task2;

public class Iterator {
    private final Object[] objArray;
    Iterator(Object[] objArray){
        this.objArray = objArray;
    }

    public String go() {
        Sequence sequence = new Sequence(this.objArray);
        Sequence.Selector selector = sequence.new Selector();
        String res = "";

        while (selector.end()){
            res += selector.current() + "\n";
            selector.next();
        }
        return res;
    }

    public void print(){
        System.out.println(go());
    }


}
