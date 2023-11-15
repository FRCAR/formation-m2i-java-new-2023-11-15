package com.bigcorp.project.main.lambda;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {

		//Création d'une collection de Strings
		List<String> mesChaines = new ArrayList<>();
		mesChaines.add("Salut");
		mesChaines.add("C'est le soir");
		mesChaines.add("Tenez bon !!!");

		//Opérations sur la collection avec une boucle
		for (String maChaine : mesChaines) {
			if (maChaine.length() > 6) {
				System.out.println(maChaine);
			}
		}

		// Opérations sur la collection avec un stream
		// La boucle du haut est équivalente au code ci-dessous
		mesChaines.stream()
				.filter((String s) -> {
					return s.length() > 6;
				})
				.forEach((String s) -> {
					System.out.println(s);
				});

		// En version réduite :
		mesChaines.stream()
				.filter(s -> s.length() > 6)
				.forEach(System.out::println);
		
		//Utilisation de map pour transformer un stream 
		//d'un type vers un stream d'un autre type
		mesChaines.stream()
			.map((String s) -> {
				Personne p = new Personne(); 
				p.setName(s);
				return p;})
			.filter((Personne p) -> {return p.getId() > 13;})
			.forEach((Personne p) -> {System.out.println(p);});

	}

	private static final class Personne {

		private Integer id;
		private String name;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
