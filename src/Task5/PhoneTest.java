package Task5;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneTest {
    Phone phone = new Phone("Черный", "Gunix M34", 5.4, 12355);
    @Test
    public void testToString() {
        assertEquals(
                "Телефон:\nНазвание модели - Gunix M34\nЦвет - Черный\nРазмер - 5.4 дюйм(а/ов)\nЦена - 12355",
                phone.toString()
        );
    }
    @Test
    public void builder(){
        Phone build1 = new Phone.Builder()
                .setColour("Черный")
                .setPrice(12355)
                .setSize(5.4)
                .setTitle("Gunix M34")
                .build();

        assertEquals(
                "Телефон:\nНазвание модели - Gunix M34\nЦвет - Черный\nРазмер - 5.4 дюйм(а/ов)\nЦена - 12355",
                build1.toString()
        );
    }

}