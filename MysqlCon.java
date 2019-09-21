import com.noesisinformatica.test.*;
import java.sql.*;
class MysqlCon{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:portno/DBname","username","password");

Statement stmt=con.createStatement();
String query="insert into databasename"+"( lastUsedId,term)";
stmt.executeUpdate(query);
//to retrieve the data from database using Resultset
ResultSet rs=stmt.executeQuery("select * from Databasename");
con.close();
}catch(Exception e){ System.out.println(e);}

}
}
