package com.cg.main;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.seedcontroller.SeedController;
import com.cg.main.seedmodel.Seed;
import com.cg.main.seedrepository.SeedRepository;
import com.cg.main.seedservice.ISeedService;
import com.cg.main.seedservice.SeedService;

/**
 * 
 * @author manasa
 *SeedModuleSprint2ApplicationTests class which has test method for controller
 */
@SpringBootTest
class SeedModuleSprint2ApplicationTests {
	
	@Autowired
	private SeedController controller;
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	
	
}
