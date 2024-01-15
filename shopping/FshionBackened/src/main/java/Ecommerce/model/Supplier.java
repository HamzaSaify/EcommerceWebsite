package Ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Supplier")
public class Supplier {
@Id
@GeneratedValue
int supplierID;
String supplierName;
String supplierAddr;












public int getSupplierID() {
	return supplierID;
}
public void setSupplierID(int supplierID) {
	this.supplierID = supplierID;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}
public String getSupplierAddr() {
	return supplierAddr;
}
public void setSupplierAddr(String supplierAddr) {
	this.supplierAddr = supplierAddr;
}


}
