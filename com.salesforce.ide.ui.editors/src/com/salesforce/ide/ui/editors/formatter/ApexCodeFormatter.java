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

import org.eclipse.jface.text.formatter.IFormattingStrategy;
import org.eclipse.jface.text.formatter.MultiPassContentFormatter;

/**
 * Apex code formatter
 * 
 * @author jjulba
 * @version 1.0
 * @since 2015/01/30
 * 
 */
public class ApexCodeFormatter extends MultiPassContentFormatter {

	public ApexCodeFormatter(String partitioning, String type) {
		super(partitioning, type);
	}
	
	public ApexCodeFormatter(String partitioning, String type, IFormattingStrategy masterStrategy) {
		super(partitioning, type);
	}

}

