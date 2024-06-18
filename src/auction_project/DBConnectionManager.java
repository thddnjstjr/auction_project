package auction_project;

import com.zaxxer.hikari.HikariDataSource;

public class DBConnectionManager {

	private static DBConnectionManager instance;
	private HikariDataSource dataSource;
}
