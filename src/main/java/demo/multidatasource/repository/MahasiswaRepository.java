package demo.multidatasource.repository;

import demo.multidatasource.model.Mahasiswa;
import demo.multidatasource.repository.readRepository.MahasiswaReadRepository;
import demo.multidatasource.repository.writeRepository.MahasiswaWriteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MahasiswaRepository implements MahasiswaRepositoryCombo {

    private final MahasiswaReadRepository readRepository;
    private final MahasiswaWriteRepository writeRepository;

    public MahasiswaRepository(MahasiswaReadRepository mahasiswaReadRepository, MahasiswaWriteRepository mahasiswaWriteRepository) {
        this.readRepository = mahasiswaReadRepository;
        this.writeRepository = mahasiswaWriteRepository;
    }

    @Override
    public <S extends Mahasiswa> S save(S s) {
        return writeRepository.save(s);
    }

    @Override
    public <S extends Mahasiswa> Iterable<S> saveAll(Iterable<S> iterable) {
        return writeRepository.saveAll(iterable);
    }

    @Override
    public Optional<Mahasiswa> findById(Long aLong) {
        return readRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return readRepository.existsById(aLong);
    }

    @Override
    public Iterable<Mahasiswa> findAll() {
        return readRepository.findAll();
    }

    @Override
    public Iterable<Mahasiswa> findAllById(Iterable<Long> iterable) {
        return readRepository.findAllById(iterable);
    }

    @Override
    public long count() {
        return readRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        writeRepository.deleteById(aLong);
    }

    @Override
    public void delete(Mahasiswa mahasiswa) {
        writeRepository.delete(mahasiswa);
    }

    @Override
    public void deleteAll(Iterable<? extends Mahasiswa> iterable) {
        writeRepository.deleteAll(iterable);
    }

    @Override
    public void deleteAll() {
        writeRepository.deleteAll();
    }
}
