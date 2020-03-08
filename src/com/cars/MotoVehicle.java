package com.cars;

/**
 *汽车的抽象类
 */
public abstract class MotoVehicle {
	private String vehicleId;	//车牌号
	private String brand;		//品牌
	private int perRent;		//日租金
	
	//定义两个抽象方法
	public abstract float calRent(int days);	//计算租金
	public abstract void leaseOutFlow();		//租车流程
	
	/**
	 * 构造函数
	 */
	public MotoVehicle() {
		
	}
	public MotoVehicle(String vehicleId,String brand,int perRent) {
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.perRent=perRent;
	}
	
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPerRent() {
		return perRent;
	}
	public void setPerRent(int perRent) {
		this.perRent = perRent;
	}
		
}
