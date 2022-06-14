//���Ͽ� ����� �����͸� �����ͺ��̽��� �����ϴ� ���α׷� �ۼ�
//���Ͽ� ����� ������ �й�, ����, �ּ�
//�й��� �̿��Ͽ� �˻�

package report03;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Properties;

public class Report03Main {

	public static void main(String[] args)throws Exception, SQLException{
		
		String url = "jdbc:sqlserver://localhost:1433; DataBaseName=2-2";
		String id = "sa";
		String pass = "1234";
		Statement stmt = null;
		
		FileHandler fh = new FileHandler();
		fh.FileWriterEx();
		
        Properties pro = new Properties();
        FileInputStream fis = new FileInputStream("E://�⼮��.txt");
        pro.load(fis);
        
        String StudentNumber = pro.getProperty("StudentNumber");
        String name = pro.getProperty("name");
        String address = pro.getProperty("address");
        Class.forName(StudentNumber);
        Connection con = DriverManager.getConnection(StudentNumber, name, address);

        String sql = "select StudentNumber, name, address from AttendanceRecord";
        
        PreparedStatement pstmt = con.prepareStatement(sql);
        boolean isResult = pstmt.execute();
        if(isResult){
            ResultSet rs = pstmt.getResultSet();
            while(rs.next()){
                  System.out.println("StudentNumber : "+rs.getString(1)+  
                          " name : " + rs.getString(2)+ " address : " + rs.getString(3));
            }
        }else {
             int rowCount = pstmt.getUpdateCount();
             System.out.println("rowCount : "+rowCount);
        }
        pstmt.close();
        con.close();
    }
}
