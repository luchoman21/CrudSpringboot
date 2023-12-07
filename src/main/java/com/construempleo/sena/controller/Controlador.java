package com.construempleo.sena.controller;

import com.construempleo.sena.entity.eps;
import com.construempleo.sena.service.EpsServiceImp.EpsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("CRUDEps")

public class Controlador {

    @Autowired
    private EpsServiceImp impl;

    @GetMapping
    @RequestMapping(value = "ConsultarEps",method = RequestMethod.GET)
    public ResponseEntity<?>ConsultarEps(){
        List<eps> listaEps=this.impl.ConsultarEps();
        return ResponseEntity.ok(listaEps);
    }

    @PostMapping
    @RequestMapping(value = "CrearEps",method = RequestMethod.POST)
    public ResponseEntity<?>CrearEps(@RequestBody eps eps){
        eps EpsCreada=this.impl.CrearEps(eps);
        return ResponseEntity.status(HttpStatus.CREATED).body(EpsCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarEps",method = RequestMethod.PUT)
    public ResponseEntity<?>ModificarEps(@RequestBody eps eps){
        eps EpsModificada=this.impl.ModificarEps(eps);
        return ResponseEntity.status(HttpStatus.CREATED).body(EpsModificada);
    }
    @GetMapping
    @RequestMapping(value = "BuscarEps/{id_eps}",method = RequestMethod.GET)
    public ResponseEntity<?>BuscarEps(@PathVariable int id_eps){
        eps eps=this.impl.BuscarEps(id_eps);
        return ResponseEntity.status(HttpStatus.CREATED).body(eps);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarEps/{id_eps}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarEps(@PathVariable int id_eps){
        this.impl.EliminarEps(id_eps);
        return ResponseEntity.ok().build();
    }




}
