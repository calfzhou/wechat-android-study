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
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bn;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.chatting.ChattingUI;
import java.util.Timer;
import junit.framework.Assert;

public final class au
  implements a, as
{
  private static boolean ekQ = false;
  private Context context;
  private o dXi;
  private i elz;

  public au(Context paramContext)
  {
    this.context = paramContext;
  }

  private void IC()
  {
    int i = 1;
    boolean bool1;
    int j;
    boolean bool2;
    label57: label109: boolean bool3;
    label141: boolean bool4;
    label165: boolean bool5;
    label189: o localo4;
    if ((0x10 & x.pO()) == 0)
    {
      bool1 = i;
      j = x.pK();
      if (x.qi())
        break label245;
      if ((j & 0x4000) != 0)
      {
        int n = j & 0xFFFFBFFF;
        bg.qW().oQ().set(7, Integer.valueOf(n));
      }
      bool2 = false;
      HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.dXi.BU("contact_info_header_helper");
      localHelperHeaderPreference.u(this.elz.getUsername(), this.elz.od(), this.context.getString(n.bCd));
      if (!bool1)
        break label265;
      int k = i;
      localHelperHeaderPreference.mY(k);
      this.dXi.R("contact_info_medianote_install", bool1);
      o localo1 = this.dXi;
      if (bool1)
        break label271;
      bool3 = i;
      localo1.R("contact_info_medianote_view", bool3);
      o localo2 = this.dXi;
      if (bool1)
        break label277;
      bool4 = i;
      localo2.R("contact_info_medianote_sync_to_qqmail", bool4);
      o localo3 = this.dXi;
      if (bool1)
        break label283;
      bool5 = i;
      localo3.R("contact_info_medianote_clear_data", bool5);
      localo4 = this.dXi;
      if (bool1)
        break label289;
    }
    while (true)
    {
      localo4.R("contact_info_medianote_uninstall", i);
      ((CheckBoxPreference)this.dXi.BU("contact_info_medianote_sync_to_qqmail")).setChecked(bool2);
      return;
      bool1 = false;
      break;
      label245: if ((j & 0x4000) != 0)
      {
        bool2 = i;
        break label57;
      }
      bool2 = false;
      break label57;
      label265: int m = 0;
      break label109;
      label271: bool3 = false;
      break label141;
      label277: bool4 = false;
      break label165;
      label283: bool5 = false;
      break label189;
      label289: i = 0;
    }
  }

  public static void b(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean);
    for (String str = paramContext.getString(n.cgw); ; str = paramContext.getString(n.cgC))
    {
      paramContext.getString(n.buo);
      cr localcr = com.tencent.mm.ui.base.e.a(paramContext, str, true, null);
      ay localay = new ay(paramBoolean, paramContext, null);
      new Timer().schedule(new az(localcr, localay), 1500L);
      return;
    }
  }

  static void fI(boolean paramBoolean)
  {
    int i = x.pK();
    int j;
    if (paramBoolean)
    {
      j = i | 0x4000;
      bg.qW().oQ().set(7, Integer.valueOf(j));
      if (!paramBoolean)
        break label64;
    }
    label64: for (int k = 1; ; k = 2)
    {
      bg.qW().oS().a(new bn(13, k));
      return;
      j = i & 0xFFFFBFFF;
      break;
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
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXVFehxwMMVMkOCjK2yKpgUc=", "onNotifyChange event:%d obj:%d stg:%s", arrayOfObject1);
    if ((paramap != bg.qW().oQ()) || (i <= 0))
    {
      arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = paramap;
      z.e("!44@/B4Tb64lLpLSOpQlr7qYXVFehxwMMVMkOCjK2yKpgUc=", "onNotifyChange error obj:%d stg:%s", arrayOfObject2);
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
      Assert.assertTrue(y.dx(parami.getUsername()));
      bg.qW().oQ().a(this);
      this.elz = parami;
      this.dXi = paramo;
      paramo.addPreferencesFromResource(q.czl);
      IC();
      return true;
    }
  }

  public final boolean ky(String paramString)
  {
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXVFehxwMMVMkOCjK2yKpgUc=", "handleEvent : key = " + paramString);
    if (com.tencent.mm.platformtools.ap.ja(paramString).length() <= 0)
      return false;
    if (paramString.equals("contact_info_medianote_view"))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("Chat_User", "medianote");
      localIntent.setClass(this.context, ChattingUI.class);
      this.context.startActivity(localIntent);
      bg.qX().d(new k(5));
      return true;
    }
    if (paramString.equals("contact_info_medianote_sync_to_qqmail"))
    {
      if (!x.qi())
      {
        com.tencent.mm.ui.base.e.a(this.context, n.bCc, n.bCb, new av(this), null);
        IC();
      }
      while (true)
      {
        return true;
        fI(((CheckBoxPreference)this.dXi.BU(paramString)).isChecked());
      }
    }
    if (paramString.equals("contact_info_medianote_clear_data"))
    {
      com.tencent.mm.ui.base.e.a(this.context, this.context.getString(n.bBo), "", this.context.getString(n.bsM), this.context.getString(n.bsK), new aw(this), null);
      return true;
    }
    if (paramString.equals("contact_info_medianote_install"))
    {
      b(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_medianote_uninstall"))
    {
      com.tencent.mm.ui.base.e.a(this.context, this.context.getString(n.cgz), "", this.context.getString(n.bsM), this.context.getString(n.bsK), new ax(this), null);
      return true;
    }
    z.e("!44@/B4Tb64lLpLSOpQlr7qYXVFehxwMMVMkOCjK2yKpgUc=", "handleEvent : unExpected key = " + paramString);
    return false;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.au
 * JD-Core Version:    0.6.2
 */