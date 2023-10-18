public class Main {
    public static void main(String[] args) {
        int size = 5;
        lower_left_triangle(size);
        System.out.println();

        upper_left_triangle(size);

        System.out.println();
        middle_star_left(size);

        System.out.println();
        upper_right_triangle(size);
    }

    static void lower_left_triangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void upper_left_triangle(int size) {
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void middle_star_left(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    static void upper_right_triangle(int size) {
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }

        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}