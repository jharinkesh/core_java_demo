package java8;

import java.util.Arrays;
import java.util.List;

public class testing {

    public static void main(String[] args) {
	List<Integer> ls = Arrays.asList(2, 3, 41, 5, 6);
//	ls.forEach(i -> System.out.println(i));
//	ls.parallelStream().findAny()
//	Stream<Integer> s = ls.stream();
//	s.forEach(System.out::println);
//	s.forEach(System.out::println);
//	LocalDate d = LocalDate.now();
//	LocalDate d = LocalDate.of(2020, 12, 2);
//	LocalDate d = LocalDate.of(2020, Month.JANUARY, 2);

//	LocalTime d = LocalTime.now();
//	LocalTime d = LocalTime.of(01, 23);
//	LocalTime d = LocalTime.now(ZoneId.of("UTC"));

//	System.out.println(d);

//	for (String s : ZoneId.getAvailableZoneIds()) {
//	    System.out.println(s);
//	}

//	ls.forEach(System.out::println);
//	ls.forEach(new testing()::print);

//	Consumer<Integer> c = x -> System.out.println("-- " + x);
//	ls.forEach(c);

//	Optional<Integer> op = ls.stream().filter(x -> x % 2 == 0).findFirst();
//	if (op.isPresent())
//	    System.out.println(op.get());

//	System.out.println(ls.stream().map(x -> x * 2).findFirst().get());

//	List<Item> lst = Arrays.asList(at(3), at(4), at(5), at(6));
//	System.out.println(lst.stream().map(x -> new MyItem(x.val)).findFirst().get());
//	System.out.println(ls.stream().reduce((x, y) -> {
//	    System.out.println("in: " + x + ": " + y);
//	    return x + y;
//	}).get());

//	System.out.println(ls.stream().reduce(0, (x, y) -> {
//	    System.out.println("in: " + x + ": " + y);
//	    return x + y;
//	}));

//	System.out.println(ls.stream().reduce(Integer::sum).get());
//	System.out.println(ls.stream().reduce(0, Integer::sum));

	List<Integer> lis = Arrays.asList(5, 8, 10, 12, 15, 18, 20);
//	System.out.println(lis.stream().filter(x -> x % 5 == 0).reduce(0, (a, b) -> a + b));

	System.out.println(lis.stream().filter(x -> x % 19 == 0).findFirst().orElse(0));

    }

    void print(Object o) {
	System.out.println(o);
    }

    static Item at(int a) {
	return new Item(a);
    }
}

class MyItem {
    int val;

    MyItem(int val) {
	this.val = val;
    }

    @Override
    public String toString() {
	return val + "";
    }

}

class Item {
    int val;

    Item(int val) {
	this.val = val;
    }

    @Override
    public String toString() {
	return val + "";
    }

}
