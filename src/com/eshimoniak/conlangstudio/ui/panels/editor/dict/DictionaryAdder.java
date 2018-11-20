package com.eshimoniak.conlangstudio.ui.panels.editor.dict;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DictionaryAdder extends JPanel {
	private List<DictionaryFieldAdder> fields = new ArrayList<>();
	private JButton add;
	
	public DictionaryAdder(String[] headers, DictionaryEditor de) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		for (String header : headers) {
			DictionaryFieldAdder dfa = new DictionaryFieldAdder(header);
			fields.add(dfa);
			add(dfa);
		}
		add = new JButton("Add Entry");
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				de.addEntry(getEntry());
			}
		});
		add(add);
	}
	
	public String[] getEntry() {
		String[] entry = new String[fields.size()];
		
		for (int i = 0; i < entry.length; i++) {
			entry[i] = fields.get(i).getValue();
		}
		
		
		return entry;
	}
}
