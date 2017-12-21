package sf.crom.SearchSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import sf.crom.SearchSpring.basic.BinarySearch;
import sf.crom.SearchSpring.scope.PersonDAO;

@SpringBootApplication
public class ScopeSpringApplication {

	static final Logger LOG = LoggerFactory.getLogger(ScopeSpringApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ScopeSpringApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		LOG.info("{}", personDAO);
		LOG.info("{}", personDAO.getJdbcConnection());
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		LOG.info("{}", personDAO2);
		LOG.info("{}", personDAO2.getJdbcConnection());
	}

}
