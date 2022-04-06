
package tv.amwa.maj.model.impl;

import java.io.Serializable;

import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.io.xml.XMLSerializable;
import tv.amwa.maj.record.AUID;

@MediaClass(uuid1 = 0x0d010401, uuid2 = (short) 0x0403, uuid3 = (short) 0x0100,
		uuid4 = { 0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
		definedName = "TextBasedObject",
		symbol = "TextBasedObject",
		description = "")
public class TextBasedObjectImpl
	extends
		InterchangeObjectImpl
	implements
		Cloneable,
		Serializable,
		XMLSerializable, TextBasedObject {

	private static final long serialVersionUID = -2841492239125321529L;

	public String rfc5646TextLanguageCode = null;
	public String textDataDescription = null;
	public AUID textBasedMetadataPayloadSchemeID = null;
	public String textMIMEMediaType = null;

	public TextBasedObjectImpl() { }

	@Override
	@MediaProperty(uuid1 = 0x03010102, uuid2 = (short) 0x0214, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "RFC5646TextLanguageCode",
			typeName = "UTF16String",
			optional = false,
			uniqueIdentifier = false,
			symbol = "RFC5646TextLanguageCode")
	public String getRFC5646TextLanguageCode() {

		return rfc5646TextLanguageCode;
	}

	@Override
	@MediaPropertySetter("RFC5646TextLanguageCode")
	public void setRFC5646TextLanguageCode(
			String rfc5646TextLanguageCode){
		this.rfc5646TextLanguageCode = rfc5646TextLanguageCode;
	}
	

	@Override
	@MediaProperty(uuid1 = 0x03020106, uuid2 = (short) 0x0302, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "TextDataDescription",
			typeName = "UTF16String",
			optional = false,
			uniqueIdentifier = false,
			symbol = "TextDataDescription")
	public String getTextDataDescription() {

		return textDataDescription;
	}

	@Override
	@MediaPropertySetter("TextDataDescription")
	public void setTextDataDescription(
			String textDataDescription){
		this.textDataDescription = textDataDescription;
	}
	

	@Override
	@MediaProperty(uuid1 = 0x04060806, uuid2 = (short) 0x0000, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "TextBasedMetadataPayloadSchemeID",
			typeName = "AUID",
			optional = false,
			uniqueIdentifier = true,
			symbol = "TextBasedMetadataPayloadSchemeID")
	public AUID getTextBasedMetadataPayloadSchemeID() {
		return textBasedMetadataPayloadSchemeID;
	}

	@Override
	@MediaPropertySetter("TextBasedMetadataPayloadSchemeID")
	public void setTextBasedMetadataPayloadSchemeID(
			AUID textBasedMetadataPayloadSchemeID){
		this.textBasedMetadataPayloadSchemeID = textBasedMetadataPayloadSchemeID;
	}
	
	@Override
	@MediaProperty(uuid1 = 0x04090202, uuid2 = (short) 0x0000, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "TextMIMEMediaType",
			typeName = "UTF16String",
			optional = false,
			uniqueIdentifier = false,
			symbol = "TextMIMEMediaType")
	public String getTextMIMEMediaType() {
		return textMIMEMediaType;
	}

	@Override
	@MediaPropertySetter("TextMIMEMediaType")
	public void setTextMIMEMediaType(
			String textMIMEMediaType){
		this.textMIMEMediaType = textMIMEMediaType;
	}

	@Override
	public TextBasedObjectImpl clone() {

		return (TextBasedObjectImpl) super.clone();
	}
}
