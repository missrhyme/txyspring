package com.tongmeng.txyspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tongmeng.txyspring.ajaxmodel.ActInfoAjax;
import com.tongmeng.txyspring.dao.CommonActInfoDao;
import com.tongmeng.txyspring.dao.UserActCltDao;
import com.tongmeng.txyspring.model.CommonActInfo;

@Service
public class UserService {
	
	
	@Autowired
	private CommonActInfoDao commonActInfoDao;
	
	@Autowired
	private UserActCltDao userActCltDao;
	
	@Transactional(readOnly = true)
	public boolean isFavoured(int id) {
		int userid = 1;
		return userActCltDao.isFavoured(id, userid);
	}
	
	@Transactional
	public void changeFavour(int id,String action)
	{
		int userid = 1;
		
		if(action.equals("add"))
		{	
			if(!userActCltDao.addFavour(id, userid))
			{
				return;
			}
			commonActInfoDao.addFavour(id);			
		}
		else if(action.equals("remove"))
		{
			if(!userActCltDao.removeFavoured(id,userid))
			{
				return;
			}

			commonActInfoDao.minusFavour(id);	
		}
		
		return;
	}
	
	@Transactional(readOnly = true)
	public List<ActInfoAjax> getFavorList(int type) {
		
		int userid = 1;
		
		List<CommonActInfo> lstAct = null;
				
		if(type==1)
		{
			lstAct = userActCltDao.getFavorListByUser(userid,10000);
		}
		else if(type==2)
		{
			lstAct = userActCltDao.getFavorListByUser(userid,20000);	
		}
		else
		{
			lstAct = userActCltDao.getFavorListByUser(userid,10000);
		}	
		
		List<ActInfoAjax> ajaxLstAct = new ArrayList<ActInfoAjax>();
		//for the logic , always true here
		for (CommonActInfo commonActInfo : lstAct) {
			ajaxLstAct.add(new ActInfoAjax(commonActInfo, true));
		}				
		
		return ajaxLstAct;
		
	}
	

}
