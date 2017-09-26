package br.edu.univas.si8.ta.calculadora.impl;

import br.edu.univas.si8.ta.calculadora.api.calculadoraService;
import br.edu.univas.si8.ta.calculadora.api.Result;

public class CalculadoraServiceImpl implements calculadoraService {


	@Override
	public Result sum(int first, int second) {
		int result = first + second;
		return new Result().withFirst(first).withSecond(second).withResult(result);
	}

	@Override
	public Result subtract(int first, int second) {
		int result = first - second;
		return new Result().withFirst(first).withSecond(second).withResult(result);
	}

}