package com.example.jparesttemplate.service;

import java.util.ArrayList;
import java.util.List;

import com.example.jparesttemplate.entity.ChuyenBay;

public interface ChuyenBayService {
	public ArrayList<ChuyenBay> findAll();
	public ChuyenBay findById(String theId);
	public ArrayList<ChuyenBay> findByGaDen(String gaDen);
	public ChuyenBay save(ChuyenBay chuyenBay);
	public void deleteById(String maCB);
	
	public List<ChuyenBay> findByDuongbay(int dbay1, int dbay2);
	public List<ChuyenBay> findBySG_BMT(String gadi, String daden);
	public int countChuyenBay(String gadi);
}
