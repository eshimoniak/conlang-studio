package com.eshimoniak.conlangstudio.ui.labels;

import javax.swing.JLabel;

/**
 * A PaddedLabel with center alignment
 * @author Evan Shimoniak
**/
@SuppressWarnings("serial")
public class TableLabel extends PaddedLabel {
	public TableLabel(String text) {
		super(text, JLabel.CENTER);
	}
}
