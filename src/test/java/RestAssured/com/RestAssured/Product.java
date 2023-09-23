package RestAssured.com.RestAssured;

import java.util.HashMap;

import org.apache.juneau.annotation.Beanc;

public  class Product {
	private String page;
	private String per_page;
	private String total;
	private String total_pages;
	private HashMap<String,String> data;
	
	@Beanc(properties="page,per_page,total,total_pages,data")
	
	public Product(String page, String per_page, String total, String total_pages, HashMap<String, String> data) {
		
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data;
	}
	//public Product(String page, String per_page, String total, String total_pages, HashMap<String, String> data) {
		// TODO Auto-generated constructor stub
	
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPer_page() {
		return per_page;
	}
	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}
	public HashMap<String, String> getData() {
		return data;
	}
	public void setData(HashMap<String, String> data) {
		this.data = data;
	}

 
}