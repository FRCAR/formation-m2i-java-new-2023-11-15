package com.bigcorp.project.main.lambda;

public class CloseButton implements Clickable {

	@Override
	public String click(int force) {
		return "Il faut fermer la fenêtre";
	}

}
