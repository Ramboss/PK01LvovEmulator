package com.lvovpk;

import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Keyboard Abstraction layer
 */
class Keyboard {

	private static final int[][] shortcuts = {
		{ KeyEvent.VK_F8,     EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmMode },
		{ KeyEvent.VK_L,      EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmLoad },
		{ KeyEvent.VK_F6,     EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmReset },
		{ KeyEvent.VK_P,      EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmPause },
		{ KeyEvent.VK_C,      EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmResume },
		{ KeyEvent.VK_I,      EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmImport },
		{ KeyEvent.VK_B,      EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmInvokeEditor },
		{ KeyEvent.VK_R,      EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmRestore },
		{ KeyEvent.VK_E,      EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmExport },
		{ KeyEvent.VK_D,      EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmDumpF },
		{ KeyEvent.VK_O,      EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmInvokeLog },
		{ KeyEvent.VK_F5,     EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmSnap },
		{ KeyEvent.VK_T,      EmulatorUI.menuShortcutKeyMask, EmulatorUI.cmChangeTicks },
		{ KeyEvent.VK_ESCAPE, 0,                              EmulatorUI.cmInvokeDebugger }
	};
	
	public static boolean enableShortcuts = false;
	
	public static Map<String, Integer> as_int;
	

	//-----------------------------------------------------------------------------
	static {
	    as_int = new ConcurrentHashMap<String, Integer>();
	    as_int.put("VK_ENTER",                     new Integer(    '\n'));
	    as_int.put("VK_BACK_SPACE",                new Integer(    '\b'));
	    as_int.put("VK_TAB",                       new Integer(    '\t'));
	    as_int.put("VK_CANCEL",                    new Integer(    0x03));
	    as_int.put("VK_CLEAR",                     new Integer(    0x0C));
	    as_int.put("VK_SHIFT",                     new Integer(    0x10));
	    as_int.put("VK_CONTROL",                   new Integer(    0x11));
	    as_int.put("VK_ALT",                       new Integer(    0x12));
	    as_int.put("VK_PAUSE",                     new Integer(    0x13));
	    as_int.put("VK_CAPS_LOCK",                 new Integer(    0x14));
	    as_int.put("VK_ESCAPE",                    new Integer(    0x1B));
	    as_int.put("VK_SPACE",                     new Integer(    0x20));
	    as_int.put("VK_PAGE_UP",                   new Integer(    0x21));
	    as_int.put("VK_PAGE_DOWN",                 new Integer(    0x22));
	    as_int.put("VK_END",                       new Integer(    0x23));
	    as_int.put("VK_HOME",                      new Integer(    0x24));
	    as_int.put("VK_LEFT",                      new Integer(    0x25));
	    as_int.put("VK_UP",                        new Integer(    0x26));
	    as_int.put("VK_RIGHT",                     new Integer(    0x27));
	    as_int.put("VK_DOWN",                      new Integer(    0x28));
	    as_int.put("VK_COMMA",                     new Integer(    0x2C));
	    as_int.put("VK_MINUS",                     new Integer(    0x2D));
	    as_int.put("VK_PERIOD",                    new Integer(    0x2E));
	    as_int.put("VK_SLASH",                     new Integer(    0x2F));
	    as_int.put("VK_0",                         new Integer(    0x30));
	    as_int.put("VK_1",                         new Integer(    0x31));
	    as_int.put("VK_2",                         new Integer(    0x32));
	    as_int.put("VK_3",                         new Integer(    0x33));
	    as_int.put("VK_4",                         new Integer(    0x34));
	    as_int.put("VK_5",                         new Integer(    0x35));
	    as_int.put("VK_6",                         new Integer(    0x36));
	    as_int.put("VK_7",                         new Integer(    0x37));
	    as_int.put("VK_8",                         new Integer(    0x38));
	    as_int.put("VK_9",                         new Integer(    0x39));
	    as_int.put("VK_SEMICOLON",                 new Integer(    0x3B));
	    as_int.put("VK_EQUALS",                    new Integer(    0x3D));
	    as_int.put("VK_A",                         new Integer(    0x41));
	    as_int.put("VK_B",                         new Integer(    0x42));
	    as_int.put("VK_C",                         new Integer(    0x43));
	    as_int.put("VK_D",                         new Integer(    0x44));
	    as_int.put("VK_E",                         new Integer(    0x45));
	    as_int.put("VK_F",                         new Integer(    0x46));
	    as_int.put("VK_G",                         new Integer(    0x47));
	    as_int.put("VK_H",                         new Integer(    0x48));
	    as_int.put("VK_I",                         new Integer(    0x49));
	    as_int.put("VK_J",                         new Integer(    0x4A));
	    as_int.put("VK_K",                         new Integer(    0x4B));
	    as_int.put("VK_L",                         new Integer(    0x4C));
	    as_int.put("VK_M",                         new Integer(    0x4D));
	    as_int.put("VK_N",                         new Integer(    0x4E));
	    as_int.put("VK_O",                         new Integer(    0x4F));
	    as_int.put("VK_P",                         new Integer(    0x50));
	    as_int.put("VK_Q",                         new Integer(    0x51));
	    as_int.put("VK_R",                         new Integer(    0x52));
	    as_int.put("VK_S",                         new Integer(    0x53));
	    as_int.put("VK_T",                         new Integer(    0x54));
	    as_int.put("VK_U",                         new Integer(    0x55));
	    as_int.put("VK_V",                         new Integer(    0x56));
	    as_int.put("VK_W",                         new Integer(    0x57));
	    as_int.put("VK_X",                         new Integer(    0x58));
	    as_int.put("VK_Y",                         new Integer(    0x59));
	    as_int.put("VK_Z",                         new Integer(    0x5A));
	    as_int.put("VK_OPEN_BRACKET",              new Integer(    0x5B));
	    as_int.put("VK_BACK_SLASH",                new Integer(    0x5C));
	    as_int.put("VK_CLOSE_BRACKET",             new Integer(    0x5D));
	    as_int.put("VK_NUMPAD0",                   new Integer(    0x60));
	    as_int.put("VK_NUMPAD1",                   new Integer(    0x61));
	    as_int.put("VK_NUMPAD2",                   new Integer(    0x62));
	    as_int.put("VK_NUMPAD3",                   new Integer(    0x63));
	    as_int.put("VK_NUMPAD4",                   new Integer(    0x64));
	    as_int.put("VK_NUMPAD5",                   new Integer(    0x65));
	    as_int.put("VK_NUMPAD6",                   new Integer(    0x66));
	    as_int.put("VK_NUMPAD7",                   new Integer(    0x67));
	    as_int.put("VK_NUMPAD8",                   new Integer(    0x68));
	    as_int.put("VK_NUMPAD9",                   new Integer(    0x69));
	    as_int.put("VK_MULTIPLY",                  new Integer(    0x6A));
	    as_int.put("VK_ADD",                       new Integer(    0x6B));
	    as_int.put("VK_SEPARATER",                 new Integer(    0x6C));
	    as_int.put("VK_SUBTRACT",                  new Integer(    0x6D));
	    as_int.put("VK_DECIMAL",                   new Integer(    0x6E));
	    as_int.put("VK_DIVIDE",                    new Integer(    0x6F));
	    as_int.put("VK_DELETE",                    new Integer(    0x7F));
	    as_int.put("VK_NUM_LOCK",                  new Integer(    0x90));
	    as_int.put("VK_SCROLL_LOCK",               new Integer(    0x91));
	    as_int.put("VK_F1",                        new Integer(    0x70));
	    as_int.put("VK_F2",                        new Integer(    0x71));
	    as_int.put("VK_F3",                        new Integer(    0x72));
	    as_int.put("VK_F4",                        new Integer(    0x73));
	    as_int.put("VK_F5",                        new Integer(    0x74));
	    as_int.put("VK_F6",                        new Integer(    0x75));
	    as_int.put("VK_F7",                        new Integer(    0x76));
	    as_int.put("VK_F8",                        new Integer(    0x77));
	    as_int.put("VK_F9",                        new Integer(    0x78));
	    as_int.put("VK_F10",                       new Integer(    0x79));
	    as_int.put("VK_F11",                       new Integer(    0x7A));
	    as_int.put("VK_F12",                       new Integer(    0x7B));
	    as_int.put("VK_F13",                       new Integer(  0xF000));
	    as_int.put("VK_F14",                       new Integer(  0xF001));
	    as_int.put("VK_F15",                       new Integer(  0xF002));
	    as_int.put("VK_F16",                       new Integer(  0xF003));
	    as_int.put("VK_F17",                       new Integer(  0xF004));
	    as_int.put("VK_F18",                       new Integer(  0xF005));
	    as_int.put("VK_F19",                       new Integer(  0xF006));
	    as_int.put("VK_F20",                       new Integer(  0xF007));
	    as_int.put("VK_F21",                       new Integer(  0xF008));
	    as_int.put("VK_F22",                       new Integer(  0xF009));
	    as_int.put("VK_F23",                       new Integer(  0xF00A));
	    as_int.put("VK_F24",                       new Integer(  0xF00B));
	    as_int.put("VK_PRINTSCREEN",               new Integer(    0x9A));
	    as_int.put("VK_INSERT",                    new Integer(    0x9B));
	    as_int.put("VK_HELP",                      new Integer(    0x9C));
	    as_int.put("VK_META",                      new Integer(    0x9D));
	    as_int.put("VK_BACK_QUOTE",                new Integer(    0xC0));
	    as_int.put("VK_QUOTE",                     new Integer(    0xDE));
	    as_int.put("VK_KP_UP",                     new Integer(    0xE0));
	    as_int.put("VK_KP_DOWN",                   new Integer(    0xE1));
	    as_int.put("VK_KP_LEFT",                   new Integer(    0xE2));
	    as_int.put("VK_KP_RIGHT",                  new Integer(    0xE3));
	    as_int.put("VK_DEAD_GRAVE",                new Integer(    0x80));
	    as_int.put("VK_DEAD_ACUTE",                new Integer(    0x81));
	    as_int.put("VK_DEAD_CIRCUMFLEX",           new Integer(    0x82));
	    as_int.put("VK_DEAD_TILDE",                new Integer(    0x83));
	    as_int.put("VK_DEAD_MACRON",               new Integer(    0x84));
	    as_int.put("VK_DEAD_BREVE",                new Integer(    0x85));
	    as_int.put("VK_DEAD_ABOVEDOT",             new Integer(    0x86));
	    as_int.put("VK_DEAD_DIAERESIS",            new Integer(    0x87));
	    as_int.put("VK_DEAD_ABOVERING",            new Integer(    0x88));
	    as_int.put("VK_DEAD_DOUBLEACUTE",          new Integer(    0x89));
	    as_int.put("VK_DEAD_CARON",                new Integer(    0x8A));
	    as_int.put("VK_DEAD_CEDILLA",              new Integer(    0x8B));
	    as_int.put("VK_DEAD_OGONEK",               new Integer(    0x8C));
	    as_int.put("VK_DEAD_IOTA",                 new Integer(    0x8D));
	    as_int.put("VK_DEAD_VOICED_SOUND",         new Integer(    0x8E));
	    as_int.put("VK_DEAD_SEMIVOICED_SOUND",     new Integer(    0x8F));
	    as_int.put("VK_AMPERSAND",                 new Integer(    0x96));
	    as_int.put("VK_ASTERISK",                  new Integer(    0x97));
	    as_int.put("VK_QUOTEDBL",                  new Integer(    0x98));
	    as_int.put("VK_LESS",                      new Integer(    0x99));
	    as_int.put("VK_GREATER",                   new Integer(    0xA0));
	    as_int.put("VK_BRACELEFT",                 new Integer(    0xA1));
	    as_int.put("VK_BRACERIGHT",                new Integer(    0xA2));
	    as_int.put("VK_AT",                        new Integer(  0x0200));
	    as_int.put("VK_COLON",                     new Integer(  0x0201));
	    as_int.put("VK_CIRCUMFLEX",                new Integer(  0x0202));
	    as_int.put("VK_DOLLAR",                    new Integer(  0x0203));
	    as_int.put("VK_EURO_SIGN",                 new Integer(  0x0204));
	    as_int.put("VK_EXCLAMATION_MARK",          new Integer(  0x0205));
	    as_int.put("VK_INVERTED_EXCLAMATION_MARK", new Integer(  0x0206));
	    as_int.put("VK_LEFT_PARENTHESIS",          new Integer(  0x0207));
	    as_int.put("VK_NUMBER_SIGN",               new Integer(  0x0208));
	    as_int.put("VK_PLUS",                      new Integer(  0x0209));
	    as_int.put("VK_RIGHT_PARENTHESIS",         new Integer(  0x020A));
	    as_int.put("VK_UNDERSCORE",                new Integer(  0x020B));
	    as_int.put("VK_FINAL",                     new Integer(  0x0018));
	    as_int.put("VK_CONVERT",                   new Integer(  0x001C));
	    as_int.put("VK_NONCONVERT",                new Integer(  0x001D));
	    as_int.put("VK_ACCEPT",                    new Integer(  0x001E));
	    as_int.put("VK_MODECHANGE",                new Integer(  0x001F));
	    as_int.put("VK_KANA",                      new Integer(  0x0015));
	    as_int.put("VK_KANJI",                     new Integer(  0x0019));
	    as_int.put("VK_ALPHANUMERIC",              new Integer(  0x00F0));
	    as_int.put("VK_KATAKANA",                  new Integer(  0x00F1));
	    as_int.put("VK_HIRAGANA",                  new Integer(  0x00F2));
	    as_int.put("VK_FULL_WIDTH",                new Integer(  0x00F3));
	    as_int.put("VK_HALF_WIDTH",                new Integer(  0x00F4));
	    as_int.put("VK_ROMAN_CHARACTERS",          new Integer(  0x00F5));
	    as_int.put("VK_ALL_CANDIDATES",            new Integer(  0x0100));
	    as_int.put("VK_PREVIOUS_CANDIDATE",        new Integer(  0x0101));
	    as_int.put("VK_CODE_INPUT",                new Integer(  0x0102));
	    as_int.put("VK_JAPANESE_KATAKANA",         new Integer(  0x0103));
	    as_int.put("VK_JAPANESE_HIRAGANA",         new Integer(  0x0104));
	    as_int.put("VK_JAPANESE_ROMAN",            new Integer(  0x0105));
	    as_int.put("VK_CUT",                       new Integer(  0xFFD1));
	    as_int.put("VK_COPY",                      new Integer(  0xFFCD));
	    as_int.put("VK_PASTE",                     new Integer(  0xFFCF));
	    as_int.put("VK_UNDO",                      new Integer(  0xFFCB));
	    as_int.put("VK_AGAIN",                     new Integer(  0xFFC9));
	    as_int.put("VK_FIND",                      new Integer(  0xFFD0));
	    as_int.put("VK_PROPS",                     new Integer(  0xFFCA));
	    as_int.put("VK_STOP",                      new Integer(  0xFFC8));
	    as_int.put("VK_COMPOSE",                   new Integer(  0xFF20));
	    as_int.put("VK_ALT_GRAPH",                 new Integer(  0xFF7E));
	    as_int.put("VK_UNDEFINED",                 new Integer(     0x0));
	    
	    for (int i=0; i<0xFF; i++) as_int.put(
	        "VK_x_"+Integer.toHexString(i).toUpperCase(),
	        new Integer(i)
	    );
	}

	//-----------------------------------------------------------------------------
	
	public static int getCommandForShortcut(KeyEvent e) {
		if (enableShortcuts) {
			for (int i = 0; i < shortcuts.length; i++) {
				if (shortcuts[i][0] == e.getKeyCode() && shortcuts[i][1] == e.getModifiers()) {
					return shortcuts[i][2];
				}
			}
		}
		return 0;
	}
	
	public static int[] getShortcutForCommand(int command) {
		if (enableShortcuts) {
			for (int i = 0; i < shortcuts.length; i++) {
				if (shortcuts[i][2] == command) {
					return new int[] { shortcuts[i][0], shortcuts[i][1] };
				}
			}
		}
		return null;
	}
}
