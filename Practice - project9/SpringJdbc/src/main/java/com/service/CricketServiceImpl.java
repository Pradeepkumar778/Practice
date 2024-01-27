package com.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.Cricket;

public class CricketServiceImpl implements CricketService {
	
	private DataSource ds;
	private JdbcTemplate jt;
	
	public DataSource getDs() {
		return ds;
	}
	
	public void setDs(DataSource ds) {
		this.ds = ds;
		System.out.println("DS Setter");
		jt = new JdbcTemplate(this.getDs());
	}

	@Override
	public String AddCricket(Cricket crk) {
		String res="Err";
		String qry = "Insert into cricket(crname, gametype, runs) values(?,?,?)";
		int n = jt.update(qry, new Object[] {crk.getCrname(), crk.getGametype(), crk.getRuns()});
		if(n>=1)
			res ="Success";
		return res;
		
	}

	@Override
	public List<Cricket> ShowAll() {
		
		String qry = "Select * from cricket";
		List<Cricket> lstcrk = jt.query(qry, new BeanPropertyRowMapper(Cricket.class));
		return lstcrk;
	
	}

	
}
