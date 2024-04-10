public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int gradeScore){
        if(gradeScore >= 90) {
            char gradeA = 'A';
            return gradeA;
        } else if(gradeScore >= 80 && gradeScore <= 89){
            char gradeB = 'B';
            return gradeB;
        }else if(gradeScore >=70 && gradeScore <=79){
            char gradeC = 'C';
            return gradeC;
        }else if(gradeScore >=60 && gradeScore <=69){
            char gradeD = 'D';
            return gradeD;
        }else if(gradeScore >=50 && gradeScore <=59){
            char gradeE = 'E';
            return gradeE;
        } else {
            char gradeF = 'F';
            return gradeF;
        }
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int n){
        if(n%3 == 0 && n%5 == 0){
            return "fizzbuzz";
        } else if(n%3==0){
            return "fizz";
        } else if(n%5 == 0){
            return "buzz";
        } else{
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String str){
        if (str.length() < 2) {
            return str;
        } else {
            String front = str.substring(0, 2);
            return front + str + front;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne( int a, int b, int c){
        if(a+b == c || a+c == b || b+c == a){
            return true;
        }
        return false;
    }

    // Question 5 - endUp
    public static String endUp(String str){
        if(str.length() < 3){
            return str.toUpperCase();
        } else{
            String prefix = str.substring(0, str.length() - 3);
            String suffix = str.substring(str.length() - 3).toUpperCase();
            return prefix + suffix;
        }
    }

}
