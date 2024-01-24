package ru.netology.layerdao.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Repository
public abstract class ProductScriptRepositoryImpl implements ProductScriptRepository {

    private final ResourceLoader resourceLoader;

    @Autowired
    public ProductScriptRepositoryImpl(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public String read(String scriptFileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(ResourceUtils.getURL("classpath:" + scriptFileName).getPath())));
    }
}
