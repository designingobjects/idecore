/*******************************************************************************
 * Copyright (c) 2014 Salesforce.com, inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Salesforce.com, inc. - initial API and implementation
 ******************************************************************************/
package com.salesforce.ide.ui.editors.formatter;

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.text.edits.TextEdit;

import com.salesforce.ide.ui.editors.actions.FormatApexCodeAction;

/**
 * Apex code formatter
 * 
 * @author jjulba
 * @version 1.0
 * @since 2015/01/30
 * 
 */
public class ApexCodeFormatterUtil {
	
	private static final Logger logger = Logger.getLogger(ApexCodeFormatterUtil.class);

	@SuppressWarnings("rawtypes")
	public static TextEdit reformat(int kind, String source, int offset,
			int length, int indentationLevel, String lineSeparator, Map options) {
		logger.info("JEROME ApexCodeFormatterUtil.reformat");
		if (offset < 0 || length < 0 || offset + length > source.length()) {
			throw new IllegalArgumentException(
					"offset or length outside of string. offset: " + offset + ", length: " + length + ", string size: " + source.length()); //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
		}
		return ToolFactory.createCodeFormatter(options,
				ToolFactory.M_FORMAT_EXISTING).format(kind, source, offset,
				length, indentationLevel, lineSeparator);
	}

}
