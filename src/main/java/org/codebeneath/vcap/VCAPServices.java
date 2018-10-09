package org.codebeneath.vcap;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Reads the specified subset of ENV variable "VCAP_SERVICES".
 * Note that in java, the properties are lower-case, underscores goto dots and compound keys goto "-" seperated
 * 
 * So, given from an OS shell:
 * export VCAP_SERVICES='{"p-mysql": [{"credentials": {"username":"admin", "jdbcUrl": "jdbc:mysql://127.0.0.1:3306/albums?user=root"}, "name": "albums-mysql"}, {"credentials": {"jdbcUrl": "jdbc:mysql://127.0.0.1:3306/movies?user=root"}, "name": "movies-mysql"}]}'
 * 
 * Or individually:
 * export VCAP_SERVICES_ALBUMS_MYSQL_CREDENTIALS_USERNAME='admin'
 * export VCAP_SERVICES_ALBUMS_MYSQL_CREDENTIALS_JDBCURL='jdbc:mysql://127.0.0.1:3306/albums?user=root!'

 */
@Data
@Configuration
@ConfigurationProperties("vcap.services.albums-mysql.credentials") // Works for export VCAP_SERVICES=...
// @ConfigurationProperties("vcap.services.albums.mysql.credentials") // Works for export VCAP_SERVICES_ALBUMS_MYSQL_CREDENTIALS_USERNAME=...
public class VCAPServices {

  private String username;
  private String jdbcUrl;

}
