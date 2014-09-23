public class WhileLoop {
  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    int i = 0;
    int v = 1;
    while (i <= N) {
      System.out.println(i + " " + v);
      i += 1;
      v = 2 * v;
    }
  }
}
