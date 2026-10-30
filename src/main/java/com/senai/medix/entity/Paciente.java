package com.senai.medix.entity;

import com.senai.medix.enuns.Convenio;
import com.senai.medix.enuns.Sexo;
import com.senai.medix.enuns.StatusAtendimento;
import com.senai.medix.enuns.TipoSanguineo;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private LocalDate dataNascimento;
    @Enumerated(EnumType.STRING)
    private Convenio convenio;
    @Enumerated(EnumType.STRING)
    private TipoSanguineo tipoSanguineo;
    private Double peso;
    @Enumerated(EnumType.STRING)
    private StatusAtendimento statusAtendimento = StatusAtendimento.AGUARDANDO;
    private String alergias;
    private String obeservacoes;

    public Paciente(){}

    public Paciente(Long id, String nome, String cpf, String telefone, Sexo sexo, LocalDate dataNascimento, Convenio convenio, TipoSanguineo tipoSanguineo, Double peso, StatusAtendimento statusAtendimento, String alergias, String obeservacoes) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.convenio = convenio;
        this.tipoSanguineo = tipoSanguineo;
        this.peso = peso;
        this.statusAtendimento = statusAtendimento;
        this.alergias = alergias;
        this.obeservacoes = obeservacoes;
    }

    public Paciente(String nome, String cpf, String telefone, Sexo sexo, LocalDate dataNascimento, Convenio convenio, TipoSanguineo tipoSanguineo, Double peso, StatusAtendimento statusAtendimento, String alergias, String obeservacoes) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.convenio = convenio;
        this.tipoSanguineo = tipoSanguineo;
        this.peso = peso;
        this.statusAtendimento = statusAtendimento;
        this.alergias = alergias;
        this.obeservacoes = obeservacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public StatusAtendimento getStatusAtendimento() {
        return statusAtendimento;
    }

    public void setStatusAtendimento(StatusAtendimento statusAtendimento) {
        this.statusAtendimento = statusAtendimento;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getObeservacoes() {
        return obeservacoes;
    }

    public void setObeservacoes(String obeservacoes) {
        this.obeservacoes = obeservacoes;
    }
}
