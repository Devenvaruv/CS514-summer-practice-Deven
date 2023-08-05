package main;

public class MathHelper {

    /** Returns the sum of 1 + 2 + 3 + ... + n
     *
     * @param n
     * @return sum of elements from 1 to n
     */
    public static int arithmeticSeries(int n) {
//        int counter = 0;
//        for(int i = 0; i <= n; i++){
//            counter = counter + n - i;
//        }
//        return counter;
//        if(n == 1 || n == 0){
//            return n;
//        } else return arithmeticSeries(n - 1) + arithmeticSeries(n - 2);
        return (n == 1 || n == 0)? n : arithmeticSeries(n - 1) + arithmeticSeries(n - 2);
    }


    /** Takes three line segments (a, b, c) and checks if they can form a triangle.
     *  Three line segments can form a triangle if the sum of the lengths of any
     *  two line segments exceeds the length of the third line segment.
     *
     * @param a
     * @param b
     * @param c
     * @return true if these lines segments can form a triangle, and false otherwise
     */
    public static boolean validTriangle(int a, int b, int c) {
//        if(a+b>c || b+c>a || a+c>b){
//            return true;
//        }
//        else return false;
        //TODO: Replace with your code.
        return a + b > c || b + c > a || a + c > b;
    }

    public static void main(String[] args) {
        System.out.println(MathHelper.arithmeticSeries(10));
        System.out.println(MathHelper.validTriangle(3, 6, 8));
    }
}
