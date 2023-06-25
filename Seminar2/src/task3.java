public class task3 {
  /*
   * Напишите метод, который принимает на вход строку (String) и
   * определяет является ли строка палиндромом (возвращает
   * boolean значение).
   */
  public static boolean сheckPolydrome(String line) {
    boolean res = false;
    char [] order = line.toCharArray();//переводим строку в массив
    for (int i =0; i< line.length(); i++){
    if (order[i] == order[order.length-i-1]){
      res = true;
    }
    }
    return res;
  }
}
