import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        // Create a list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(4);
        list.add(64);
        list.add(18);
        list.add(10);
        System.out.println(list);

        // Convert the ArrayList into Square of numbers using stream()
        System.out.println(list.stream().map(i -> i *i).collect(Collectors.toList()));

        System.out.println(list.stream().map(i->i+(i+1)).collect(Collectors.toList()));

        System.out.println(list.stream().filter(e->e%2!=0).collect(Collectors.toList()));

        System.out.println(list.stream().sorted().collect(Collectors.toList()));

        System.out.println(list.stream().sorted().findFirst());
        
        list.stream().forEach(e->System.out.println(e + "-"));
        
        list.forEach(mul->{System.out.println(mul); System.out.println(mul); System.out.println(mul);});

        // Convert the ArrayList into Set with Square of numbers using stream()
        Set<Integer> sq_list2 = list.stream().map(i -> i *
                i).collect(Collectors.toSet());
        System.out.println(sq_list2);

        // Use the filter() method of stream() class
        // Create a list of Strings first
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("Kotlin");
        list1.add("Ruby");
        list1.add("PHP");

        List<String> str_lists = list1.stream().filter(i -> i.startsWith("P")).collect(Collectors.toList());
        System.out.println(str_lists);

        // Use the sorted() method of the Stream API to sort the values
        List<Integer> sort_list = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sort_list);

        // Use forEach() method of stream API to iterate over the elements
        list.stream().forEach(i -> System.out.println(i * 2));

        // Reduce() method in Streams API
        System.out.println("The list is: " + list);
        int sum = list.stream().reduce(0, (res, i) -> res + i); // It will print the sum of all elements in list
        System.out.println("The Sum of the list is: " + sum);

    }
}
