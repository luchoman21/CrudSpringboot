package com.construempleo.sena.service.EpsServiceImp;

import com.construempleo.sena.entity.eps;
import com.construempleo.sena.repository.EpsRepo;
import com.construempleo.sena.service.EpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpsServiceImp implements EpsService {

    @Autowired
    private EpsRepo repo;

    @Override
    public List<eps> ConsultarEps() {
        return (List<eps>)this.repo.findAll();
    }

    @Override
    public eps CrearEps(eps eps) {
        eps.setId_eps(eps.getId_eps());
        return this.repo.save(eps);
    }

    @Override
    public eps ModificarEps(eps eps) {
        return this.repo.save(eps);
    }

    @Override
    public eps BuscarEps(int id_eps) {
        return this.repo.findById(id_eps).get();
    }

    @Override
    public void EliminarEps(int id_eps) {
         this.repo.deleteById(id_eps);
    }
}
