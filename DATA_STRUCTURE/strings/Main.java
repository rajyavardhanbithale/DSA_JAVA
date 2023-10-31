public class Main {
    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean isUppercase = false;
        boolean isLowercase = false;
        boolean isDigit = false;
        boolean isSpecial = false;

        for (char c : password.toCharArray()) {
            if(Character.isUpperCase(c)){
                isUppercase = true;
            } else if(Character.isLowerCase(c)){
                isLowercase = true;
            } else if(Character.isDigit(c)){
                isDigit = true;
            }else{
                if ("!@#$%^&*()_+".indexOf(c) >=0) {
                    isSpecial = true;
                }
            }
        }

        return isDigit && isLowercase && isSpecial && isSpecial && isUppercase;
    }

    public static void main(String[] args) {
        String password1 = "StrongPass123!";
        String password2 = "weakpass";

        System.out.println("Password 1 is strong: " + isStrongPassword(password1));
        System.out.println("Password 2 is strong: " + isStrongPassword(password2));
    }
}
