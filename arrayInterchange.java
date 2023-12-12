public class arrayInterchange {

  public static void main(String[] args) {

    char oneD[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
    char twoD[][] = new char[5][5];
    char twoDnew[][] = new char[5][5];
    char thirD[][] = new char[5][5];
    int a = 0;

    System.out.print("Input Character Array = ");
    for (int i = 0; i < 9; i++) {
      System.out.print(oneD[i]);
    }
    System.out.print('\n');
    System.out.print('\n' + "Two Dimensional Array = " + '\n');

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        twoD[i][j] = oneD[a];
        System.out.print(twoD[i][j]);
        a++;
      }
      System.out.print('\n');
    }

    System.out.print("\n\n");
    System.out.print('\n' + "Intercharged Rows and Columns Array = " + '\n');

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        twoDnew[i][j] = twoD[i][j];
      }
      // System.out.print('\n');
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(twoDnew[j][i]);
      }
      System.out.print('\n');
    }

    System.out.print("\n\n");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        thirD[i][j] = twoDnew[i][j];
      }
      // System.out.print('\n');
    }
    System.out.print('\n' + "Reversing Back to Original Array " + '\n');

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(twoDnew[i][j]);
      }
      // System.out.print('\n');
    }
  }
}
