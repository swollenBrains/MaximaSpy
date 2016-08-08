package com.swollenbrains.maximaFinder;

public class Peak<T> {
	
	private T leftMinPoint;
	private T maxPoint;
	private T leftMaxPoint;
	
	public Peak(T leftMinPoint, T maxPoint, T leftMaxPoint) {
		super();
		this.leftMinPoint = leftMinPoint;
		this.maxPoint = maxPoint;
		this.leftMaxPoint = leftMaxPoint;
	}

	public T getLeftMinPoint() {
		return leftMinPoint;
	}
	public void setLeftMinPoint(T leftMinPoint) {
		this.leftMinPoint = leftMinPoint;
	}
	public T getLeftMaxPoint() {
		return leftMaxPoint;
	}
	public void setLeftMaxPoint(T leftMaxPoint) {
		this.leftMaxPoint = leftMaxPoint;
	}
	public T getMaxPoint() {
		return maxPoint;
	}
	public void setMaxPoint(T maxPoint) {
		this.maxPoint = maxPoint;
	}
	
}
