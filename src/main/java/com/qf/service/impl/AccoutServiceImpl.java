package com.qf.service.impl;

import com.qf.dao.IAccoutDao;
import com.qf.service.AccoutService;

public class AccoutServiceImpl implements AccoutService {

	private IAccoutDao ad;

	public IAccoutDao getAd() {
		return ad;
	}

	public void setAd(IAccoutDao ad) {
		this.ad = ad;
	}

	@Override
	public void transfer(Integer from, Integer to, Double money) {
		// -Ǯ
		ad.deMoney(from, money);
		// +Ǯ
		ad.addMoney(to, money);
	}


}
