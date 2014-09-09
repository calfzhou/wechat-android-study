package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.mm.ab.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.q;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.bindgooglecontact.BindGoogleContactIntroUI;
import com.tencent.mm.ui.bindgooglecontact.BindGoogleContactUI;
import com.tencent.mm.ui.bindgooglecontact.GoogleFriendUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import junit.framework.Assert;

public final class ak
  implements a, as
{
  private o eom;
  private boolean jDs;
  private i jDt;
  private Map jDu = new HashMap();
  private cb jDw;
  private boolean jia;
  private Context mContext;

  public ak(Context paramContext)
  {
    this.mContext = paramContext;
    this.jDw = new ao(this, this.mContext);
  }

  private void IC()
  {
    boolean bool;
    if ((0x800000 & x.pO()) == 0)
    {
      bool = true;
      this.jDs = bool;
      this.eom.removeAll();
      if (this.jDu.containsKey("contact_info_header_helper"))
      {
        HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.jDu.get("contact_info_header_helper");
        localHelperHeaderPreference.a(this.jDt, this.jDw);
        this.eom.a(localHelperHeaderPreference);
      }
      if (!this.jDs)
        break label200;
      if (this.jDu.containsKey("contact_info_googlecontact_add_view"))
        this.eom.a((Preference)this.jDu.get("contact_info_googlecontact_add_view"));
      if (this.jDu.containsKey("contact_info_googlecontact_setting_view"))
        this.eom.a((Preference)this.jDu.get("contact_info_googlecontact_setting_view"));
      if (this.jDu.containsKey("contact_info_googlecontact_uninstall"))
        this.eom.a((Preference)this.jDu.get("contact_info_googlecontact_uninstall"));
    }
    label200: 
    while (!this.jDu.containsKey("contact_info_googlecontact_install"))
    {
      return;
      bool = false;
      break;
    }
    this.eom.a((Preference)this.jDu.get("contact_info_googlecontact_install"));
  }

  public static void b(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean);
    for (String str = paramContext.getString(n.cgw); ; str = paramContext.getString(n.cgC))
    {
      paramContext.getString(n.buo);
      cr localcr = com.tencent.mm.ui.base.e.a(paramContext, str, true, null);
      am localam = new am(paramBoolean, null);
      new Timer().schedule(new an(localcr, localam), 1500L);
      return;
    }
  }

  public final boolean ID()
  {
    bg.qW().oQ().b(this);
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.jDu.get("contact_info_header_helper");
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
    z.d("!56@/B4Tb64lLpLSOpQlr7qYXWKN8PEE0/bHHwfP+4nd0qxolvaaysbDFQ==", "onNotifyChange event:%d obj:%d stg:%s", arrayOfObject1);
    if ((paramap != bg.qW().oQ()) || (i <= 0))
    {
      arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = paramap;
      z.e("!56@/B4Tb64lLpLSOpQlr7qYXWKN8PEE0/bHHwfP+4nd0qxolvaaysbDFQ==", "onNotifyChange error obj:%d stg:%s", arrayOfObject2);
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
      Assert.assertTrue(y.dJ(parami.getUsername()));
      bg.qW().oQ().a(this);
      this.jia = com.tencent.mm.modelfriend.ac.A(this.mContext);
      this.jDt = parami;
      this.eom = paramo;
      paramo.addPreferencesFromResource(q.czh);
      Preference localPreference1 = paramo.BU("contact_info_header_helper");
      if (localPreference1 != null)
        this.jDu.put("contact_info_header_helper", localPreference1);
      Preference localPreference2 = paramo.BU("contact_info_googlecontact_add_view");
      if (localPreference2 != null)
        this.jDu.put("contact_info_googlecontact_add_view", localPreference2);
      Preference localPreference3 = paramo.BU("contact_info_googlecontact_setting_view");
      if (localPreference3 != null)
        this.jDu.put("contact_info_googlecontact_setting_view", localPreference3);
      Preference localPreference4 = paramo.BU("contact_info_googlecontact_install");
      if (localPreference4 != null)
        this.jDu.put("contact_info_googlecontact_install", localPreference4);
      Preference localPreference5 = paramo.BU("contact_info_googlecontact_uninstall");
      if (localPreference5 != null)
        this.jDu.put("contact_info_googlecontact_uninstall", localPreference5);
      IC();
      return true;
    }
  }

  public final boolean ky(String paramString)
  {
    z.d("!56@/B4Tb64lLpLSOpQlr7qYXWKN8PEE0/bHHwfP+4nd0qxolvaaysbDFQ==", "handleEvent : key = " + paramString);
    if (TextUtils.isEmpty(paramString))
      return false;
    if (paramString.equals("contact_info_googlecontact_add_view"))
    {
      z.d("!56@/B4Tb64lLpLSOpQlr7qYXWKN8PEE0/bHHwfP+4nd0qxolvaaysbDFQ==", "contact_info_googlecontact_add_view");
      String str1 = (String)bg.qW().oQ().get(208903);
      String str2;
      if (this.jia)
      {
        str2 = (String)bg.qW().oQ().get(208901);
        if ((!TextUtils.isEmpty(str2)) && (!TextUtils.isEmpty(str1)))
          break label160;
        Intent localIntent2 = new Intent(this.mContext, BindGoogleContactUI.class);
        localIntent2.putExtra("enter_scene", 2);
        this.mContext.startActivity(localIntent2);
      }
      while (true)
      {
        return true;
        str2 = (String)bg.qW().oQ().get(208902);
        break;
        label160: Intent localIntent3 = new Intent(this.mContext, GoogleFriendUI.class);
        localIntent3.putExtra("enter_scene", 2);
        this.mContext.startActivity(localIntent3);
      }
    }
    if (paramString.equals("contact_info_googlecontact_setting_view"))
    {
      z.d("!56@/B4Tb64lLpLSOpQlr7qYXWKN8PEE0/bHHwfP+4nd0qxolvaaysbDFQ==", "contact_info_googlecontact_setting_view");
      Intent localIntent1 = new Intent(this.mContext, BindGoogleContactIntroUI.class);
      localIntent1.putExtra("enter_scene", 2);
      this.mContext.startActivity(localIntent1);
      return true;
    }
    if (paramString.equals("contact_info_googlecontact_install"))
    {
      z.d("!56@/B4Tb64lLpLSOpQlr7qYXWKN8PEE0/bHHwfP+4nd0qxolvaaysbDFQ==", "contact_info_googlecontact_install");
      b(this.mContext, true);
      return true;
    }
    if (paramString.equals("contact_info_googlecontact_uninstall"))
    {
      z.d("!56@/B4Tb64lLpLSOpQlr7qYXWKN8PEE0/bHHwfP+4nd0qxolvaaysbDFQ==", "contact_info_googlecontact_uninstall");
      com.tencent.mm.ui.base.e.a(this.mContext, this.mContext.getString(n.cgz), "", this.mContext.getString(n.bsM), this.mContext.getString(n.bsK), new al(this), null);
      return true;
    }
    z.e("!56@/B4Tb64lLpLSOpQlr7qYXWKN8PEE0/bHHwfP+4nd0qxolvaaysbDFQ==", "handleEvent : unExpected key = " + paramString);
    return false;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    z.i("!56@/B4Tb64lLpLSOpQlr7qYXWKN8PEE0/bHHwfP+4nd0qxolvaaysbDFQ==", "requestCode:%d, resultCode:%d", arrayOfObject);
    if (paramInt2 == -1)
      if (paramInt1 == 1005)
        this.jia = paramIntent.getBooleanExtra("gpservices", false);
    while (paramInt1 != 1005)
      return;
    this.jia = paramIntent.getBooleanExtra("gpservices", false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ak
 * JD-Core Version:    0.6.2
 */