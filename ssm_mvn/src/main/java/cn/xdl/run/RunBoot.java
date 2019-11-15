package cn.xdl.run;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class RunBoot {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = SpringApplication.run(RunBoot.class, args);
		
		DataSource  ds = ctx.getBean(DataSource.class);
		System.out.println(ds.getConnection());
		
		JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);
		System.out.println(jt);
		
		String sql = "insert into spring_maven values(?,?,?)";
		Object[] param = {"xiaomage","123456",1};
		int i = jt.update(sql, param);
		System.out.println(i);
        System.out.println("i+1");

		
		

	}

}
