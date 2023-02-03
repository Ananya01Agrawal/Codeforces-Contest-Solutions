// problem link

https://codeforces.com/contest/1791/problem/A


import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      char c = sc.next().charAt(0);
      if (c == 'c' || c == 'o' || c == 'd' || c == 'e' || c == 'f' || c == 'r' || c == 'c' || c == 'e' || c == 's') {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}
