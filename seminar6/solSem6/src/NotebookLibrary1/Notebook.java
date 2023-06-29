package NotebookLibrary1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Notebook {

    public String brand;
    public double price;
    public int memory;
    public String processor;
    public String graphicsCard;

    public Notebook(String brand, double price, int memory, String processor, String graphicsCard) {
        this.brand = brand;
        this.price = price;
        this.memory = memory;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
    }

    public boolean medSup() {
        return true;
    }

    @Override
    public String toString() {
        return "марка: "+ brand+"  цена: "+price+ " память: "+ memory+" процессор:"+ processor+" видеокарта:"+graphicsCard;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Notebook notebook = (Notebook) o;
        return brand == notebook.brand && price == notebook.memory && processor == notebook.graphicsCard;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, memory, processor, graphicsCard);
    }

}