package cl.argus.services;


import cl.argus.models.Cargament;
import cl.argus.models.Naviera;
import cl.argus.repositories.CargamentRepository;
import cl.argus.repositories.NavieraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/cargaments")
public class CargamentService {

    @Autowired
    CargamentRepository cargamentRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Cargament> getAllCargaments() {
        return cargamentRepository.findAll();
    }
}