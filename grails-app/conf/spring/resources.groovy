// Place your Spring DSL code here
beans = {

    dataSource(org.apache.commons.dbcp.BasicDataSource) { bean ->
        bean.destroyMethod = 'close'
        driverClassName = '${dataSource.driverClassName}'
        url = '${dataSource.url}'
        username = '${dataSource.username}'
        password = '${dataSource.password}'
    }

    transactionManager(org.springframework.jdbc.datasource.DataSourceTransactionManager) {
        dataSource = dataSource
    }

    connectionProvider(jp.sf.amateras.mirage.integration.spring.SpringConnectionProvider) {
        transactionManager = transactionManager
    }

    dialect(jp.sf.amateras.mirage.dialect.MySQLDialect)

    sqlManager(jp.sf.amateras.mirage.SqlManagerImpl) {
        connectionProvider = connectionProvider
        dialect = dialect
    }
}
