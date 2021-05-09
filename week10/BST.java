package tests.ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


//DB와 연동하기 위해 기능을 구현한 객체
public class LoginDAO {

	//DB 연동 커넥션 얻기
	private Connection getConnection(){

		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String user = "HAYOUNG";
		String passwd = "1111";

		//1. DB 연동 드라이버 로드
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
	}

	public void insertLogin(LoginDTO dto) throws SQLException, ClassNotFoundException {

		Connection con = getConnection();
		PreparedStatement pstmt=null;

		String sql = "INSERT INTO LOGIN VALUES(?,?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, dto.getId());
		pstmt.setString(2, dto.getName());
		pstmt.setString(3, dto.getPwd());

		//4. SQL 실행
		pstmt.executeUpdate();

		//5. 객체 해제
		pstmt.close();
		con.close();
	}

	//DB에서 가져온 데이터를 화면에 표시할 수 있도록 만들어주기
	public ArrayList<LoginDTO> listLogin() throws SQLException {
		ArrayList<LoginDTO> dtos = new ArrayList<LoginDTO>();

		//DB연결을 위한 connection 생성
		Connection con = getConnection();

		//3. 생성된 연결을 통해 SQL문 실행 의뢰 준비
		String sql = "SELECT * FROM LOGIN";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		//ResultSet 객체에 담겨진 레코드를 각 LoginDTO에 넣고 전체를 ArrayLost에 저장한다.
		while(rs.next()){
			LoginDTO dto = new LoginDTO(rs.getString("id"),rs.getString("name"),rs.getString("pwd"));
			dtos.add(dto);
		}

		rs.close();
		con.close();
		st.close();
		
		return dtos;

	}

	public void updateLogin(LoginDTO dto) throws SQLException, ClassNotFoundException {

		Connection con = getConnection();
		PreparedStatement pstmt=null;


		String sql = "INSERT INTO LOGIN VALUES(?,?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, dto.getId());
		pstmt.setString(2, dto.getName());
		pstmt.setString(3, dto.getPwd());

		//4. SQL 실행
		pstmt.executeUpdate();

		//5. 객체 해제
		pstmt.close();
		con.close();

	}

	public void deleteLogin(LoginDTO dto) throws SQLException, ClassNotFoundException {


		Connection con = getConnection();
		PreparedStatement pstmt=null;

		String sql = "DELETE FROM LOGIN WHERE ID=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, dto.getId());
		pstmt.setString(2, dto.getName());
		pstmt.setString(3, dto.getPwd());

		//4. SQL 실행
		pstmt.executeUpdate();

		//5. 객체 해제
		pstmt.close();
		con.close();
	}
}
