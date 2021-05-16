package com.rriverdev.service;

import org.springframework.stereotype.Service;

import com.rriverdev.dto.ISRModel;

@Service
public class ProcessISRService {
	

	//select @Imp_ISR = round(10000 * 1.45 * 84 / (365 * 100), 2)
	public double processIsr(ISRModel isrModel) {
		int multDíasCien = Math.multiplyExact(isrModel.getDias365(), isrModel.getCien());
		double multCantidadIvaPeriodoDouble = Double.parseDouble(String.valueOf(isrModel.getCantidadPrincipal())) * isrModel.getIva() * isrModel.getPeriodo();
		double divide = multCantidadIvaPeriodoDouble / multDíasCien;
		System.out.println(divide);
//		return Math.round(divide);
		return divide;
	}
}
