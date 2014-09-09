package com.tencent.mm.ui.contact.profile;

import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.model.p;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

final class dx
  implements MenuItem.OnMenuItemClickListener
{
  dx(SayHiWithSnsPermissionUI paramSayHiWithSnsPermissionUI, String paramString, int paramInt)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jEN.XF();
    LinkedList localLinkedList1 = new LinkedList();
    localLinkedList1.add(this.iIl);
    LinkedList localLinkedList2 = new LinkedList();
    localLinkedList2.add(Integer.valueOf(this.jAV));
    String str = SayHiWithSnsPermissionUI.a(this.jEN);
    HashMap localHashMap = new HashMap();
    if (SayHiWithSnsPermissionUI.b(this.jEN).bcq());
    for (int i = 1; ; i = 0)
    {
      localHashMap.put(this.iIl, Integer.valueOf(i));
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      z.d("!56@/B4Tb64lLpJYfIea4uyJ4DxeQ3x/nuZkVAwnV8Ld0w53NEDaSOmORQ==", "select sns permission, %s", arrayOfObject);
      p localp = new p(2, localLinkedList1, localLinkedList2, str, "", localHashMap);
      bg.qX().d(localp);
      SayHiWithSnsPermissionUI localSayHiWithSnsPermissionUI = this.jEN;
      ActionBarActivity localActionBarActivity = this.jEN.aPI();
      this.jEN.getString(n.buo);
      SayHiWithSnsPermissionUI.a(localSayHiWithSnsPermissionUI, e.a(localActionBarActivity, this.jEN.getString(n.ceq), true, new dy(this, localp)));
      return false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dx
 * JD-Core Version:    0.6.2
 */