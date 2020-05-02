package com.Glass4Child.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Glass4Child.project.entities.Beneficent;
import com.Glass4Child.project.entities.address;
import com.Glass4Child.project.repositories.addressRepository;
import com.Glass4Child.project.repositories.beneficentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    //private UserRepository userRepository;
    private beneficentRepository beneficentRepository;
private addressRepository addressRepository;
    public void run(String... args) throws Exception {
    	
        //User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");



      Beneficent u3 = new Beneficent("mama@gmail.com","pass","155,714",(long)1838232,"155",300,150,true,"gado", new address("14654","1515","rio","vila","maria",12));
       // address au2 = new address("14654","1515","rio","vila","maria",12);
        //	userRepository.saveAll(Arrays.asList( u1));
       // u3.setAddress(au2);
        // au2.setU(u3);
        beneficentRepository.saveAll(Arrays.asList(u3));



      // addressRepository.saveAll(Arrays.asList(u3.address));
    }
}