function productdet()
{
	var productid=document.getElementById(`productid`).value;
	var productName=document.getElementById(`productName`).value;
	var productPrice=document.getElementById(`productPrice`).value;
	var productmadein=document.getElementById(`productmadein`).value;
	var productCompany=document.getElementById(`productCompany`).value;
	var productmanufacturedate=document.getElementById(`productmanufacturedate`).value;
	var productexpiredate=document.getElementById(`productexpiredate`).value;


	if(productid.trim()==="" ||productName.trim()===""||productPrice.trim()===""||productmadein.trim()===""||productCompany.trim()==="")
	{
		alert("Insert all fileds")
		return false;
	}
	if(parseFloat (productPrice)<0)
	{
		alert("Price value should be greater than zero")
				return false;

	}
	
	if(productmanufacturedate>productexpiredate)
	{
		alert("Manufactuer date and expiry date should be in correct order")
		return false;
	}
	
	return true;
	
}