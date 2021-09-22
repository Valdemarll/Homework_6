package Task2;

public class Sequence {
    public Object[] array;

    Sequence(Object[] array){
        this.array = array;
    }

    public class Selector{
        public int i = 0;

        public Object current(){
            return array[i];
        }

        public void next(){
            i += 1;
        }

        public boolean end(){
            if (i == array.length){
                return false;
            }else{
                return true;
            }
        }

    }
}
