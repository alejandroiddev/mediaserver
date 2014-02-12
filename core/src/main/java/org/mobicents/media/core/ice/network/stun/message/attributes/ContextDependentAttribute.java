package org.mobicents.media.core.ice.network.stun.message.attributes;

import org.ice4j.attribute.Attribute;

/**
 * Represents a type of attribute which contains a value that depends on the
 * content of the message.
 * <p>
 * The attribute can use a provided {@link Context} to lookup the necessary
 * data.
 * </p>
 * <p>
 * Rather than encoding them via the standard {@link Attribute#encode()} method,
 * the stack would use the one from this interface.
 * </p>
 * 
 * @author Henrique Rosa
 * 
 */
public interface ContextDependentAttribute {

	/**
	 * Returns a binary representation of this attribute.
	 * 
	 * @param data
	 *            the content of the message that this attribute will be
	 *            transported in
	 * @param offset
	 *            the <tt>content</tt>-related offset where the actual content
	 *            starts.
	 * @param length
	 *            the length of the content in the <tt>content</tt> array.
	 * 
	 * @return a binary representation of this attribute valid for the message
	 *         with the specified <tt>content</tt>.
	 */
	byte[] encode(byte[] data, int offset, int length);

}
