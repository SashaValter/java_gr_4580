import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class task4 {
  // напишите метод, который составит строчку из
  // ста повторных слов "test" и метод, который запишет эту строку
  // в простой текстовый файл и обработает исключения
  public static void writeTestToFile(int n) throws IOException {
    try (PrintWriter pw = new PrintWriter(new FileWriter("output.txt"))) {
      pw.println(generateString("test", n));
    }
  }
// try - это место, где предположительно может быть ошибка
// catch - место, в котором ее будем исправлять
  public static String generateString(String s, int repeatCount) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < repeatCount; i++) {
      sb.append("test\n");
    }
    return sb.toString();
  }
}
