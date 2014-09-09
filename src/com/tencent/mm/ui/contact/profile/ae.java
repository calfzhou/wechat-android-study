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
import com.tencent.mm.q;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.account.FacebookAuthUI;
import com.tencent.mm.ui.account.FacebookFriendUI;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.qrcode.ShowQRCodeStep1UI;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import junit.framework.Assert;

public final class ae
  implements a, as
{
  private Context context;
  private o dXi;
  private Map elA = new HashMap();
  private i elz;
  private cb jDq;

  public ae(Context paramContext)
  {
    this.context = paramContext;
    this.jDq = new bz(paramContext);
    bg.qW().oW().yF("facebookapp");
  }

  private void IC()
  {
    this.dXi.removeAll();
    if (this.elA.containsKey("contact_info_header_helper"))
    {
      HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.elA.get("contact_info_header_helper");
      localHelperHeaderPreference.a(this.elz, this.jDq);
      this.dXi.a(localHelperHeaderPreference);
    }
    if (this.elA.containsKey("contact_info_facebookapp_cat"))
      this.dXi.a((Preference)this.elA.get("contact_info_facebookapp_cat"));
    if ((0x2000 & x.pO()) == 0);
    for (int i = 1; i == 0; i = 0)
    {
      if (this.elA.containsKey("contact_info_facebookapp_install"))
        this.dXi.a((Preference)this.elA.get("contact_info_facebookapp_install"));
      return;
    }
    if (!x.qc())
      if (this.elA.containsKey("contact_info_facebookapp_connect"))
        this.dXi.a((Preference)this.elA.get("contact_info_facebookapp_connect"));
    while (true)
    {
      if (this.elA.containsKey("contact_info_facebookapp_cat2"))
        this.dXi.a((Preference)this.elA.get("contact_info_facebookapp_cat2"));
      if (!this.elA.containsKey("contact_info_facebookapp_uninstall"))
        break;
      this.dXi.a((Preference)this.elA.get("contact_info_facebookapp_uninstall"));
      return;
      if (this.elA.containsKey("contact_info_facebookapp_addr"))
      {
        this.dXi.a((Preference)this.elA.get("contact_info_facebookapp_addr"));
        ((Preference)this.elA.get("contact_info_facebookapp_addr")).setSummary((String)bg.qW().oQ().get(65826));
      }
      if (this.elA.containsKey("contact_info_facebookapp_showqrcode"))
        this.dXi.a((Preference)this.elA.get("contact_info_facebookapp_showqrcode"));
    }
  }

  public static void b(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean);
    for (String str = paramContext.getString(n.cgw); ; str = paramContext.getString(n.cgC))
    {
      paramContext.getString(n.buo);
      cr localcr = com.tencent.mm.ui.base.e.a(paramContext, str, true, null);
      ag localag = new ag(paramBoolean, null);
      new Timer().schedule(new ah(localcr, localag), 1500L);
      return;
    }
  }

  public final boolean ID()
  {
    bg.qW().oQ().b(this);
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.elA.get("contact_info_header_helper");
    if (localHelperHeaderPreference != null)
      localHelperHeaderPreference.onDetach();
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
    z.d("!56@/B4Tb64lLpLSOpQlr7qYXbdNKJ3S+JORCRaYiZV2BF/wG7eQPQq3mw==", "onNotifyChange event:%d obj:%d stg:%s", arrayOfObject1);
    if ((paramap != bg.qW().oQ()) || (i <= 0))
    {
      arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = paramap;
      z.e("!56@/B4Tb64lLpLSOpQlr7qYXbdNKJ3S+JORCRaYiZV2BF/wG7eQPQq3mw==", "onNotifyChange error obj:%d stg:%s", arrayOfObject2);
    }
    while ((i != 40) && (i != 34) && (i != 65825))
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
      Assert.assertTrue(y.dq(parami.getUsername()));
      bg.qW().oQ().a(this);
      this.elz = parami;
      this.dXi = paramo;
      paramo.addPreferencesFromResource(q.czd);
      Preference localPreference1 = paramo.BU("contact_info_header_helper");
      if (localPreference1 != null)
        this.elA.put("contact_info_header_helper", localPreference1);
      Preference localPreference2 = paramo.BU("contact_info_facebookapp_listfriend");
      if (localPreference2 != null)
        this.elA.put("contact_info_facebookapp_listfriend", localPreference2);
      Preference localPreference3 = paramo.BU("contact_info_facebookapp_connect");
      if (localPreference3 != null)
        this.elA.put("contact_info_facebookapp_connect", localPreference3);
      PreferenceCategory localPreferenceCategory1 = (PreferenceCategory)paramo.BU("contact_info_facebookapp_cat");
      if (localPreferenceCategory1 != null)
        this.elA.put("contact_info_facebookapp_cat", localPreferenceCategory1);
      Preference localPreference4 = paramo.BU("contact_info_facebookapp_addr");
      if (localPreference4 != null)
        this.elA.put("contact_info_facebookapp_addr", localPreference4);
      Preference localPreference5 = paramo.BU("contact_info_facebookapp_showqrcode");
      if (localPreference5 != null)
        this.elA.put("contact_info_facebookapp_showqrcode", localPreference5);
      PreferenceCategory localPreferenceCategory2 = (PreferenceCategory)paramo.BU("contact_info_facebookapp_cat2");
      if (localPreferenceCategory2 != null)
        this.elA.put("contact_info_facebookapp_cat2", localPreferenceCategory2);
      Preference localPreference6 = paramo.BU("contact_info_facebookapp_install");
      if (localPreference6 != null)
        this.elA.put("contact_info_facebookapp_install", localPreference6);
      Preference localPreference7 = paramo.BU("contact_info_facebookapp_uninstall");
      if (localPreference7 != null)
        this.elA.put("contact_info_facebookapp_uninstall", localPreference7);
      IC();
      return true;
    }
  }

  public final boolean ky(String paramString)
  {
    z.d("!56@/B4Tb64lLpLSOpQlr7qYXbdNKJ3S+JORCRaYiZV2BF/wG7eQPQq3mw==", "handleEvent : key = " + paramString);
    if (com.tencent.mm.platformtools.ap.ja(paramString).length() <= 0)
      return false;
    if (paramString.equals("contact_info_facebookapp_install"))
    {
      b(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_uninstall"))
    {
      com.tencent.mm.ui.base.e.a(this.context, this.context.getString(n.cgz), "", this.context.getString(n.bsM), this.context.getString(n.bsK), new af(this), null);
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_listfriend"))
    {
      this.context.startActivity(new Intent(this.context, FacebookFriendUI.class));
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_connect"))
    {
      Intent localIntent1 = new Intent(this.context, FacebookAuthUI.class);
      this.context.startActivity(localIntent1);
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_addr"))
    {
      Intent localIntent2 = new Intent(this.context, FacebookAuthUI.class);
      this.context.startActivity(localIntent2);
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_showqrcode"))
    {
      Intent localIntent3 = new Intent(this.context, ShowQRCodeStep1UI.class);
      localIntent3.putExtra("show_to", 4);
      this.context.startActivity(localIntent3);
      return true;
    }
    z.e("!56@/B4Tb64lLpLSOpQlr7qYXbdNKJ3S+JORCRaYiZV2BF/wG7eQPQq3mw==", "handleEvent : unExpected key = " + paramString);
    return false;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ae
 * JD-Core Version:    0.6.2
 */