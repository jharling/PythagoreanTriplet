package com.company;

public class Main {

    public static void main(String[] args) {
        //11
        /*
			A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

			a^2 + b^2 = c^2
			For example, 3^2 + 4^2 = 5^2.

			There exists exactly one Pythagorean triplet for which a + b + c = 1000.
			Find the product abc.
		*/

        int answer = 0;
        int limit = 1000;
        phyth_loop:
        for (int a = 3; a < limit; a++) {
            for (int b = 4; b < limit; b++) {
                for (int c = 5; c < limit; c++) {
                    if (checkSum(a, b, c) && checkPyth(a, b, c)) {
                        System.out.println("a: " + a);
                        System.out.println("b: " + b);
                        System.out.println("c: " + c);
                        answer = a * b * c;
                        break phyth_loop;
                    }
                    c++;
                }
                b++;
            }
            a++;
        }
        System.out.println("answer: " + answer);
    }

    private static Boolean checkSum(int a, int b, int c) {
        return (a + b + c == 1000);
    }

    private static Boolean checkPyth(int a, int b, int c) {
        return ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2));
    }
}
