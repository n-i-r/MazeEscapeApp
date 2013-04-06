/*
 * @(#)Test.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package org.jhotdraw.test.figures;

import java.awt.Font;

import org.jhotdraw.figures.TextFigure;

import junit.framework.TestCase;
// JUnitDoclet begin import
// JUnitDoclet end import

/*
 * Generated by JUnitDoclet, a tool provided by
 * ObjectFab GmbH under LGPL.
 * Please see www.junitdoclet.org, www.gnu.org
 * and www.objectfab.de for informations about
 * the tool, the licence and the authors.
 */

// JUnitDoclet begin javadoc_class
/**
 * TestCase TextFigureTest is generated by
 * JUnitDoclet to hold the tests for TextFigure.
 * @see org.jhotdraw.figures.TextFigure
 */
// JUnitDoclet end javadoc_class
public class TextFigureTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private TextFigure textfigure;
	// JUnitDoclet end class

	/**
	 * Constructor TextFigureTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public TextFigureTest(String name) {
		// JUnitDoclet begin method TextFigureTest
		super(name);
		// JUnitDoclet end method TextFigureTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public TextFigure createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new TextFigure();
		// JUnitDoclet end method testcase.createInstance
	}

	/**
	 * Method setUp is overwriting the framework method to
	 * prepare an instance of this TestCase for a single test.
	 * It's called from the JUnit framework only.
	 */
	protected void setUp() throws Exception {
		// JUnitDoclet begin method testcase.setUp
		super.setUp();
		textfigure = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		textfigure = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method moveBy()
	/**
	 * Method testMoveBy is testing moveBy
	 * @see org.jhotdraw.figures.TextFigure#moveBy(int, int)
	 */
	// JUnitDoclet end javadoc_method moveBy()
	public void testMoveBy() throws Exception {
		// JUnitDoclet begin method moveBy
		// JUnitDoclet end method moveBy
	}

	// JUnitDoclet begin javadoc_method basicDisplayBox()
	/**
	 * Method testBasicDisplayBox is testing basicDisplayBox
	 * @see org.jhotdraw.figures.TextFigure#basicDisplayBox(java.awt.Point, java.awt.Point)
	 */
	// JUnitDoclet end javadoc_method basicDisplayBox()
	public void testBasicDisplayBox() throws Exception {
		// JUnitDoclet begin method basicDisplayBox
		// JUnitDoclet end method basicDisplayBox
	}

	// JUnitDoclet begin javadoc_method displayBox()
	/**
	 * Method testDisplayBox is testing displayBox
	 * @see org.jhotdraw.figures.TextFigure#displayBox()
	 */
	// JUnitDoclet end javadoc_method displayBox()
	public void testDisplayBox() throws Exception {
		// JUnitDoclet begin method displayBox
		// JUnitDoclet end method displayBox
	}

	// JUnitDoclet begin javadoc_method textDisplayBox()
	/**
	 * Method testTextDisplayBox is testing textDisplayBox
	 * @see org.jhotdraw.figures.TextFigure#textDisplayBox()
	 */
	// JUnitDoclet end javadoc_method textDisplayBox()
	public void testTextDisplayBox() throws Exception {
		// JUnitDoclet begin method textDisplayBox
		// JUnitDoclet end method textDisplayBox
	}

	// JUnitDoclet begin javadoc_method readOnly()
	/**
	 * Method testReadOnly is testing readOnly
	 * @see org.jhotdraw.figures.TextFigure#readOnly()
	 */
	// JUnitDoclet end javadoc_method readOnly()
	public void testReadOnly() throws Exception {
		// JUnitDoclet begin method readOnly
		// JUnitDoclet end method readOnly
	}

	// JUnitDoclet begin javadoc_method setReadOnly()
	/**
	 * Method testSetReadOnly is testing setReadOnly
	 * @see org.jhotdraw.figures.TextFigure#setReadOnly(boolean)
	 */
	// JUnitDoclet end javadoc_method setReadOnly()
	public void testSetReadOnly() throws Exception {
		// JUnitDoclet begin method setReadOnly
		// JUnitDoclet end method setReadOnly
	}

	// JUnitDoclet begin javadoc_method getRepresentingFigure()
	/**
	 * Method testGetRepresentingFigure is testing getRepresentingFigure
	 * @see org.jhotdraw.figures.TextFigure#getRepresentingFigure()
	 */
	// JUnitDoclet end javadoc_method getRepresentingFigure()
	public void testGetRepresentingFigure() throws Exception {
		// JUnitDoclet begin method getRepresentingFigure
		// JUnitDoclet end method getRepresentingFigure
	}

	// JUnitDoclet begin javadoc_method setFont()
	/**
	 * Method testSetGetFont is testing setFont
	 * and getFont together by setting some value
	 * and verifying it by reading.
	 * @see org.jhotdraw.figures.TextFigure#setFont(java.awt.Font)
	 * @see org.jhotdraw.figures.TextFigure#getFont()
	 */
	// JUnitDoclet end javadoc_method setFont()
	public void testSetGetFont() throws Exception {
		// JUnitDoclet begin method setFont getFont
		java.awt.Font[] tests = { new Font("Helvetica", Font.PLAIN, 12), null };

		for (int i = 0; i < tests.length; i++) {
			textfigure.setFont(tests[i]);
			assertEquals(tests[i], textfigure.getFont());
		}
		// JUnitDoclet end method setFont getFont
	}

	// JUnitDoclet begin javadoc_method changed()
	/**
	 * Method testChanged is testing changed
	 * @see org.jhotdraw.figures.TextFigure#changed()
	 */
	// JUnitDoclet end javadoc_method changed()
	public void testChanged() throws Exception {
		// JUnitDoclet begin method changed
		// JUnitDoclet end method changed
	}

	// JUnitDoclet begin javadoc_method getAttribute()
	/**
	 * Method testGetAttribute is testing getAttribute
	 * @see org.jhotdraw.figures.TextFigure#getAttribute(java.lang.String)
	 */
	// JUnitDoclet end javadoc_method getAttribute()
	public void testGetAttribute() throws Exception {
		// JUnitDoclet begin method getAttribute
		// JUnitDoclet end method getAttribute
	}

	// JUnitDoclet begin javadoc_method setAttribute()
	/**
	 * Method testSetAttribute is testing setAttribute
	 * @see org.jhotdraw.figures.TextFigure#setAttribute(java.lang.String, java.lang.Object)
	 */
	// JUnitDoclet end javadoc_method setAttribute()
	public void testSetAttribute() throws Exception {
		// JUnitDoclet begin method setAttribute
		// JUnitDoclet end method setAttribute
	}

	// JUnitDoclet begin javadoc_method setText()
	/**
	 * Method testSetGetText is testing setText
	 * and getText together by setting some value
	 * and verifying it by reading.
	 * @see org.jhotdraw.figures.TextFigure#setText(java.lang.String)
	 * @see org.jhotdraw.figures.TextFigure#getText()
	 */
	// JUnitDoclet end javadoc_method setText()
	public void testSetGetText() throws Exception {
		// JUnitDoclet begin method setText getText
		java.lang.String[] tests = { "", " ", "a", "A", "�", "�", "0123456789", "012345678901234567890", "\n", null };

		for (int i = 0; i < tests.length; i++) {
			textfigure.setText(tests[i]);
			assertEquals(tests[i], textfigure.getText());
		}
		// JUnitDoclet end method setText getText
	}

	// JUnitDoclet begin javadoc_method acceptsTyping()
	/**
	 * Method testAcceptsTyping is testing acceptsTyping
	 * @see org.jhotdraw.figures.TextFigure#acceptsTyping()
	 */
	// JUnitDoclet end javadoc_method acceptsTyping()
	public void testAcceptsTyping() throws Exception {
		// JUnitDoclet begin method acceptsTyping
		// JUnitDoclet end method acceptsTyping
	}

	// JUnitDoclet begin javadoc_method drawBackground()
	/**
	 * Method testDrawBackground is testing drawBackground
	 * @see org.jhotdraw.figures.TextFigure#drawBackground(java.awt.Graphics)
	 */
	// JUnitDoclet end javadoc_method drawBackground()
	public void testDrawBackground() throws Exception {
		// JUnitDoclet begin method drawBackground
		// JUnitDoclet end method drawBackground
	}

	// JUnitDoclet begin javadoc_method drawFrame()
	/**
	 * Method testDrawFrame is testing drawFrame
	 * @see org.jhotdraw.figures.TextFigure#drawFrame(java.awt.Graphics)
	 */
	// JUnitDoclet end javadoc_method drawFrame()
	public void testDrawFrame() throws Exception {
		// JUnitDoclet begin method drawFrame
		// JUnitDoclet end method drawFrame
	}

	// JUnitDoclet begin javadoc_method overlayColumns()
	/**
	 * Method testOverlayColumns is testing overlayColumns
	 * @see org.jhotdraw.figures.TextFigure#overlayColumns()
	 */
	// JUnitDoclet end javadoc_method overlayColumns()
	public void testOverlayColumns() throws Exception {
		// JUnitDoclet begin method overlayColumns
		// JUnitDoclet end method overlayColumns
	}

	// JUnitDoclet begin javadoc_method handles()
	/**
	 * Method testHandles is testing handles
	 * @see org.jhotdraw.figures.TextFigure#handles()
	 */
	// JUnitDoclet end javadoc_method handles()
	public void testHandles() throws Exception {
		// JUnitDoclet begin method handles
		// JUnitDoclet end method handles
	}

	// JUnitDoclet begin javadoc_method write()
	/**
	 * Method testWrite is testing write
	 * @see org.jhotdraw.figures.TextFigure#write(org.jhotdraw.util.StorableOutput)
	 */
	// JUnitDoclet end javadoc_method write()
	public void testWrite() throws Exception {
		// JUnitDoclet begin method write
		// JUnitDoclet end method write
	}

	// JUnitDoclet begin javadoc_method read()
	/**
	 * Method testRead is testing read
	 * @see org.jhotdraw.figures.TextFigure#read(org.jhotdraw.util.StorableInput)
	 */
	// JUnitDoclet end javadoc_method read()
	public void testRead() throws Exception {
		// JUnitDoclet begin method read
		// JUnitDoclet end method read
	}

	// JUnitDoclet begin javadoc_method connect()
	/**
	 * Method testConnect is testing connect
	 * @see org.jhotdraw.figures.TextFigure#connect(org.jhotdraw.framework.Figure)
	 */
	// JUnitDoclet end javadoc_method connect()
	public void testConnect() throws Exception {
		// JUnitDoclet begin method connect
		// JUnitDoclet end method connect
	}

	// JUnitDoclet begin javadoc_method figureChanged()
	/**
	 * Method testFigureChanged is testing figureChanged
	 * @see org.jhotdraw.figures.TextFigure#figureChanged(org.jhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureChanged()
	public void testFigureChanged() throws Exception {
		// JUnitDoclet begin method figureChanged
		// JUnitDoclet end method figureChanged
	}

	// JUnitDoclet begin javadoc_method figureRemoved()
	/**
	 * Method testFigureRemoved is testing figureRemoved
	 * @see org.jhotdraw.figures.TextFigure#figureRemoved(org.jhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureRemoved()
	public void testFigureRemoved() throws Exception {
		// JUnitDoclet begin method figureRemoved
		// JUnitDoclet end method figureRemoved
	}

	// JUnitDoclet begin javadoc_method figureRequestRemove()
	/**
	 * Method testFigureRequestRemove is testing figureRequestRemove
	 * @see org.jhotdraw.figures.TextFigure#figureRequestRemove(org.jhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureRequestRemove()
	public void testFigureRequestRemove() throws Exception {
		// JUnitDoclet begin method figureRequestRemove
		// JUnitDoclet end method figureRequestRemove
	}

	// JUnitDoclet begin javadoc_method figureInvalidated()
	/**
	 * Method testFigureInvalidated is testing figureInvalidated
	 * @see org.jhotdraw.figures.TextFigure#figureInvalidated(org.jhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureInvalidated()
	public void testFigureInvalidated() throws Exception {
		// JUnitDoclet begin method figureInvalidated
		// JUnitDoclet end method figureInvalidated
	}

	// JUnitDoclet begin javadoc_method figureRequestUpdate()
	/**
	 * Method testFigureRequestUpdate is testing figureRequestUpdate
	 * @see org.jhotdraw.figures.TextFigure#figureRequestUpdate(org.jhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureRequestUpdate()
	public void testFigureRequestUpdate() throws Exception {
		// JUnitDoclet begin method figureRequestUpdate
		// JUnitDoclet end method figureRequestUpdate
	}

	// JUnitDoclet begin javadoc_method release()
	/**
	 * Method testRelease is testing release
	 * @see org.jhotdraw.figures.TextFigure#release()
	 */
	// JUnitDoclet end javadoc_method release()
	public void testRelease() throws Exception {
		// JUnitDoclet begin method release
		// JUnitDoclet end method release
	}

	// JUnitDoclet begin javadoc_method disconnect()
	/**
	 * Method testDisconnect is testing disconnect
	 * @see org.jhotdraw.figures.TextFigure#disconnect(org.jhotdraw.framework.Figure)
	 */
	// JUnitDoclet end javadoc_method disconnect()
	public void testDisconnect() throws Exception {
		// JUnitDoclet begin method disconnect
		// JUnitDoclet end method disconnect
	}

	// JUnitDoclet begin javadoc_method getTextHolder()
	/**
	 * Method testGetTextHolder is testing getTextHolder
	 * @see org.jhotdraw.figures.TextFigure#getTextHolder()
	 */
	// JUnitDoclet end javadoc_method getTextHolder()
	public void testGetTextHolder() throws Exception {
		// JUnitDoclet begin method getTextHolder
		// JUnitDoclet end method getTextHolder
	}

	// JUnitDoclet begin javadoc_method createCurrentFont()
	/**
	 * Method testCreateCurrentFont is testing createCurrentFont
	 * @see org.jhotdraw.figures.TextFigure#createCurrentFont()
	 */
	// JUnitDoclet end javadoc_method createCurrentFont()
	public void testCreateCurrentFont() throws Exception {
		// JUnitDoclet begin method createCurrentFont
		// JUnitDoclet end method createCurrentFont
	}

	// JUnitDoclet begin javadoc_method setCurrentFontName()
	/**
	 * Method testSetCurrentFontName is testing setCurrentFontName
	 * @see org.jhotdraw.figures.TextFigure#setCurrentFontName(java.lang.String)
	 */
	// JUnitDoclet end javadoc_method setCurrentFontName()
	public void testSetCurrentFontName() throws Exception {
		// JUnitDoclet begin method setCurrentFontName
		// JUnitDoclet end method setCurrentFontName
	}

	// JUnitDoclet begin javadoc_method setCurrentFontSize()
	/**
	 * Method testSetCurrentFontSize is testing setCurrentFontSize
	 * @see org.jhotdraw.figures.TextFigure#setCurrentFontSize(int)
	 */
	// JUnitDoclet end javadoc_method setCurrentFontSize()
	public void testSetCurrentFontSize() throws Exception {
		// JUnitDoclet begin method setCurrentFontSize
		// JUnitDoclet end method setCurrentFontSize
	}

	// JUnitDoclet begin javadoc_method setCurrentFontStyle()
	/**
	 * Method testSetCurrentFontStyle is testing setCurrentFontStyle
	 * @see org.jhotdraw.figures.TextFigure#setCurrentFontStyle(int)
	 */
	// JUnitDoclet end javadoc_method setCurrentFontStyle()
	public void testSetCurrentFontStyle() throws Exception {
		// JUnitDoclet begin method setCurrentFontStyle
		// JUnitDoclet end method setCurrentFontStyle
	}

	// JUnitDoclet begin javadoc_method testVault
	/**
	 * JUnitDoclet moves marker to this method, if there is not match
	 * for them in the regenerated code and if the marker is not empty.
	 * This way, no test gets lost when regenerating after renaming.
	 * <b>Method testVault is supposed to be empty.</b>
	 */
	// JUnitDoclet end javadoc_method testVault
	public void testVault() throws Exception {
		// JUnitDoclet begin method testcase.testVault
		// JUnitDoclet end method testcase.testVault
	}

}
