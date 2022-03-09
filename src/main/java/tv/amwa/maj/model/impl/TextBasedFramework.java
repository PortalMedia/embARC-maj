package tv.amwa.maj.model.impl;

import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.model.DescriptiveFramework;

@MediaClass(uuid1 = 0x0d010401, uuid2 = 0x0401, uuid3 = 0x0100,
		  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
		  definedName = "TextBasedFramework",
		  description = "The TextBasedFramework class specifies descriptive metadata.",
		  symbol = "TextBasedFramework",
		  isConcrete = false)
public interface TextBasedFramework extends DescriptiveFramework {

	//060e2b34.0101010d.06010104.05410100
	TextBasedObject getTextBasedObject();

	void setTextBasedObject(TextBasedObject textBasedObjet);

}