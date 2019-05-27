package com.model;

//상품 1개를 담을 수 있는  DTO 클래스

public class OrderItem {
	private int itemid;
	private String remark;
	private int number;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remaik) {
		this.remark = remaik;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "OrderItem [itemid=" + itemid + ", remark=" + remark + ", number=" + number + "]";
	}
	
	
	
}
