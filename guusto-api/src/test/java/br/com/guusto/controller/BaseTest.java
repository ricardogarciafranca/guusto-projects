package br.com.guusto.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
public class BaseTest {
	
	public static final String BASE_URL = "http://localhost:8080/merchants";

	ObjectMapper mapper = new ObjectMapper();
	
}
