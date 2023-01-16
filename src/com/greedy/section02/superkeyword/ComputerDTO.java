package com.greedy.section02.superkeyword;

public class ComputerDTO extends ProductDTO {

	private String cpu;					//cpu
	private int hdd;					//hdd
	private int ram;					//ram
	private String operationSystem;		//운영체제
	
	public ComputerDTO() {
		System.out.println("ComputerDTO 클래스의 기본생성자 호출함...");
	}

	public ComputerDTO(String cpu, int hdd, int ram, String operationSystem) {
		super();
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
		
		System.out.println("ComputerDTO 클래스의 모든 필드를 초기화하는 생성자 호출함...");
	}
	
	public ComputerDTO(String cod, String brand, String name, int price, java.util.Date manufacturingDate,
			String cpu, int hdd, int ram, String operationSystem) {
		
		super(cpu, brand, name, price, manufacturingDate);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
				
		System.out.println("ComputerDTO 클래스의 부모 필드도 초기화하는 생성자 호출함...");
	}
	
	


	public String getCpu() {
		return cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public int getRam() {
		return ram;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	
	public String getInformation() {
//		return "ComputerDTD {code="+ super.getCode() +
//				+ ", brand=" + super.getBrand() +
//				", price=" + super.getPrice()+
//				", manufacturingDate=" + super.getManufacturingDate() +
//				", cpu=" + this.cpu +
//				", hdd=" + this.hdd +
//				", ram=" + this.ram +
//				", operationSystem=" + this.operationSystem +
//				"]";
		return super.getInformation() +
				"ComputerDTO [cpu=" + cpu +
				", hdd=" + hdd +
				", ram=" + ram +
				"operationSystem=" + operationSystem
				+ "]";
 	}
}
