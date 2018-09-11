#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

#parse("File Header.java")
@Repository
public interface ${DOMAIN}Repository extends CrudRepository<$DOMAIN, Integer>, JpaSpecificationExecutor<$DOMAIN> {

}
    