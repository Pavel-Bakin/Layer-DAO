package ru.netology.layerdao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.layerdao.model.ProductScript;

import java.io.IOException;

@Repository
public interface ProductRepository extends JpaRepository<ProductScript, Long> {
    String read(String scriptFileName) throws IOException;
}
