package com.construempleo.sena.service;

import com.construempleo.sena.entity.eps;

import java.util.List;

public interface EpsService {

    public List<eps> ConsultarEps();
    public eps CrearEps(eps eps);
    public eps ModificarEps(eps eps);
    public eps BuscarEps(int id_eps);
    public void EliminarEps(int id_eps);


}
