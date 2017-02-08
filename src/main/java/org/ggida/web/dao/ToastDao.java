package org.ggida.web.dao;

import java.util.List;

import org.ggida.web.model.Toast;

public interface ToastDao {
	List<Toast> selectList();
	Toast select(int id);
	
	void insert(Toast toast);
	void update(Toast toast);
	void delete(int id);
}
