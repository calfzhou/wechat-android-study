package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.ab.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.q;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.bindqq.QQGroupUI;
import java.util.Timer;
import junit.framework.Assert;

public final class bh
  implements a, as
{
  private Context context;
  private o dXi;
  private boolean ebT;
  private i elz;

  public bh(Context paramContext)
  {
    this.context = paramContext;
  }

  private void IC()
  {
    int i = 1;
    boolean bool1;
    label72: boolean bool2;
    label94: o localo2;
    if ((0x1000 & x.pO()) == 0)
    {
      bool1 = i;
      this.ebT = bool1;
      HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.dXi.BU("contact_info_header_helper");
      localHelperHeaderPreference.u(this.elz.getUsername(), this.elz.od(), this.context.getString(n.bCs));
      if (!this.ebT)
        break label149;
      int j = i;
      localHelperHeaderPreference.mY(j);
      o localo1 = this.dXi;
      if (this.ebT)
        break label155;
      bool2 = i;
      localo1.R("contact_info_qqfriend_view", bool2);
      localo2 = this.dXi;
      if (this.ebT)
        break label161;
    }
    while (true)
    {
      localo2.R("contact_info_qqfriend_uninstall", i);
      this.dXi.R("contact_info_qqfriend_install", this.ebT);
      return;
      bool1 = false;
      break;
      label149: int k = 0;
      break label72;
      label155: bool2 = false;
      break label94;
      label161: i = 0;
    }
  }

  public static void b(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean);
    for (String str = paramContext.getString(n.cgw); ; str = paramContext.getString(n.cgC))
    {
      paramContext.getString(n.buo);
      cr localcr = com.tencent.mm.ui.base.e.a(paramContext, str, true, null);
      bk localbk = new bk(paramBoolean, null);
      new Timer().schedule(new bl(localcr, localbk), 1500L);
      return;
    }
  }

  public final boolean ID()
  {
    bg.qW().oQ().b(this);
    bg.qX().d(new k(5));
    return true;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    int i = com.tencent.mm.platformtools.ap.R(paramObject);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = Integer.valueOf(i);
    arrayOfObject1[2] = paramap;
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXZ1YjcHplf39QoLClRyaaOQ=", "onNotifyChange event:%d obj:%d stg:%s", arrayOfObject1);
    if ((paramap != bg.qW().oQ()) || (i <= 0))
    {
      arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = paramap;
      z.e("!44@/B4Tb64lLpLSOpQlr7qYXZ1YjcHplf39QoLClRyaaOQ=", "onNotifyChange error obj:%d stg:%s", arrayOfObject2);
    }
    while ((i != 40) && (i != 34) && (i != 7))
    {
      Object[] arrayOfObject2;
      return;
    }
    IC();
  }

  public final boolean a(o paramo, i parami, boolean paramBoolean, int paramInt)
  {
    if (paramo != null);
    for (boolean bool1 = true; ; bool1 = false)
    {
      Assert.assertTrue(bool1);
      boolean bool2 = false;
      if (parami != null)
        bool2 = true;
      Assert.assertTrue(bool2);
      Assert.assertTrue(y.dI(parami.getUsername()));
      bg.qW().oQ().a(this);
      this.elz = parami;
      this.dXi = paramo;
      paramo.addPreferencesFromResource(q.czp);
      IC();
      return true;
    }
  }

  public final boolean ky(String paramString)
  {
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXZ1YjcHplf39QoLClRyaaOQ=", "handleEvent : key = " + paramString);
    if (com.tencent.mm.platformtools.ap.ja(paramString).length() <= 0)
      return false;
    if (paramString.equals("contact_info_qqfriend_view"))
    {
      if (!x.qi())
      {
        com.tencent.mm.ui.base.e.a(this.context, n.bCt, n.buo, new bi(this), null);
        return true;
      }
      Intent localIntent = new Intent();
      localIntent.setClass(this.context, QQGroupUI.class);
      this.context.startActivity(localIntent);
      return true;
    }
    if (paramString.equals("contact_info_qqfriend_install"))
    {
      b(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_qqfriend_uninstall"))
    {
      com.tencent.mm.ui.base.e.a(this.context, this.context.getString(n.cgz), "", this.context.getString(n.bsM), this.context.getString(n.bsK), new bj(this), null);
      return true;
    }
    z.e("!44@/B4Tb64lLpLSOpQlr7qYXZ1YjcHplf39QoLClRyaaOQ=", "handleEvent : unExpected key = " + paramString);
    return false;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.bh
 * JD-Core Version:    0.6.2
 */