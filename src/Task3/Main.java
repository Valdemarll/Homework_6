package Task3;

public class Main {
    public static void main(String[] args) {
        PrintClass printClass = new PrintClass();

        printClass.actionPrint(new IPrint() {
            @Override
            public void print(){
                System.out.println("Первая реализация");
            }
        });

        printClass.actionPrint(new IPrint() {
            @Override
            public void print(){
                System.out.println("Вторая реализация");
            }
        });

        printClass.actionPrint(new IPrint() {
            @Override
            public void print(){
                System.out.println("Третья реализация");
            }
        });
    }
}
