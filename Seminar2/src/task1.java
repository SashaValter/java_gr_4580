public class task1 {
        //  * Дано четное число N (>0) и символы c1 и c2.
        //  * Написать метод, который вернет строку длины N, которая
        //  * состоит из чередующихся символов c1 и c2, начиная с c1.
  
  public static void execute(){
    int N=14;
    char c1 = 'A';
    char c2 = 'B';
     StringBuilder result = new StringBuilder();
     for (int i = 0; i< N; i++){
      if (i%2==0){
      result.append(c1);
      }
      if (i%2!=0){
      result.append(c2);
      }
     }
     System.out.println(result.toString());
  }
}
