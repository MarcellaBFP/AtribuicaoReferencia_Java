package com.projeto.atribuicaoreferencia;

public class MeuObj extends Main {
	Integer num;
	
	
	public MeuObj(Integer num) {
		super();
		this.num = num;
	}

	public void setNum(Integer num) {
		this.num =num;
		
	}

	@Override
	public String toString() {
		return this.num.toString();
	}
	

}
