package tv.amwa.maj.model.impl;

import java.io.Serializable;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.DescriptiveFramework;
import tv.amwa.maj.record.AUID;

@MediaClass(uuid1 = 0x0d010401, uuid2 = 0x0401, uuid3 = 0x0100,
		  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
		  definedName = "TextBasedFramework",
		  description = "The TextBasedFramework class specifies descriptive metadata.",
		  symbol = "TextBasedFramework")
public class TextBasedFrameworkImpl
	extends 
		DescriptiveFrameworkImpl
	implements 
		Serializable,
		Cloneable, TextBasedFramework {

	private static final long serialVersionUID = 685052423244176561L;

	private TextBasedObject textBasedObject = null;
	//060e2b34.0101010d.06010104.05410100
	@Override
	@MediaProperty(uuid1 = 0x06010104, uuid2 = (short) 0x0541, uuid3 = (short) 0x0100,
			uuid4 = { 0x06, 0x0E, 0x2B, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "TextBasedObject",
			aliases = {  },
			typeName = "TextBasedObjectStrongReference",
			optional = true,
			uniqueIdentifier = false,
			symbol = "TextBasedObject",
			description = "Descriptive marker that strongly references this text based framework instance.")
	public TextBasedObject getTextBasedObject(){
		
		return textBasedObject;
	}

	@Override
	@MediaPropertySetter("TextBasedObject")
	public void setTextBasedObject(
			TextBasedObject textBasedObject) {
		this.textBasedObject = textBasedObject;
	}
	
	public TextBasedFrameworkImpl clone() {

		return (TextBasedFrameworkImpl) super.clone();

	}
}
