package com.bigcorp.project.main.lambda;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Window {

	private Clickable clickable;

	public void onClick(int force) {
		// choisit le bon Clickable qui est cliqué
		String returnValue = clickable.click(force);
		System.out.println(returnValue);
	}

	public void setClickable(Clickable clickable) {
		this.clickable = clickable;
	}

	public static void main(String[] args) {
		Window maFenetre = new Window();
		maFenetre.setClickable(new CloseButton());
		maFenetre.onClick(12);

		maFenetre.setClickable(new LoadButton());
		maFenetre.onClick(30);

		maFenetre.setClickable(new Clickable() {
			@Override
			public String click(int force) {
				return "un bouton implémenté en ligne a fait une action";
			}
		});
		maFenetre.onClick(43);

		Clickable resetSystem = (int force) -> {
			return "reset system";
		};
		maFenetre.setClickable(resetSystem);
		maFenetre.onClick(4);

		// Le code ci-dessous sera préféré :
		maFenetre.setClickable((int force) -> {
			return "reset system avec la force : " + force;
		});
		// Voire la version raccourcie :
		maFenetre.setClickable(force -> "reset system avec la force : " + force);

		int a = 0;
		maFenetre.setClickable(force -> {
			int c = a;
			c++;
			return a + "" + force + c;
		});

		Predicate<String> estCeQueLaChaineAplusDe3Caracteres = (String s) -> {
			return s.length() > 3;
		};
		
		
		Predicate<String> estCeQueLaChaineEstVide = String::isEmpty;
		
		BiFunction<String, Double, String> maBiFonction = (s1, d1) -> {return s1 + d1;};

	}




}
