package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.model.b;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.preference.o;
import junit.framework.Assert;

abstract class be
  implements a, as
{
  protected Context context;
  protected o dXi;
  protected i elz;
  protected cb jDS;

  public be(Context paramContext, cb paramcb)
  {
    this.context = paramContext;
    this.jDS = paramcb;
  }

  private void IC()
  {
    this.dXi.removeAll();
    this.dXi.addPreferencesFromResource(DZ());
    boolean bool = aXQ();
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.dXi.BU("contact_info_header_helper");
    if (localHelperHeaderPreference != null)
      localHelperHeaderPreference.a(this.elz, this.jDS);
    if (!bool)
    {
      this.dXi.BV("contact_info_plugin_view");
      this.dXi.BV("contact_info_plugin_outsize");
      this.dXi.BV("contact_info_plugin_black");
      this.dXi.BV("contact_info_plugin_clear_data");
      this.dXi.BV("contact_info_plugin_uninstall");
      return;
    }
    this.dXi.BV("contact_info_plugin_install");
  }

  protected abstract int DZ();

  public boolean ID()
  {
    com.tencent.mm.model.bg.qW().oQ().b(this);
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.dXi.BU("contact_info_header_helper");
    if (localHelperHeaderPreference != null)
      localHelperHeaderPreference.onDetach();
    return true;
  }

  public void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    int i = com.tencent.mm.platformtools.ap.R(paramObject);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = Integer.valueOf(i);
    arrayOfObject1[2] = paramap;
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXQMRSWDOu2t6BmMXLRGhNNQ=", "onNotifyChange event:%d obj:%d stg:%s", arrayOfObject1);
    if ((paramap != com.tencent.mm.model.bg.qW().oQ()) || (i <= 0))
    {
      arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = paramap;
      z.e("!44@/B4Tb64lLpLSOpQlr7qYXQMRSWDOu2t6BmMXLRGhNNQ=", "onNotifyChange error obj:%d stg:%s", arrayOfObject2);
    }
    while ((i != 40) && (i != 34) && (i != 7))
    {
      Object[] arrayOfObject2;
      return;
    }
    IC();
  }

  public boolean a(o paramo, i parami, boolean paramBoolean, int paramInt)
  {
    boolean bool1;
    if (parami != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (com.tencent.mm.platformtools.ap.ja(parami.getUsername()).length() <= 0)
        break label80;
    }
    label80: for (boolean bool2 = true; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      boolean bool3 = false;
      if (paramo != null)
        bool3 = true;
      Assert.assertTrue(bool3);
      com.tencent.mm.model.bg.qW().oQ().a(this);
      this.elz = parami;
      this.dXi = paramo;
      IC();
      return true;
      bool1 = false;
      break;
    }
  }

  protected abstract boolean aXQ();

  protected abstract void clear();

  protected abstract void fH(boolean paramBoolean);

  public boolean ky(String paramString)
  {
    if ("contact_info_plugin_clear_data".equals(paramString))
    {
      com.tencent.mm.ui.base.e.a(this.context, this.context.getString(n.bBo), "", this.context.getString(n.bsM), this.context.getString(n.bsK), new bf(this), null);
      return true;
    }
    if (paramString.equals("contact_info_plugin_install"))
    {
      fH(true);
      return true;
    }
    if (paramString.equals("contact_info_plugin_uninstall"))
    {
      com.tencent.mm.ui.base.e.a(this.context, this.context.getString(n.cgz), "", this.context.getString(n.bsM), this.context.getString(n.bsK), new bg(this), null);
      return true;
    }
    z.e("!44@/B4Tb64lLpLSOpQlr7qYXQMRSWDOu2t6BmMXLRGhNNQ=", "handleEvent : unexpected key = " + paramString);
    return false;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.be
 * JD-Core Version:    0.6.2
 */