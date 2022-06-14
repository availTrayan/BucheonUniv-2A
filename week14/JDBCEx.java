package week14;

import java.sql.*;

public class JDBCEx {
	
	String url = "jdbc:sqlserver://localhost:1433; DataBaseName=2-2";
	String id = "sa";
	String pass = "1234";
	Connection con =null;
	Statement stmt = null;
	
	void init(){
		//try catch�� ����ó��
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con = DriverManager.getConnection(url,id,pass);
				stmt = con.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void insertInto() throws Exception{
		String sql;
		for(int i=0; i<10; i++){
			sql = "Insert Into MyTest(name,age) values('";
			sql += "he" + i +"','"+i+"')";
					stmt.executeUpdate(sql);
		}
	}
	void selectEx() throws Exception{
		String sql = "select name, age from MyTest";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			System.out.println("name: "+ rs.getString(1)+" age : "+ rs.getInt(2));
		}
	}
	
	void executeEx() throws Exception{
		String sql = "select name, age from MyTest";
		boolean isResult = stmt.execute(sql);
		if(isResult){ //TRUE: ResultSet ��ü�� ��ȯ
			ResultSet rs = stmt.getResultSet();
			while(rs.next()){
				System.out.println("name : "+rs.getString(1)+ " age : " + rs.getInt(2));
			}
		}else{
			int rowCount = stmt.getUpdateCount();
			System.out.println("rowCount : "+rowCount);
		}
	}
	
	void preparedEx() throws Exception{
		String sql = "select age from MyTest where name=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, "he0");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			System.out.println("name: "+rs.getString(1)+" age : "+rs.getInt("age"));
			}
		}
	
	void callableEx() throws Exception {
		String sql = "select name form MyTest";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		CallableStatement cs = 
				con.prepareCall("{call myAdjustX(?,?)}");
		
		while(rs.next()){
			cs.setString(1,  rs.getString("name")); //�Ű����� ����
			cs.registerOutParameter(2, java.sql.Types.INTEGER);// ���
			cs.execute();
			System.out.println("name : " + rs.getString("name")+" age : " + cs.getInt(2));
		}
	}
		
		void transEx() throws Exception{
			boolean success=false;
			try{
				con.setAutoCommit(false);//���� sql������ Ʈ��������� ���� commit �޼��峪 rollback �޼��� ����������
				String sql = "create table test_X (id varchar(10),"+ "password varchar(10))";
				stmt.executeUpdate(sql);
				sql = "insert into test_X values('syh1011', '1111')";
				stmt.executeUpdate(sql);
				
				sql = "insert into test_X values('syh1011', '2222')";
				stmt.executeUpdate(sql);
				
				sql = "insert into test_X values('syh1011', '3333'";
				stmt.executeUpdate(sql);
				success = true;
			}finally{
				try{
					if(success){ con.commit();}
					else{ con.rollback(); 
					}
				}catch(SQLException sqle){
					sqle.printStackTrace(); }
				}
		}
		
		void batchEx() throws Exception{
			con.setAutoCommit(false);
			stmt.addBatch("INSERT INTO myTestX VALUES('Bat01', 10)");
			stmt.addBatch("INSERT INTO myTestX VALUES('Bat01', 10)");
			stmt.addBatch("INSERT INTO myTestX VALUES('Bat01', 30)");
			stmt.addBatch("INSERT INTO myTestX VALUES('Bat01', 40)");
			
			int [] updateCounts = stmt.executeBatch();
			//������ INSERT���� ����� ��ȯ�ϱ� ������ �ݵ�� �迭
			con.commit();
			boolean commit = true;
			con.setAutoCommit(true);
			if(!commit)con.rollback();
		}
	}
