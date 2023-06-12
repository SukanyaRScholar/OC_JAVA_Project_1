package com.safetynet.alerts.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {DataRepo.class})
public class DataRepoTest {
    @Autowired
    private DataRepo sut; // system under test (we are testing this class)

    // TODO add the junit test for DataRepo
    @Test
    public void testBean(){
        assertThat(sut).isNotNull();


    }
}
