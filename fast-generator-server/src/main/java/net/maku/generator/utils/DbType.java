package net.maku.generator.utils;

/**
 * 数据库类型
 *
 * @author 阿沐 babamu@126.com
 */
public enum DbType {
	SQLServer("com.microsoft.sqlserver.jdbc.SQLServerDriver"),
	MySQL("com.mysql.cj.jdbc.Driver"),
	Oracle("oracle.jdbc.driver.OracleDriver"),
	PostgreSQL("org.postgresql.Driver");

	private final String driverClass;

	DbType(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getDriverClass() {
		return driverClass;
	}
}