package br.com.ebrother.modelo.converter;

import org.junit.Assert;
import org.junit.Test;

import br.com.ebrother.modelo.converter.ContatoConverter;
import br.com.ebrother.modelo.dto.ContatoDTO;
import br.com.ebrother.modelo.model.Contato;
import br.com.ebrother.poc.test.AbstractBaseUnitTest;

public class ContatoConverterTest extends AbstractBaseUnitTest<ContatoConverter> {

	@Test
	public void converterParaEntidadeTest() {
		final ContatoDTO dto = new ContatoDTO();
		dto.setEmail("email");
		dto.setId(1L);
		dto.setNome("nome");
		final Contato actual = this.classeEmTeste.converterParaEntidade(dto);
		Assert.assertTrue(actual.getId().equals(1L));
		Assert.assertTrue(actual.getNome().equals("nome"));
		Assert.assertTrue(actual.getEmail().equals("email"));
	}

}
