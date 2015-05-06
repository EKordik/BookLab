/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booklab;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author emmakordik
 */
public interface DBAccessor {

    public abstract void closeConnection() throws SQLException;

    public abstract List<Map<String, Object>> getAllRecords(String tablename) throws SQLException, Exception;

    public abstract List<Map<String, Object>> getRecordsForOneCriteria(String tablename, String columnName, String searchTerm) throws Exception;

    public abstract void openConnection(String driveName, String url, String username, String password) throws IllegalArgumentException, ClassNotFoundException, SQLException;
    
}
