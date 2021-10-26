package ceshi;
import java.sql.*;
public class b {
    public static void main(String[] args) throws Exception {
//        1.导入jar包
//        2.注册驱动
// Class.forName("com.mysql.cj.jdbc.Driver") ;
//        3.获取连接
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tushuguan","root","15149622693");
//       4.获取执行者对象
        Statement stat =con.createStatement();
//        5.执行sql语句，并且接受结果
        String sql ="SELECT*FROM tbl_book";
        ResultSet rs =stat.executeQuery(sql);
//      6.处理结果
        while(rs.next()){
            System.out.println(rs.getString( "book_id")+"\t"+rs.getString("title"));
        }
//      7.释放资源
        con.close();
        stat.close();
        con.close();
    }
}
