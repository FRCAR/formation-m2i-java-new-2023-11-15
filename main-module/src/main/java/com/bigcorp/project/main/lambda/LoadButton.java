package com.bigcorp.project.main.lambda;

public class LoadButton implements Clickable {

	@Override
	public String click(int force) {
		return "Je charge avec la force : " + force;
	}

}
