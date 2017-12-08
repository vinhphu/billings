package com.athl.DAO;

import java.util.List;

import com.athl.model.*;

public interface BlocksDao {
	public void add(Blocks blocks);
	public void edit(Blocks blocks);
	public void delete(String blocksid);
	public Blocks getBlocks(String blocksid);
	public List getAllBlocks();
}
