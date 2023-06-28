package Solution;

import java.io.FilterInputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class hometask2 {
  public static void queue1(String[] args) {
    ArrayDeque<String> states = new ArrayDeque<String>();
    // стандартное добавление элементов
    states.add("Germany");
    states.addFirst("France"); // добавляем элемент в самое начало
    states.push("Great Britain"); // добавляем элемент в самое начало
    states.addLast("Spain"); // добавляем элемент в конец коллекции
    states.add("Italy");
          
    // получаем первый элемент без удаления
      String sFirst = states.getFirst();
      System.out.println(sFirst);     // Great Britain
      // получаем последний элемент без удаления
      String sLast = states.getLast();
     System.out.println(sLast);      // Italy
}
}