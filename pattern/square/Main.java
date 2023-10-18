// simple_square
// *****
// *****
// *****
// *****
// *****

// rectangle
// **********
// **********
// **********
// **********
// **********

// custom_char_square
// ?????
// ?????
// ?????
// ?????
// ?????

// custom_char_rectangle
// &&&&&&&&&&
// &&&&&&&&&&
// &&&&&&&&&&
// &&&&&&&&&&
// &&&&&&&&&&

public class Main {
    public static void main(String[] args) {
        int size = 5;
        simple_square(size);

        int row = 5, col = 10;
        rectangle(row, col);

        char ch = '?';
        custom_char_square(size, ch);

        char ch1 = '&';
        custom_char_rectangle(row, col,ch1);
    }

    static void simple_square(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    static void rectangle(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    static void custom_char_square(int size, char ch) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(ch);
            }
            System.out.println("");
        }
    }

    static void custom_char_rectangle(int row, int col,char ch) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ch);
            }
            System.out.println("");
        }

    }

}

