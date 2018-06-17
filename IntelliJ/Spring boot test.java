package pl.softra;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import pl.softra.common.db.emf.CommonEntityManager;

#parse("File Header.java")
@RunWith(SpringRunner.class)
@TestPropertySource({"/application-test.properties", "/application-dev.properties"})
@AutoConfigurationPackage
@EnableJpaRepositories()
@ContextConfiguration(classes = {
    CommonTestConfig.class,
    CommonEntityManager.class,
})
public class ${NAME} {

}