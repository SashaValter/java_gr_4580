import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import NotebookLibrary1.Notebook;

public class App {
    public static void main(String[] args) throws Exception {
        Set notebookSet = new HashSet();
        notebookSet.add(new Notebook("Lenovo", 45000.0, 4, "Intel Pentium", "Intel HD Graphics610"));
        notebookSet.add(new Notebook("HP", 75000.0, 32, "Intel Core i9", "AMD Radeon Pro 5500M"));
        for (Notebook notebook : notebookSet) {
        System.out.println(notebook);
        }
    }
}
