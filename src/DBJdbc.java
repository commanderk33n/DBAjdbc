import java.sql.ResultSet;

/**
 * Created by eikood on 19.12.16.
 */
public class DBJdbc {
    public static void main(String[] args) throws Exception{
        DBConnect dao = new DBConnect();


        String AgeStmt = "UPDATE t_ma_dt SET alt = alt +1;";
        String LocationStmt = "UPDATE t_ma_dt SET ort='Frankfurt/Main' WHERE ort='Offenbach'";


        dao.update(LocationStmt);


        dao.close();
    }
}
