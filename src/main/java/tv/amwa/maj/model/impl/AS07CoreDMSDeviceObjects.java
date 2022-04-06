package tv.amwa.maj.model.impl;

import tv.amwa.maj.model.DescriptiveFramework;

public interface AS07CoreDMSDeviceObjects extends DescriptiveFramework{

	void setDeviceType(String deviceType);
	String getDeviceType();

	void setManufacturer(String manufacturer);
	String getManufacturer();
	

	void setModel(String model);
	String getModel();
	
	void setSerialNumber(String serialNumber);
	String getSerialNumber();
	
	void setUsageDescription(String usageDescription);
	String getUsageDescription();
	

}