package gov.epa.festc.core.action;

import gov.epa.festc.core.FestcApplication;

import java.awt.event.ActionEvent;

import saf.core.ui.actions.AbstractSAFAction;

/**
 * Action for opening files.
 * 
 * @author Qun He
 * @version $Revision$ $Date$
 */
public class DeleteAction extends AbstractSAFAction<FestcApplication> {
	private static final long serialVersionUID = 2948227677960767437L;

	/**
	 * Invoked when an action occurs.
	 */
	public void actionPerformed(ActionEvent e) {
		workspace.getApplicationMediator().deleteProject();
	}
}
