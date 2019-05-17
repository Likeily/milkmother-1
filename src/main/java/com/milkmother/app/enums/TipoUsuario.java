package com.milkmother.app.enums;

public enum TipoUsuario {
	
	PESSOAFISICA (1, "Pessoa Física"),
	PESSOAJURIDICA (2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoUsuario(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String descricao() {
		return descricao;
	}
	
	public static TipoUsuario toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for(TipoUsuario y : TipoUsuario.values()) {
			if (cod.equals(y.getCod())) {
				return y;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
	
}