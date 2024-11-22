package utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author chuac
 */
public class LengthAndIntegerRestrictedDocument extends PlainDocument {

  private final int limit;

  public LengthAndIntegerRestrictedDocument(int limit) {
    this.limit = limit;
  }

  @Override
  public void insertString(int offs, String str, AttributeSet a)
      throws BadLocationException {
    if (str == null || !str.matches("\\d+"))
      return;

    if ((getLength() + str.length()) <= limit) {
      super.insertString(offs, str, a);
    }
  }
}
