package org.mobicents.media.core.ice.network.stun.message.attributes.address;

import org.mobicents.media.core.ice.network.stun.message.attributes.StunAttribute;

/**
 * The REFLECTED-FROM attribute is present only in Binding Responses, when the
 * Binding Request contained a RESPONSE-ADDRESS attribute.
 * <p>
 * The attribute contains the identity (in terms of IP address) of the source
 * where the request came from. Its purpose is to provide traceability, so that
 * a STUN server cannot be used as a reflector for denial-of-service attacks.
 * </p>
 * 
 * Its syntax is identical to the MAPPED-ADDRESS attribute.
 */
public class ReflectedFromAttribute extends AddressAttribute {
	public static final String NAME = "REFLECTED-FROM";

	public ReflectedFromAttribute() {
		super(StunAttribute.REFLECTED_FROM);
	}

	@Override
	public String getName() {
		return NAME;
	}
}
