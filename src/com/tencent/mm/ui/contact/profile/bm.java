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
import java.util.Timer;
import junit.framework.Assert;

public final class bm
  implements a, as
{
  private Context context;
  private o dXi;
  private i elz;

  public bm(Context paramContext)
  {
    this.context = paramContext;
  }

  private void IC()
  {
    int i = 1;
    boolean bool;
    label63: o localo;
    if ((0x2000000 & x.pO()) == 0)
    {
      bool = i;
      HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.dXi.BU("contact_info_header_helper");
      localHelperHeaderPreference.u(this.elz.getUsername(), this.elz.od(), this.context.getString(n.bDp));
      if (!bool)
        break label107;
      int j = i;
      localHelperHeaderPreference.mY(j);
      this.dXi.R("contact_info_voiceinput_install", bool);
      localo = this.dXi;
      if (bool)
        break label113;
    }
    while (true)
    {
      localo.R("contact_info_voiceinput_uninstall", i);
      return;
      bool = false;
      break;
      label107: int k = 0;
      break label63;
      label113: i = 0;
    }
  }

  public static void b(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean);
    for (String str = paramContext.getString(n.cgw); ; str = paramContext.getString(n.cgC))
    {
      paramContext.getString(n.buo);
      cr localcr = com.tencent.mm.ui.base.e.a(paramContext, str, true, null);
      bo localbo = new bo(paramBoolean, null);
      new Timer().schedule(new bp(localcr, localbo), 1500L);
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
    z.d("!56@/B4Tb64lLpLSOpQlr7qYXXN1CK5uNaZz27rgttE+iE1PZJ+IxBzQUQ==", "onNotifyChange event:%d obj:%d stg:%s", arrayOfObject1);
    if ((paramap != bg.qW().oQ()) || (i <= 0))
    {
      arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = paramap;
      z.e("!56@/B4Tb64lLpLSOpQlr7qYXXN1CK5uNaZz27rgttE+iE1PZJ+IxBzQUQ==", "onNotifyChange error obj:%d stg:%s", arrayOfObject2);
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
      Assert.assertTrue(y.dB(parami.getUsername()));
      bg.qW().oQ().a(this);
      this.elz = parami;
      this.dXi = paramo;
      paramo.addPreferencesFromResource(q.czw);
      IC();
      return true;
    }
  }

  public final boolean ky(String paramString)
  {
    z.d("!56@/B4Tb64lLpLSOpQlr7qYXXN1CK5uNaZz27rgttE+iE1PZJ+IxBzQUQ==", "handleEvent : key = " + paramString);
    if (com.tencent.mm.platformtools.ap.ja(paramString).length() <= 0)
      return false;
    if (paramString.equals("contact_info_voiceinput_install"))
    {
      b(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_voiceinput_uninstall"))
    {
      com.tencent.mm.ui.base.e.a(this.context, this.context.getString(n.cgz), "", this.context.getString(n.bsM), this.context.getString(n.bsK), new bn(this), null);
      return true;
    }
    z.e("!56@/B4Tb64lLpLSOpQlr7qYXXN1CK5uNaZz27rgttE+iE1PZJ+IxBzQUQ==", "handleEvent : unExpected key = " + paramString);
    return false;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.bm
 * JD-Core Version:    0.6.2
 */