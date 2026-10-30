package com.senai.medix.controller;

import com.senai.medix.entity.Paciente;
import com.senai.medix.service.PacienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public List<Paciente> mostrar(){
        return pacienteService.mostrarPaciente();
    }

    @PostMapping
    public void cadastrar (@RequestBody Paciente p){
        pacienteService.cadastrarPaciente(p);
    }
}
