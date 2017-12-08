package com.athl.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.athl.model.Congty;
import com.athl.service.CongTyService;

@Controller
public class CongTyController {
	@Autowired
	private CongTyService congTyService;

	@RequestMapping("/index")
	public String setUpForm(Map<String, Object> map) {
		Congty congty = new Congty();
		map.put("congty", congty);
		map.put("congtylist", congTyService.getAllCongTy());
		return "congty";
	}

	@RequestMapping(value = "congty.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute Congty congty, BindingResult result, @RequestParam String action,
			Map<String, Object> map) {
		Congty congtyResult = new Congty();
		switch (action.toLowerCase()) {
		case "add":
			congTyService.add(congty);
			congtyResult = congty;
			break;
		case "edit":
			congTyService.edit(congty);
			congtyResult = congty;
			break;
		case "delete":
			congTyService.delete(congty.getCongtyId());
			congtyResult = new Congty();
			break;
		case "search":
			Congty searchCongty = congTyService.getCongTy(congty.getCongtyId());
			congtyResult = searchCongty != null ? searchCongty : new Congty();
			break;

		default:
			break;
		}
		map.put("congty", congtyResult);
		map.put("congtylist", congTyService.getAllCongTy());
		return "congty";
	}

}
