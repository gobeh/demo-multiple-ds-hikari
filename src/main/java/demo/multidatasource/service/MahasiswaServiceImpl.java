package demo.multidatasource.service;

import demo.multidatasource.model.Mahasiswa;
import demo.multidatasource.repository.MahasiswaRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Optional;

/**
 * @author Jay Ehsaniara, Dec 30 2019
 */
@Service
public class MahasiswaServiceImpl implements MahasiswaService {

    private final MahasiswaRepository mahasiswaRepository;

    public MahasiswaServiceImpl(MahasiswaRepository mahasiswaRepository) {
        this.mahasiswaRepository = mahasiswaRepository;
    }

    public Optional<Mahasiswa> getMahasiswa(Long id) {
        return mahasiswaRepository.findById(id);
    }

    public Mahasiswa createMahasiswa(Mahasiswa mahasiswa) {

        Assert.notNull(mahasiswa, "Error mahasiswa");
        Assert.isNull(mahasiswa.getId(), "mahasiswa id harusnya null");
        Assert.notNull(mahasiswa.getNama(), "Error mahasiswa nama");

        return mahasiswaRepository.save(mahasiswa);
    }

    public Mahasiswa updateMahasiswa(Mahasiswa mahasiswa) {

        Assert.notNull(mahasiswa, "Error mahasiswa");
        Assert.notNull(mahasiswa.getId(), "Error mahasiswa id");

        return mahasiswaRepository.save(mahasiswa);
    }
}
