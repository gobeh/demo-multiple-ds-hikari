package demo.multidatasource.service;

import demo.multidatasource.model.Mahasiswa;

import java.util.Optional;

/**
 * @author Jay Ehsaniara, Dec 30 2019
 */
public interface MahasiswaService {

    Optional<Mahasiswa> getMahasiswa(Long id);

    Mahasiswa createMahasiswa(Mahasiswa mahasiswa);

    Mahasiswa updateMahasiswa(Mahasiswa mahasiswa);
}
