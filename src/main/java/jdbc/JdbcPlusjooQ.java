package jdbc;

import model.Person;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author daro on 18/03/17.
 */
public class JdbcPlusjooQ {

    public static void main(String[] args)  throws SQLException  {
        try (Connection c = getConnection()) {
            String sql = "select id, nombre, apellido " +
                    "from personas " +
                    "order by id";

            DSL.using(c)
                    .fetch(sql)
                    .map(rs -> new Person(
                            rs.getValue("id", String.class),
                            rs.getValue("nombre", String.class),
                            rs.getValue("apellido", String.class), null, null, null)
                    )
                    .forEach(System.out::println);
        }


    }

    private static Connection getConnection() throws SQLException {
        return null;
    }

}
