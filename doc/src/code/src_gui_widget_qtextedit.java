/*   Ported from: src.gui.widgets.qtextedit.cpp
<snip>
//! [0]
  void MyTextEdit::contextMenuEvent(QContextMenuEvent *event)
  {
      QMenu *menu = createStandardContextMenu();
      menu->addAction(tr("My Menu Item"));
      //...
      menu->exec(event->globalPos());
      delete menu;
  }
//! [0]


//! [1]
    edit->textCursor().insertText(text);
//! [1]


//! [2]
    edit->textCursor().insertHtml(fragment);
//! [2]


</snip>
*/
import com.trolltech.qt.*;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.xml.*;
import com.trolltech.qt.network.*;
import com.trolltech.qt.sql.*;
import com.trolltech.qt.svg.*;


public class src_gui_widgets_qtextedit {
    public static void main(String args[]) {
        QApplication.initialize(args);
//! [0]
  void MyTextEdit.contextMenuEvent(QContextMenuEvent vent)
  {
      QMenu enu = createStandardContextMenu();
      menu.addAction(tr("My Menu Item"));
      //...
      menu.exec(event.globalPos());
      delete menu;
  }
//! [0]


//! [1]
    edit.textCursor().insertText(text);
//! [1]


//! [2]
    edit.textCursor().insertHtml(fragment);
//! [2]


    }
}