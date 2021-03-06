package service;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBService {
	//_single 자동완성
	
	// single-ton pattern: 
	// DB 객체 1개만 생성해서 지속적으로 서비스한다.
	static DBService single = null;

	public static DBService getInstance() {
		//생성되지 않았으면 생성
		if (single == null)
			single = new DBService();
		//생성된 객체정보를 반환
		return single;
	}
	
	DataSource ds;	
	
	//DB 연결하기
	public DBService() {
		try {
			InitialContext ic = new InitialContext();
			ds = (DataSource)ic.lookup("java:comp/env/jdbc/oracle_test");	//Context와 DataSource 생성.
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//DB 접속하기
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = ds.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("db접속 성공");
		return conn;
	}
}
