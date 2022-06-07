package HomeWork;

public class HomeWork {

        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
        }

        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        public static void checkSumSign() {
            int a = 3;
            int b = 7;
            if (a + b >= 0) {
                System.out.println("Сумма положительна");
            }
            else {
                System.out.println("Сумма отрицательна");
            }
        }
        public static void printColor() {
            int value = 15;
            if (value <= 0) {
                System.out.println("Red");
            } else if (value > 0 && value <=100) {
                System.out.println("Yellow");
            } else {
                System.out.println("Green");
            }
        }
    public static void compareNumbers() {
        int a = 15;
        int b = 5;
        if (a >= b) {
            System.out.println(a + " больше или равно " + b);
        }
        else {
            System.out.println(a + " меньше " + b);
        }
    }
    }

