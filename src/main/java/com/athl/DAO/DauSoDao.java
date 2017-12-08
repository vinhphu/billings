package com.athl.DAO;

import java.util.List;

import com.athl.model.*;

public interface DauSoDao {
	public void add(Dauso dauso);
	public void edit(Dauso dauso);
	public void delete(String dausoid);
	public Dauso getDauSo(String dausoid);
	public List getAllDauSo();

}
