package br.com.ebrother.poc.conversor;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

@Mapper(withIgnoreMissing = IgnoreMissing.ALL)
public interface Conversor {

	public <S, T> T converter(S objetoOriginal, Class<T> classeDestino);

}
