import java.util.*;
public class kodutoo2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> Animals = new ArrayList<String>();
        do {
          System.out.println("Sisesta Looma nimi, liik, vanus, sugu(M/N), hind(€)");
          Animals.add(input.nextLine());
          System.out.println("Kas tahad rohkem lisada? (jah/ei)");
              if (input.next().startsWith("jah")) {
                  System.out.println("Lisa uus: ");
                  Animals.add(input.next());
              } else {
                break;
            }
        } while (true);
        input.close();
        System.out.println(Animals);
    }
  }