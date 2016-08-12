package br.com.ebrother.modelo.service.enums;

public enum MessageKeyEnum {

	ERRO("msg.erro");

	private String key;

	private MessageKeyEnum(final String key) {
		this.key = key;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(final String key) {
		this.key = key;
	}

}
