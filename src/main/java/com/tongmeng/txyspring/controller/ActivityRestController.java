package com.tongmeng.txyspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.tongmeng.txyspring.ajaxmodel.ActInfoAjax;
import com.tongmeng.txyspring.ajaxmodel.AjaxJsonViews;
import com.tongmeng.txyspring.ajaxmodel.AjaxResponseBody;
import com.tongmeng.txyspring.ajaxmodel.AjaxResponseBody.RESPONSE_STATUS;
import com.tongmeng.txyspring.model.CommonActInfo;
import com.tongmeng.txyspring.service.ActivityService;

@RestController
@RequestMapping(value = "/api/activity")
public class ActivityRestController {

	@Autowired
	private ActivityService as;
	
	@JsonView(AjaxJsonViews.Public.class)
	@RequestMapping(value = "/GetActivities", method = RequestMethod.GET)
	public AjaxResponseBody<List<ActInfoAjax> > GetActivities(
			@RequestParam("type") int type,
			@RequestParam("subtype") int subtype,
			@RequestParam("sort") int sort,
			@RequestParam("p") int p
			) {
		
		
		List<CommonActInfo> lstAct = as.listActivitiesByActCodeAndSchCode(type,subtype,sort,p);
		List<ActInfoAjax> ajaxLstAct = new ArrayList<ActInfoAjax> (); 
		
		for(CommonActInfo commonActInfo: lstAct){
			ajaxLstAct.add(new ActInfoAjax(commonActInfo));
		}
		
		return new AjaxResponseBody<List<ActInfoAjax> >(RESPONSE_STATUS.SUCCESS, ajaxLstAct);

	}
	
	@JsonView(AjaxJsonViews.Public.class)
	@RequestMapping(value = "/GetDetail", method = RequestMethod.GET)
	public AjaxResponseBody<CommonActInfo > GetDetail(
			@RequestParam("id") int id
			) {
		
		AjaxResponseBody<CommonActInfo > AjaxResult = 
				new AjaxResponseBody<CommonActInfo >(RESPONSE_STATUS.SUCCESS, as.getActivitiyDetail(id));
		return AjaxResult;

	}	
	
}
