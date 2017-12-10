package com.athl.DAO;
import java.util.ArrayList;
import java.util.List;

import com.athl.model.*;

public interface CongTyDao {
	public void add(Congty congty);
	public void edit(Congty congty);
	public void delete(String congtyid);
	public Congty getCongTy(String congtyid);
	public ArrayList<Congty> getAllCongTy();

}
