package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.ab.k;
import com.tencent.mm.f.d;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.bindlinkedin.ListLinkedInFriendUI;
import junit.framework.Assert;

public final class ar
  implements com.tencent.mm.pluginsdk.b.a, com.tencent.mm.sdk.f.as
{
  private Context context;
  private o dXi;
  private i elz;
  private cb jDB;

  public ar(Context paramContext)
  {
    this.context = paramContext;
    this.jDB = new cc(paramContext);
  }

  private void IC()
  {
    int i;
    label85: Object localObject1;
    Object localObject2;
    if ((0x1000000 & x.pO()) == 0)
    {
      i = 1;
      this.dXi.removeAll();
      this.dXi.addPreferencesFromResource(q.czj);
      ((HelperHeaderPreference)this.dXi.BU("contact_info_header_helper")).a(this.elz, this.jDB);
      if (i == 0)
        break label179;
      this.dXi.R("contact_info_linkedin_account", false);
      this.dXi.BV("contact_info_linkedin_install");
      localObject1 = bg.qW().oQ().get(286722);
      localObject2 = bg.qW().oQ().get(286721);
      if ((i == 0) || (!d.on()))
        break label212;
      if (localObject1 == null)
        break label206;
    }
    label179: label206: for (String str1 = localObject1.toString(); ; str1 = null)
    {
      if (com.tencent.mm.platformtools.ap.jb(str1))
        break label212;
      String str2 = null;
      if (localObject2 != null)
        str2 = localObject2.toString();
      if (com.tencent.mm.platformtools.ap.jb(str2))
        break label212;
      this.dXi.R("contact_info_linkedin_add_friend", false);
      return;
      i = 0;
      break;
      this.dXi.R("contact_info_linkedin_account", true);
      this.dXi.BV("contact_info_linkedin_uninstall");
      break label85;
    }
    label212: this.dXi.R("contact_info_linkedin_add_friend", true);
  }

  public static void b(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean);
    for (String str = paramContext.getString(n.cgw); ; str = paramContext.getString(n.cgC))
    {
      paramContext.getString(n.buo);
      new ay(new at(com.tencent.mm.ui.base.e.a(paramContext, str, true, null), paramBoolean, null), false).cP(1500L);
      return;
    }
  }

  public final boolean ID()
  {
    bg.qW().oQ().b(this);
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.dXi.BU("contact_info_header_helper");
    if (localHelperHeaderPreference != null)
      localHelperHeaderPreference.onDetach();
    bg.qX().d(new k(5));
    return true;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    int i = ((Integer)paramObject).intValue();
    if ((i == 40) || (i == 34))
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
      Assert.assertTrue(y.dC(parami.getUsername()));
      bg.qW().oQ().a(this);
      this.elz = parami;
      this.dXi = paramo;
      IC();
      return true;
    }
  }

  public final boolean ky(String paramString)
  {
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXdJoeib3MANTtIdZrzLsR6A=", "handleEvent : key = " + paramString);
    if (com.tencent.mm.platformtools.ap.ja(paramString).length() <= 0)
      return false;
    if (paramString.equals("contact_info_linkedin_install"))
    {
      b(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_linkedin_uninstall"))
    {
      com.tencent.mm.ui.base.e.a(this.context, this.context.getString(n.cgz), "", this.context.getString(n.bsM), this.context.getString(n.bsK), new as(this), null);
      return true;
    }
    if (paramString.equals("contact_info_linkedin_account"))
      com.tencent.mm.am.a.a(this.context, "accountsync", "com.tencent.mm.ui.bindlinkedin.BindLinkedInUI", 1);
    if (paramString.equals("contact_info_linkedin_add_friend"))
    {
      Intent localIntent = new Intent(this.context, ListLinkedInFriendUI.class);
      localIntent.putExtra("KScene", 2);
      this.context.startActivity(localIntent);
      return true;
    }
    z.e("!44@/B4Tb64lLpLSOpQlr7qYXdJoeib3MANTtIdZrzLsR6A=", "handleEvent : unExpected key = " + paramString);
    return false;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramInt2 == -1))
      IC();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ar
 * JD-Core Version:    0.6.2
 */