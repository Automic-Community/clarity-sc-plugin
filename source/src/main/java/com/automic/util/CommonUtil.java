package com.automic.util;

/**
 * Utility class
 * 
 */
public final class CommonUtil {

	private static final String RESPONSE_ERROR = "ERROR";

	private CommonUtil() {
	}

	/**
	 * Method to append type to message in format "type | message"
	 * 
	 * @param type
	 * @param message
	 * @return
	 */
	public static String formatErrorMessage(final String message) {
		final StringBuilder sb = new StringBuilder();
		sb.append(RESPONSE_ERROR).append(" | ").append(message);
		return sb.toString();
	}

	/**
	 * Method to check if a String is not empty
	 *
	 * @param field
	 * @return true if String is not empty else false
	 */
	public static boolean isNotEmpty(String field) {
		return field != null && !field.isEmpty();
	}

	/**
	 * Method to check if a String is not empty
	 *
	 * @param field
	 * @return true if String is not empty else false
	 */
	public static final boolean checkNotEmpty(String field) {
		return field != null && !field.isEmpty();
	}

}
