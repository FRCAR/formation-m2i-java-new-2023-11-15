package com.bigcorp.project.main.correctionformateur;

import java.util.stream.Stream;

public class StreamNew {

	public static void main(String[] args) {

		// TakeWhile
		System.out.println("\nTakewhile");
		Stream.of("a", "b", "c", "", "e")
				.takeWhile(s -> !s.isEmpty())
				.forEach(System.out::print);

		// DropWhile
		System.out.println("\nDropwhile");
		Stream.of("a", "b", "c", "", "e")
				.dropWhile(s -> !s.isEmpty())
				.peek(s -> System.out.println("j'évalue : -" + s + "-"))
				.forEach(System.out::print);

		//Iterate de Stream avec deux arguments (seed et unaryoperator)
		//Le premier élément du stream vaut 3 (seed)
		//Les suivants sont construits ainsi : élément(n+1) = élément(n) * 3 (unaryoperator)
		//Le stream est illimité, il va falloir le couper avec takeWhile
		System.out.println("\nIterate");
		Stream
				.iterate(3, i -> 3 * i)
				.takeWhile(i -> i < 10_000_000)
				.dropWhile(i -> i < 10_000)
				.forEach(System.out::println);
		

		//Iterate de Stream avec trois arguments (seed, predicate et unaryoperator)
		//Le premier élément du stream vaut 3 (seed)
		//Les suivants sont construits ainsi : élément(n+1) = élément(n) * 3 (unaryoperator) 
		//iterate continue tant que le predicate renvoie true
		Stream
				.iterate(3, i -> i < 1_000 ,i -> 3 * i)
				.forEach(System.out::println);


	}

}
