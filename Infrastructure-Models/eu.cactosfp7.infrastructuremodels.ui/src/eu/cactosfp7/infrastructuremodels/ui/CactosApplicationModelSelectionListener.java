package eu.cactosfp7.infrastructuremodels.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import tools.descartes.dlim.Sequence;
import tools.descartes.dlim.generator.editor.views.PlotView;
import tools.descartes.dlim.util.DlimSwitch;

public class CactosApplicationModelSelectionListener implements
		ISelectionListener {

	private static final String PLOTVIEWID = "tools.descartes.dlim.generator.editor.views.PlotView";

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if(selection instanceof TreeSelection) {
			 Object selectedObject = ((TreeSelection) selection).getFirstElement();
			 if(selectedObject instanceof EObject) {
				 Sequence sequence = new DlimSwitch<Sequence>() {
					 public Sequence caseSequence(Sequence sequence) {
						 return sequence;
					 }
					 public Sequence defaultCase(EObject object) {
				         if (object != null && object.eContainer() != null && object.eContainer().eClass().getEPackage() == modelPackage) {
				             return doSwitch(object.eContainer());
				         } else {
				             return null;
				         }
					 };
				 }.doSwitch((EObject) selectedObject);
			    if(sequence != null) {
                    IViewReference[] references = PlatformUI.getWorkbench()
                            .getActiveWorkbenchWindow().getActivePage()
                            .getViewReferences();
                    for (int i = 0; i < references.length; i++) {
                        if (references[i].getId().equals(PLOTVIEWID)) {
                            PlotView view = (PlotView) (references[i]
                                    .getView(true));
                            view.updatePlot(sequence);
                        }
                    }
			    }
			 }
		}
	}
}
