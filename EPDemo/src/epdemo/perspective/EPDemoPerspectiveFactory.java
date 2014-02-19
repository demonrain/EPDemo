package epdemo.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class EPDemoPerspectiveFactory implements IPerspectiveFactory {
	protected static final String ID_SERVERS_VIEW = "org.eclipse.wst.server.ui.ServersView";
	protected static final String ID_SEARCH_VIEW = "org.eclipse.search.ui.views.SearchView";
	protected static final String ID_HISTORY_VIEW = "org.eclipse.team.ui.GenericHistoryView";
	protected static final String ID_EPDemo_Navigator_VIEW = "EPDemo.view";
	
	@Override
	public void createInitialLayout(IPageLayout layout) {
		// ��ȡ͸����ͼ�ı༭�ռ��ʾ
		String editerArea = layout.getEditorArea();

		// �༭�����ϲ���ͼ
		IFolderLayout leftTop = layout.createFolder("leftTop", IPageLayout.LEFT, 0.25f, editerArea); // ����ڡ�editerArea���༭����λ��left
		
		// �¼� template views ����Ķ�Ӧ��ͼ  
		leftTop.addView(ID_EPDemo_Navigator_VIEW);
		leftTop.addView(IPageLayout.ID_PROJECT_EXPLORER); //������ͼ	

		// �༭�����½���ͼ
		IFolderLayout leftBottom = layout.createFolder("leftBottom", IPageLayout.BOTTOM, 0.5f, IPageLayout.ID_PROJECT_EXPLORER); // ��������桮left����ͼ��λ���ڵײ�
		leftBottom.addView(IPageLayout.ID_OUTLINE); // OUTLINE��ͼ

		// �༭���ײ���ͼ
		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.65f, editerArea); // ����ڡ�editerArea���༭����λ�õײ�
		bottom.addView(IPageLayout.ID_PROP_SHEET); // ������ͼ
		bottom.addView(ID_SERVERS_VIEW);//��������ͼ
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW); // ������ͼ
		bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);//����̨��ͼ
		bottom.addView(ID_SEARCH_VIEW);//������ͼ
		bottom.addView(ID_HISTORY_VIEW);//��ʷ��ͼ
	}

}
