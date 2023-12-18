package com.sai;

import java.io.IOException;

import java.io.InputStream;
import java.sql.Date;
import java.util.Base64;

public class productinfo {
   
	private Integer productid;
	private String productName;
	private Double productPrice;
	private String productmadein;
	private String productCompany;
	private Date productmanufacturedate;
	private Date productexpiredate;
	private InputStream productimage;
	
	
	 //converting image to base 64
    public String getBase64ProductImage() {
        try {
            return Base64.getEncoder().encodeToString(productimage.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }




	public Integer getProductid() {
		return productid;
	}




	public void setProductid(Integer productid) {
		this.productid = productid;
	}




	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}


	public String getProductmadein() {
		return productmadein;
	}


	public void setProductmadein(String productmadein) {
		this.productmadein = productmadein;
	}


	public String getProductCompany() {
		return productCompany;
	}


	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}


	public Date getProductmanufacturedate() {
		return productmanufacturedate;
	}


	public void setProductmanufacturedate(Date productmanufacturedate) {
		this.productmanufacturedate = productmanufacturedate;
	}


	public Date getProductexpiredate() {
		return productexpiredate;
	}


	public void setProductexpiredate(Date productexpiredate) {
		this.productexpiredate = productexpiredate;
	}


	public InputStream getProductimage() {
		return productimage;
	}


	public void setProductimage(InputStream productimage) {
		this.productimage = productimage;
	}


	
	
	
	
	
}
