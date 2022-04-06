package tv.amwa.maj.model.impl;

import java.io.Serializable;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.record.AUID;

@MediaClass(uuid1 = 0x0d010101, uuid2 = 0x0101, uuid3 = 0x6b00,
uuid4 = {0x06, 0x0E, 0x2B, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "AudioChannelLabelSubDescriptor",
aliases = {},
description = "AudioChannelLabelSubDescriptor",
symbol = "AudioChannelLabelSubDescriptor")
public class AudioChannelLabelSubDescriptorImpl 

extends
MCALabelSubDescriptorImpl
implements
	Cloneable,
	Serializable, AudioChannelLabelSubDescriptor{

	private static final long serialVersionUID = 1499366436L;

	
	private AUID soundfieldGroupLinkID = null;
	
	@Override
	@MediaProperty(uuid1 = 0x01030701, uuid2 = 0x0600, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "SoundfieldGroupLinkID",
			aliases = {  },
			typeName = "AUID",
			optional = true,
			uniqueIdentifier = false,
			symbol = "SoundfieldGroupLinkID")
	public AUID getSoundfieldGroupLinkID() throws PropertyNotPresentException {
		if(soundfieldGroupLinkID == null)
			throw new PropertyNotPresentException("Missing soundfieldGroupLinkID");
		return soundfieldGroupLinkID;
	}
	
	@Override
	@MediaPropertySetter("SoundfieldGroupLinkID")
	public void setDateTimeChannelID(
			AUID soundfieldGroupLinkID) {

		this.soundfieldGroupLinkID = soundfieldGroupLinkID;
	}
	
}
