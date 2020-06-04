package demo.multidatasource.controller;

import demo.multidatasource.handler.ResourceNotFoundException;
import demo.multidatasource.model.Mahasiswa;
import demo.multidatasource.service.MahasiswaService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MahasiswaControllerImpl {

    private final MahasiswaService mahasiswaService;

    public MahasiswaControllerImpl(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }

    @RequestMapping(path = "/mahasiswa/{id}", method = RequestMethod.GET)
    public Mahasiswa getMahasiswa(@PathVariable("id") Long id) {

        return mahasiswaService.getMahasiswa(id).orElseThrow(() -> new ResourceNotFoundException("Invalid Mahasiswa"));
    }

    @RequestMapping(path = "/mahasiswa", method = RequestMethod.POST)
    public Mahasiswa createMahasiswa(@RequestBody Mahasiswa mahasiswa) {
        return mahasiswaService.createMahasiswa(mahasiswa);
    }

    @RequestMapping(path = "/mahasiswa", method = RequestMethod.PUT)
    public Mahasiswa updateMahasiswa(@RequestBody Mahasiswa mahasiswa) {
        return mahasiswaService.updateMahasiswa(mahasiswa);
    }
}
