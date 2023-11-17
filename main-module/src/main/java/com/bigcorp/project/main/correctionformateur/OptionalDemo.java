package com.bigcorp.project.main.correctionformateur;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<Integer> resultat = calculeTruc();
	
		if(resultat.isPresent()) {
			Integer integer = resultat.get();
			integer += 4;
		}
		
	}
	
	public static Optional<Integer> calculeTruc(){
		boolean calculPasPossible = false;
		if(calculPasPossible) {
			return Optional.empty();
		}
		//else
		return Optional.of(42);
	}

}
