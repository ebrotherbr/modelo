package br.com.ebrother.modelo.converter;

import br.com.ebrother.modelo.dto.CategoriaDTO;
import br.com.ebrother.modelo.model.Categoria;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

@Mapper(withIgnoreMissing = IgnoreMissing.ALL)
public interface CategoriaConverter {

	public Categoria converterParaEntidade(CategoriaDTO dto);

	public CategoriaDTO converterParaDTO(Categoria entidade);

}
