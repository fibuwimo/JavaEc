package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.Person;

public class LunchDAO{
	private Connection db;
	private PreparedStatement ps;
	private ResultSet rs;

	private void connect() throws NamingException, SQLException  {
		Context context=new InitialContext();
		DataSource ds =(DataSource) context.lookup("java:comp/env/jdbc/jsp");
		this.db=ds.getConnection();
	}
	private void disconnect(){
		try {
			if(rs !=null) {
				rs.close();
			}
			if(ps !=null) {
				ps.close();
			}
			if(db !=null) {
				db.close();
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	public List<Person> findAll(){
		List<Person> list =new ArrayList<>();
		try {
			this.connect();
			ps = db.prepareStatement("SELECT * FROM lunches");
			rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name =rs.getString("name");
				String menu =rs.getString("menu");
				Person lunch =new Person(id,name,menu);
				list.add(lunch);
			}
		} catch (NamingException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			this.disconnect();
		}

		return list;
	}
	public void insertOne(Person lunch) {
		try {
			this.connect();
			ps=db.prepareStatement("INSERT INTO lunches(name,menu) values(?,?)");
			ps.setString(1,lunch.getName());
			ps.setString(2,lunch.getMenu());
			ps.executeUpdate();
			System.out.println(ps);
		} catch (NamingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			this.disconnect();
		}

	}
	public Person findOne(int id) {
		Person lunch=null;
		try {
			this.connect();
			ps=db.prepareStatement("SELECT * FROM lunches where id=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {
				String name=rs.getString("name");
				String menu=rs.getString("menu");
				lunch=new Person(id,name,menu);
			}
		} catch (NamingException | SQLException e) {
			System.out.println("test:catch");
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			this.disconnect();
		}
		return lunch;
	}
	public void updateOne(Person lunch) {
		try {
			this.connect();
			ps=db.prepareStatement("UPDATE lunches SET name=?,menu=? WHERE id=?");
			ps.setString(1, lunch.getName());
			ps.setString(2, lunch.getMenu());
			ps.setInt(3, lunch.getId());
			ps.executeUpdate();
		} catch (NamingException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			this.disconnect();
		}
	}
	public void deleteOne(int id) {
		try {
			this.connect();
			ps=db.prepareStatement("DELETE FROM lunches WHERE id=?");
			ps.setInt(1,id);
			ps.executeUpdate();
		} catch (NamingException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			this.disconnect();
		}
	}

}