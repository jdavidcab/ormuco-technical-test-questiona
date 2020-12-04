package com.ormuco.technicaltest.questiona;

import static org.assertj.core.api.Assertions.assertThat;

import com.ormuco.technicaltest.questiona.controllers.CollinearController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuestionaApplicationTests {

	@Autowired
	CollinearController controller;

	@Test
	void contextLoads() {
		assertThat( controller ).isNotNull();
	}

}
