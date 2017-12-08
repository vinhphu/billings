package com.athl.DAO;

import java.util.List;

import com.athl.model.*;

public interface LogCallDao {
	public void add(LogCallDao logcall);
	public void edit(LogCallDao logcall);
	public void delete(String logcallid);
	public LogCall getLogCall(String logcallid);
	public List getAllLogCall();

}
