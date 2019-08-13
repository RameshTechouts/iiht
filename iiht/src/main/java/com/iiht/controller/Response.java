package com.iiht.controller;

import java.util.List;

public class Response {

	private int symbols_requested;
	private int symbols_returned;
	private List<Stock> data;
	
	public int getSymbols_requested() {
		return symbols_requested;
	}
	public void setSymbols_requested(int symbols_requested) {
		this.symbols_requested = symbols_requested;
	}
	public int getSymbols_returned() {
		return symbols_returned;
	}
	public void setSymbols_returned(int symbols_returned) {
		this.symbols_returned = symbols_returned;
	}
	public List<Stock> getData() {
		return data;
	}
	public void setData(List<Stock> data) {
		this.data = data;
	}

}