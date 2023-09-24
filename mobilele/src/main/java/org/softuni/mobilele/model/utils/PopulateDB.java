package org.softuni.mobilele.model.utils;
import org.softuni.mobilele.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@Component
public class PopulateDB implements CommandLineRunner {

    private final JdbcTemplate jdbcTemplate;
    private final UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        this.init();
    }
    @Autowired
    public PopulateDB(JdbcTemplate jdbcTemplate, PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.jdbcTemplate = jdbcTemplate;
        this.userRepository = userRepository;
    }

    public void init() {
        if (userRepository.count() == 0) {
            Resource resource = new ClassPathResource("data.sql");
            EncodedResource encodedResource = new EncodedResource(resource, StandardCharsets.UTF_8);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(encodedResource.getInputStream()))){
                StringBuilder sqlStatements = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    sqlStatements.append(line);

                    if (line.endsWith(";")) {
                        jdbcTemplate.execute(sqlStatements.toString());
                        sqlStatements.setLength(0);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
