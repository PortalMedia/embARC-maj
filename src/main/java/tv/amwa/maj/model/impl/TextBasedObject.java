package tv.amwa.maj.model.impl;

import tv.amwa.maj.record.AUID;

public interface TextBasedObject {

	String getRFC5646TextLanguageCode();

	void setRFC5646TextLanguageCode(String rfc5646TextLanguageCode);

	String getTextDataDescription();

	void setTextDataDescription(String textDataDescription);

	AUID getTextBasedMetadataPayloadSchemeID();

	void setTextBasedMetadataPayloadSchemeID(AUID textBasedMetadataPayloadSchemeID);

	String getTextMIMEMediaType();

	void setTextMIMEMediaType(String textMIMEMediaType);

	TextBasedObject clone();

}