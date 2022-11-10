public class Assignment_1 {
    static double coumutProduct(double n1, double n2, double n3, double n4) {

        return (n1 * n2 * n3 * n4);
    }

    static int coumutSum(int n1, int n2, int n3, int n4) {

        return (n1 + n2 + n3 + n4);
    }

    static double coumutAcerage(double n1, double n2, double n3, double n4) {

        return (n1 + n2 + n3 + n4) / 4;
    }

    static int coumutmax(int n1, int n2, int n3, int n4) {


        int min = n1;
        if (n2 > min) {
            min = n2;

        }
        if (n3 > min) {
            min = n3;

        }
        if (n4 > min) {
            min = n4;

        }
        return min;
    }

    static String FotmatName(String firstName, String lastName) {

        return firstName.charAt(0) + "." + lastName;

    }

    static String generateEmail(String firstName, String lastName, boolean isStudent) {

        if (isStudent) {
            return firstName.toLowerCase().charAt(0) + lastName + "@sa.uqu.edu.sa";
        } else {
            return firstName.toLowerCase().charAt(0) + lastName + "@sa.uqu.edu.sa";
        }
    }

    static boolean validateEmail(String email) {


        if (email.equals("@sa.uqu.edu.sa") || email.equals("uqu.edu.sa"))
            return true;
        else {
            return false;
        }
    }

    static String getUsernameForamtEmail(String email) {
        int i = 0;
        String s = "";
        while (i < email.length()) {
            if (email.charAt(i) == '@') {
                break;
            }
            s = s + email.charAt(i);
        }
        return s;
    }


    static String getDomainNameFromEmail(String email) {
        int j = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                j = i;
                break;
            }
        }
        return email.substring(j + 1);

    }
}
