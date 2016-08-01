package com.sg.docker.paydock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sg.docker.paydock.model.TransferModel;
import com.sg.docker.paydock.service.IBeneficiaryService;
import com.sg.docker.paydock.service.IFundTransferService;

@Controller
public class FundTransferController {
	
	@Autowired
	IBeneficiaryService beneficiaryService;
	
	@Autowired
	IFundTransferService fundTransferService;
	
	@RequestMapping(value="/transfer",method=RequestMethod.GET)
	public String getToTransferPAge(Model model){
		model.addAttribute("transfer", new TransferModel());
		model.addAttribute("beneficiaries", beneficiaryService.listAll());
		return "transfer";
	}
	
	@RequestMapping(value="/transfer",method=RequestMethod.POST)
	public String newVendor(@ModelAttribute("transfer") TransferModel transfer, BindingResult result, Model model) {		
		fundTransferService.save(transfer);
		return "tconfirm";
	}

}
