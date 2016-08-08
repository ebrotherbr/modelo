package br.com.ebrother.modelo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.ebrother.poc.exception.NegocioException;
import br.com.ebrother.poc.exception.NenhumRegistroEncontradoException;
import br.com.ebrother.poc.exception.util.ResponseExceptionDTO;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(NenhumRegistroEncontradoException.class)
	public ResponseEntity<String> nenhumRegistroEncontrado(final HttpServletRequest req,
			final NenhumRegistroEncontradoException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(NegocioException.class)
	public ResponseEntity<ResponseExceptionDTO> erroDeNegocio(final HttpServletRequest req, final NegocioException e) {
		final ResponseExceptionDTO response = new ResponseExceptionDTO();
		response.setMensagem(e.getMensagem());
		response.setTipo(e.getTipo().getDescricao());
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}

}
