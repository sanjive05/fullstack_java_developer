package java8.features.streams;


import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Author> authors = Arrays.asList(
                new Author("Jane Austen", Arrays.asList(new Book("Pride and Prejudice"), new Book("Emma"))),
                new Author("Charles Dickens", Arrays.asList(new Book("Oliver Twist"), new Book("A Tale of Two Cities"))),
                new Author("Leo Tolstoy", Arrays.asList(new Book("War and Peace"), new Book("Anna Karenina")))
        );
		
		authors.stream()
		.map(s-> s.getBooks().stream()).forEach(x-> System.out.println(x));
		
		authors.stream().flatMap(s->s.getBooks().stream()).forEach(x -> System.out.println(x));

	}

}
