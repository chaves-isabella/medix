package com.senai.medix.service;

import com.senai.medix.entity.Paciente;
import com.senai.medix.enuns.StatusAtendimento;
import com.senai.medix.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @GetMapping
    public List<Paciente> mostrarPaciente (){
        List<Paciente> pacienteList = new ArrayList<>();
        return pacienteList = pacienteRepository.findAll();
    }

    @PostMapping
    public void cadastrarPaciente (Paciente p){
        Paciente paciente = new Paciente();
        paciente.setNome(p.getNome());
        paciente.setCpf(p.getCpf());
        paciente.setTelefone(p.getTelefone());
        paciente.setSexo(p.getSexo());
        paciente.setDataNascimento(p.getDataNascimento());
        paciente.setConvenio(p.getConvenio());
        paciente.setTipoSanguineo(p.getTipoSanguineo());
        paciente.setPeso(p.getPeso());
        paciente.setStatusAtendimento(StatusAtendimento.AGUARDANDO);
        paciente.setAlergias(p.getAlergias());
        paciente.setObeservacoes(p.getObeservacoes());
        pacienteRepository.save(p);
    }
}
