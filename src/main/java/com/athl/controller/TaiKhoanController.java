package com.athl.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.athl.model.TaikhoanNguoidung;
import com.athl.service.TaiKhoanService;

@Controller
public class TaiKhoanController {

	@Autowired(required = true)
	private TaiKhoanService taiKhoanService;

	@RequestMapping("/index")
	public String setUpForm(Map<String, Object> map) {
		TaikhoanNguoidung taikhoan = new TaikhoanNguoidung();
		map.put("taikhoan", taikhoan);
		map.put("taikhoanlist", taiKhoanService.getAllTaikhoan());
		return "taikhoan";
	}

	@RequestMapping(value = "taikhoan.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute TaikhoanNguoidung taikhoan, BindingResult result,
			@RequestParam String action, Map<String, Object> map) {
		TaikhoanNguoidung taikhoanResult = new TaikhoanNguoidung();
		switch (action.toLowerCase()) {
		case "add":
			taiKhoanService.add(taikhoan);
			taikhoanResult = taikhoan;
			break;
		case "edit":
			taiKhoanService.edit(taikhoan);
			taikhoanResult = taikhoan;
			break;
		case "delete":
			taiKhoanService.delete(taikhoan.getUsername());
			taikhoanResult = new TaikhoanNguoidung();
			break;
		case "search":
			TaikhoanNguoidung searchTaikhoan = taiKhoanService.getTaikhoan(taikhoan.getUsername());
			taikhoanResult = searchTaikhoan != null ? searchTaikhoan : new TaikhoanNguoidung();
			break;

		default:
			break;
		}

		map.put("taikhoan", taikhoanResult);
		map.put("taikhoanlist", taiKhoanService.getAllTaikhoan());
		return "congty";
	}
}
