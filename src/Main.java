import java.util.List;

public class Main {
    public static void main(String[] args) {
        aboba a = new aboba() {
            @Override
            public void run() {
                System.out.println("бегу");
            }
        };
        a.run();
    }
}
