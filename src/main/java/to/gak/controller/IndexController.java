package to.gak.controller;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@Autowired
	private DataSource dataSource;

	@RequestMapping("/")
	public String home() throws SQLException {
		dataSource.getConnection();
		return "index";
	}
}
