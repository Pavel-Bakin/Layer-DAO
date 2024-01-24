package ru.netology.layerdao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.layerdao.model.ProductScript;

import java.io.IOException;
import java.util.List;

@Repository
public interface ProductScriptRepository extends JpaRepository<ProductScript, Long> {
    List<ProductScript> findAll();

    ProductScript findByName(String name);

    String read(String scriptFileName) throws IOException;
}