package tv.amwa.maj.model;

import tv.amwa.maj.model.impl.TextBasedObject;

public interface AS07GspTdDMSFramework extends DescriptiveFramework {
	public AS07GSPDMSObject getTextBasedObject() ;
		public void setTextBasedObject(
				AS07GSPDMSObject chunk);
	String getPrimaryRFC5646LanguageCode();
	void setPrimaryRFC5646LanguageCode(String primaryRFC5646LanguageCode);

}