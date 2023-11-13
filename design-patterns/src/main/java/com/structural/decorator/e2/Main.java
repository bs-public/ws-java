package com.structural.decorator.e2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface TextFormatter {
	String format(String text);
}

class PlainTextFormatter implements TextFormatter {

	@Override
	public String format(String text) {
		return text;
	}

}

abstract class TextDecorator implements TextFormatter {

	private TextFormatter textFormatter;

	public TextDecorator(TextFormatter textFormatter) {
		this.textFormatter = textFormatter;
	}

	@Override
	public String format(String text) {
		return textFormatter.format(text);
	}
}

class BoldTextDecorator extends TextDecorator {

	public BoldTextDecorator(TextFormatter textFormatter) {
		super(textFormatter);
	}

	@Override
	public String format(String text) {
		String formattedText = super.format(text);
		return "<b>" + formattedText + "</b>";
	}

}

class ItalicTextDecorator extends TextDecorator {

	public ItalicTextDecorator(TextFormatter textFormatter) {
		super(textFormatter);
	}

	@Override
	public String format(String text) {
		String formattedText = super.format(text);
		return "<i>" + formattedText + "</i>";
	}

}

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	private static final String TEXT = "Text";

	public static void main(String[] args) {
		String formattedText;
		TextFormatter plainTextFormatter = new PlainTextFormatter();
		formattedText = plainTextFormatter.format(TEXT);
		LOG.info("Formatted Text: {}", formattedText);

		TextFormatter boldFormatter = new BoldTextDecorator(plainTextFormatter);
		formattedText = boldFormatter.format(TEXT);
		LOG.info("Formatted Text: {}", formattedText);

		TextFormatter italicFormatter = new ItalicTextDecorator(plainTextFormatter);
		formattedText = italicFormatter.format(TEXT);
		LOG.info("Formatted Text: {}", formattedText);

		TextFormatter boldAndItalicFormatter = new ItalicTextDecorator(boldFormatter);
		formattedText = boldAndItalicFormatter.format(TEXT);
		LOG.info("Formatted Text: {}", formattedText);
	}

}
