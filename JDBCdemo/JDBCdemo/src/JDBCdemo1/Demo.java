package JDBCdemo1;

import java.sql.SQLException;

public class Demo {
    public static void main(String []args) throws SQLException {
        JDBCdemo1.login("sa","18382872818","Demo");
        //jdbCdemo1.delete("sa","18382872818","Demo","message","id","1");
        //jdbCdemo1.select("name","message","id","2");
       JDBCdemo1.update("name","wau","message","id","2");
    }
}
