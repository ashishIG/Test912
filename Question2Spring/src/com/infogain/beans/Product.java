package com.infogain.beans;

public class Product {
int pid;
String productName;
int productcost;
int quantityinHand;
public Product(int pid, String productName, int productcost, int quantityinHand) {
	super();
	this.pid = pid;
	this.productName = productName;
	this.productcost = productcost;
	this.quantityinHand = quantityinHand;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getProductcost() {
	return productcost;
}
public void setProductcost(int productcost) {
	this.productcost = productcost;
}
public int getQuantityinHand() {
	return quantityinHand;
}
public void setQuantityinHand(int quantityinHand) {
	this.quantityinHand = quantityinHand;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", productName=" + productName + ", productcost=" + productcost + ", quantityinHand="
			+ quantityinHand + "]";
}
 public void checkQuantity()
 {
	 
 }
}
