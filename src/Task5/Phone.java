package Task5;

public class Phone {
    public String colour;
    public String title;
    public double size;
    public int price;

    Phone(String colour, String title, double size, int price){
        this.colour = colour;
        this.price = price;
        this.size = size;
        this.title = title;
    }

    public String toString(){
        return "Телефон:\nНазвание модели - " + title +
                "\nЦвет - " + colour +
                "\nРазмер - " + size + " дюйм(а/ов)" +
                "\nЦена - " + price;
    }

    public static class Builder{
        private String colour;
        private String title;
        private double size;
        private int price;

        Builder(){
        }

        public Phone build(){
            return new Phone(colour, title, size, price);
        }

        public Builder setColour(String colour){
            this.colour = colour;
            return this;
        }

        public Builder setTitle(String title){
            this.title = title;
            return this;
        }

        public Builder setSize(double size){
            this.size = size;
            return this;
        }

        public Builder setPrice(int price){
            this.price = price;
            return this;
        }

    }






}
