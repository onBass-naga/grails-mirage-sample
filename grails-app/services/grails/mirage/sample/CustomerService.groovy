package grails.mirage.sample

import com.area_b.SqlManagerFactory
import com.area_b.samples.Customer
import jp.sf.amateras.mirage.SqlManager
import jp.sf.amateras.mirage.dialect.MySQLDialect

class CustomerService {

    SqlManager sqlManager

    def sessionFactory

    MySQLDialect dialect

    def list() {
        return sqlManager.getResultList(
                Customer.class, "com/area_b/samples/select.sql");
    }

    def update() {

        SqlManager manager = SqlManagerFactory.createInstance(sessionFactory, dialect)

        int count = manager.getCount("com/area_b/samples/select.sql")

        manager.executeUpdate("com/area_b/samples/insert.sql")

        int count2 = manager.getCount("com/area_b/samples/select.sql")

        int count3 = Customer.count

        print(count + ":" + count2 + ":" + count3)
    }
}
