package com.service;

import java.util.List;

import com.beans.Cricket;

public interface CricketService {
	public String AddCricket(Cricket crk);
	public List<Cricket>  ShowAll();
}
