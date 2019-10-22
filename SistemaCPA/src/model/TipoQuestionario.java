/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author carli
 */
public class TipoQuestionario {
    private int id;
    private String nome;
    private String descricao;
    private TipoPergunta tipo_pergunta;
    private List<RespostaQuestionario> resposta_questionario;

    public TipoQuestionario() {}

    public TipoQuestionario(int id, String nome, String descricao, TipoPergunta tipo_pergunta, List<RespostaQuestionario> resposta_questionario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo_pergunta = tipo_pergunta;
        this.resposta_questionario = resposta_questionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoPergunta getTipo_pergunta() {
        return tipo_pergunta;
    }

    public void setTipo_pergunta(TipoPergunta tipo_pergunta) {
        this.tipo_pergunta = tipo_pergunta;
    }

    public List<RespostaQuestionario> getResposta_questionario() {
        return resposta_questionario;
    }

    public void setResposta_questionario(List<RespostaQuestionario> resposta_questionario) {
        this.resposta_questionario = resposta_questionario;
    }
    
}
