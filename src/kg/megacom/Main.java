package kg.megacom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws ParseException {
        ArrayDeque<String> booksIT = new ArrayDeque<>();
        Deque<Library> libraries = new ArrayDeque<>();
        libraries.add(new Library("Chinghiz Aitmatov", 1958, new SimpleDateFormat("dd-MM-yyyy").parse("25-12-1959"), "Jamila"));
        libraries.add(new Library("Jack London", 1909, new SimpleDateFormat("dd-MM-yyyy").parse("10-12-1910"), "Martin Eden"));
        libraries.addFirst(new Library("Alexander Pushkin", 1825, new SimpleDateFormat("dd-MM-yyyy").parse("10-12-1826"), "Eugene Onegin"));
        libraries.addLast(new Library("Alexander Pushkin", 1831, new SimpleDateFormat("dd-MM-yyyy").parse("10-12-1832"), "Belkin's Stories"));
        libraries.addFirst(new Library("Chinghiz Aitmatov", 1970, new SimpleDateFormat("dd-MM-yyyy").parse("10-12-1971"), "The White Ship"));
        libraries.offerFirst(new Library("Oscar Wilde", 1890, new SimpleDateFormat("dd-MM-yyyy").parse("10-12-1891"), "The Picture of Dorian Gray"));
        System.out.println("-------------------------------------------------------Added to ArrayDeque 6 writers---------------------------------------------------");
        libraries.forEach(System.out::println);
        System.out.println("-------------------------------------------------------Removed first and last writers--------------------------------------------------");
        libraries.removeFirst();
        libraries.removeLast();
        libraries.forEach(System.out::println);
        System.out.println("-------------------------------------------------------Offered last and first writers ------------------------------------------------------");
        libraries.offerLast(new Library("Leo Tolstoy", 1873, new SimpleDateFormat("dd-MM-yyyy").parse("10-12-1878"), "Anna Karenina"));
        libraries.offerFirst(new Library("Fyodor Dostoevsky", 1868, new SimpleDateFormat("dd-MM-yyyy").parse("10-12-1868"), "The Idiot"));
        libraries.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------Poll first writer------------------------------------------------------");
        libraries.pollFirst();
        libraries.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------Added programming books ------------------------------------------------");
        booksIT.add("The Art of Computer Programming");
        booksIT.addLast("Concrete Mathematics");
        booksIT.offerFirst("Structured Computer Organization");
        booksIT.offerFirst("Logic for problem solving");
        booksIT.offerLast("Machine Learning Engineering");
        booksIT.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------Removed last book--------------------------------------------------");
          booksIT.removeLast();
        booksIT.forEach(System.out::println);
        System.out.println("-------------------------------------------------------Checking for contains 'Machine Learning Engineering'--------------------------------");
        if (booksIT.contains("Machine Learning Engineering")){
            System.out.println("The book list is contains Machine Learning Engineering");
        }else{
            System.out.println("Not available");
        }
        System.out.println("-------------------------------------------------------Checking for contains 'Concrete Mathematics'--------------------------------");
        if (booksIT.contains("Concrete Mathematics")){
            System.out.println("The book list is contains Concrete Mathematics");
        }else{
            System.out.println("Not available");
        }
    }
}
