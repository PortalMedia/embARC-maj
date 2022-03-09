
package tv.amwa.maj.model.impl;

import java.io.Serializable;

import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.io.xml.XMLSerializable;
import tv.amwa.maj.model.ApplicationObject;

@MediaClass(uuid1 = 0x0d010401, uuid2 = (short) 0x0402, uuid3 = (short) 0x0200,
		uuid4 = { 0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
		definedName = "UTF8TextBasedSet",
		symbol = "UTF8TextBasedSet",
		description = "")
public class UTF8TextBasedSetImpl
	extends
	TextBasedObjectImpl
	implements
		Serializable,
		XMLSerializable, UTF8TextBasedSet {

	private static final long serialVersionUID = -2841492239125321529L;

	public String utf8TextData = null;

	public UTF8TextBasedSetImpl() { }

	@Override
	@MediaProperty(uuid1 = 0x03010220, uuid2 = (short) 0x0301, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "UTF8TextData",
			typeName = "UTF8String",
			optional = false,
			uniqueIdentifier = false,
			symbol = "UTF8TextData")
	public String getUTF8TextData() {

		return utf8TextData;
	}

	@Override
	@MediaPropertySetter("UTF8TextData")
	public void setUTF8TextData(
			String utf8TextData){
		this.utf8TextData = utf8TextData;
	}
	

}
