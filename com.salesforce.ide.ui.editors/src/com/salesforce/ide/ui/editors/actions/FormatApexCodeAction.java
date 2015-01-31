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
package com.salesforce.ide.ui.editors.actions;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.AbstractTextEditor;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.TextEditorAction;

/**
 * Apex code formatter
 * 
 * @author jjulba
 * @version 1.0
 * @since 2015/01/30
 * 
 */
public class FormatApexCodeAction extends TextEditorAction {
	
	 private static final Logger logger = Logger.getLogger(FormatApexCodeAction.class);
	 
	 private ISourceViewer sourceViewer;

	
	public FormatApexCodeAction(ResourceBundle bundle, String prefix, ITextEditor editor, ISourceViewer sourceViewer) {
        super(bundle, prefix, editor);
        this.sourceViewer = sourceViewer;
	}
	
	private IAnnotationModel getAnnotationModel(ITextEditor editor) {
         return (IAnnotationModel) editor.getAdapter(ProjectionAnnotationModel.class);
    }

	@Override
    public void run() {
		logger.info("JEROME FormatApexCodeAction.run");
        ITextEditor editor = getTextEditor();
      
        if(sourceViewer instanceof SourceViewer) {
        	((SourceViewer)sourceViewer).doOperation(ISourceViewer.FORMAT);
        }
//        ISelection selection = editor.getSelectionProvider().getSelection();
//        if (selection instanceof ITextSelection) {
//            ITextSelection textSelection = (ITextSelection) selection;
//            if (!textSelection.isEmpty()) {
//                IAnnotationModel model = getAnnotationModel(editor);
//                if (model != null) {
//                    int start = textSelection.getStartLine();
//                    int end = textSelection.getEndLine();
//                    try {
//                        IDocument document = editor.getDocumentProvider().getDocument(editor.getEditorInput());
//                        int offset = document.getLineOffset(start);
//                        int endOffset = document.getLineOffset(end + 1);
//                        Position position = new Position(offset, endOffset - offset);
//                        model.addAnnotation(new ProjectionAnnotation(), position);
//                    } catch (BadLocationException x) {
//                        // ignore
//                    }
//                }
//            }
        }

//	@Override
//	public void execute(IAction action) {
//		ApexCodeEditor apexCodeEditor;
//		
//		   VisualForceMultiPageEditor multiPageEditor = getSControlMultiPageEditor();
//	        SnippetDialog snippetDialog =
//	                new SnippetDialog(multiPageEditor.getTextEditor().getSite().getShell(), multiPageEditor.getTextEditor());
//	        try {
//	            snippetDialog.setSnippetDialogController(new SnippetDialogController());
//	        } catch (ForceProjectException e) {
//	            logger.warn("Unable to get snippet controller", e);
//	            Utils.openError("Action Error", "Unable to open Merge Field: " + e.getMessage());
//	            return;
//	        }
//	        IFile file = multiPageEditor.getEditorInputFile();
//	        snippetDialog.setProject(file.getProject());
//	        snippetDialog.open();
//		
//	}



}
