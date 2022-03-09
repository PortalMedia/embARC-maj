package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.DescriptiveFramework;

public interface AS11SegmentationFramework extends DescriptiveFramework {

	int getPartNumber() throws PropertyNotPresentException;

	void setPartNumber(int as11PartNumber);

	int getPartTotal() throws PropertyNotPresentException;

	void setPartTotal(int as11PartTotal);

}