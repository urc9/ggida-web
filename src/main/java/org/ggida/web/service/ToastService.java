package org.ggida.web.service;

import java.util.List;

import org.ggida.web.dao.ToastDao;
import org.ggida.web.model.Toast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToastService {
	@Autowired
	private ToastDao toastDao;
	
	public List<Toast> getList() {
		return toastDao.selectList();
	}
	public Toast get(int id) {
		return toastDao.select(id);
	}
	
	public void update(Toast toast) {
		if (toast.getId() > 0) {
			toastDao.update(toast);
		} else {
			toastDao.insert(toast);
		}
	}
	public void delete(int id) {
		toastDao.delete(id);
	}
}
