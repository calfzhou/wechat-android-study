package com.tencent.mm.ui.openapi;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.q;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bp;
import com.tencent.mm.storage.bq;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class AppProfileUI extends MMPreference
  implements al
{
  private com.tencent.mm.ui.base.preference.o dXi;
  private com.tencent.mm.pluginsdk.model.app.k eYT;
  private cm gQj = null;
  private f jKb;

  private static void a(com.tencent.mm.pluginsdk.model.app.k paramk, boolean paramBoolean)
  {
    LinkedList localLinkedList = new LinkedList();
    StringBuilder localStringBuilder = new StringBuilder().append(paramk.field_appId).append(",");
    if (paramBoolean);
    for (String str = "1"; ; str = "2")
    {
      localLinkedList.add(new bq(10165, str));
      bg.qW().oS().a(new bp(localLinkedList));
      return;
    }
  }

  private void aYL()
  {
    this.gQj = new k(this);
    this.gQj.sendEmptyMessageDelayed(0, 30L);
  }

  private void refresh()
  {
    int i = 1;
    this.dXi.removeAll();
    this.dXi.addPreferencesFromResource(q.cyY);
    AppHeaderPreference localAppHeaderPreference;
    f localf;
    if (this.eYT.field_status == i)
    {
      this.dXi.BV("app_profile_add");
      localAppHeaderPreference = (AppHeaderPreference)this.dXi.BU("app_profile_header");
      localf = this.jKb;
      if (this.eYT.field_status != i)
        break label101;
    }
    while (true)
    {
      localAppHeaderPreference.a(localf, i);
      return;
      this.dXi.BV("app_profile_remove");
      break;
      label101: int j = 0;
    }
  }

  protected final void DP()
  {
    boolean bool = true;
    this.jKb = new i(this);
    this.eYT = l.F(getIntent().getStringExtra("AppProfileUI_AppId"), bool);
    if (this.eYT != null);
    while (true)
    {
      Assert.assertTrue("initView : appInfo does not exist", bool);
      oP(n.btV);
      this.dXi = aTL();
      a(new j(this));
      refresh();
      return;
      bool = false;
    }
  }

  public final int DZ()
  {
    return q.cyY;
  }

  public final void a(String paramString, ao paramao)
  {
    if (paramString.equals(this.eYT.field_appId))
      DP();
  }

  public final boolean a(com.tencent.mm.ui.base.preference.o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    z.i("!32@/B4Tb64lLpIp04dUyvDvrIgIfQlkMGYq", str + " item has been clicked!");
    if (str.equals("app_profile_add"))
    {
      this.eYT.field_status = 1;
      this.eYT.field_modifyTime = System.currentTimeMillis();
      bf.GO().a(this.eYT, new String[0]);
      refresh();
      a(this.eYT, true);
      aYL();
      return true;
    }
    if (str.equals("app_profile_remove"))
    {
      this.eYT.field_status = 0;
      this.eYT.field_modifyTime = System.currentTimeMillis();
      bf.GO().a(this.eYT, new String[0]);
      refresh();
      a(this.eYT, false);
      aYL();
      return true;
    }
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  protected void onPause()
  {
    bf.GO().h(this);
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    bf.GO().g(this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.AppProfileUI
 * JD-Core Version:    0.6.2
 */