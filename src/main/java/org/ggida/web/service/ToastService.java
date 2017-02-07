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
	
	public List<Toast> getToastList() {
		return toastDao.selectList();
	}
}
