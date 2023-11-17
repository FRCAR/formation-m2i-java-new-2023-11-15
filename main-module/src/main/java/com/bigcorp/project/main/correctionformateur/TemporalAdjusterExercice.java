package com.bigcorp.project.main.correctionformateur;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterExercice {

	public static void main(String[] args) {
		//Trouver et afficher le dernier mardi précédant aujourd’hui.
		LocalDate lastTuesday = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
		System.out.println("Le dernier mardi est : " + lastTuesday);
	}

}