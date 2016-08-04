package br.com.ebrother.poc.conversor;

//@Mapper(withIgnoreMissing = IgnoreMissing.ALL)
public interface Conversor {

	public <S, T> T converter(S objetoOriginal, Class<T> classeDestino);

}
