package br.fepi.si.parcelamentos.domain.exception;

public class NegocioException extends RuntimeException{

    public NegocioException(String mensagem){
        super(mensagem);
    }
}
