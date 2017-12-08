package com.athl.DAO;

import java.util.List;

import com.athl.model.*;

public interface ExtensionDao {
	public void add(Extension extension);
	public void edit(Extension extension);
	public void delete(String extensionid);
	public Extension getExtension(String extensionid);
	public List getAllExtension();

}
