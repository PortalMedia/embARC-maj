package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.AS07GSPDMSObject;
import tv.amwa.maj.model.AS07GspTdDMSFramework;

@MediaClass(uuid1 = 0x0d010701, uuid2 = 0x0b02, uuid3 = 0x0100,
uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "AS11SegmentationFrameworkImpl",
aliases = {},
description = "AS11SegmentationFrameworkImpl",
symbol = "AS11SegmentationFrameworkImpl")
public class AS11SegmentationFrameworkImpl 
extends DescriptiveFrameworkImpl implements AS11SegmentationFramework {

	private static final long serialVersionUID = 145566436L;

	private int as11PartNumber = -1;
	private int as11PartTotal = -1;
	

	@Override
	@MediaProperty(uuid1 = 0x0d010701, uuid2 = 0x0b02, uuid3 = 0x0101,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "AS_11_Part_Number",
			aliases = {  },
			typeName = "UInt16",
			optional = false,
			uniqueIdentifier = false,
			symbol = "AS_11_Part_Number")
	public int getPartNumber() 
			throws PropertyNotPresentException {
		if(as11PartNumber < 0) throw new PropertyNotPresentException("AS 11 Part Number Missing");
		return as11PartNumber;
	}
	

	@Override
	@MediaPropertySetter("AS_11_Part_Number")
	public void setPartNumber(
			int as11PartNumber) {

		this.as11PartNumber = as11PartNumber;
	}

	@Override
	@MediaProperty(uuid1 = 0x0d010701, uuid2 = 0x0b02, uuid3 = 0x0102,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "AS_11_Part_Total",
			aliases = {  },
			typeName = "UInt16",
			optional = false,
			uniqueIdentifier = false,
			symbol = "AS_11_Part_Total")
	public int getPartTotal() 
			throws PropertyNotPresentException {
		if(as11PartTotal < 0) throw new PropertyNotPresentException("AS 11 Part Total Missing");
		return as11PartTotal;
	}
	

	@Override
	@MediaPropertySetter("AS_11_Part_Total")
	public void setPartTotal(
			int as11PartTotal) {

		this.as11PartTotal = as11PartTotal;
	}
}
