package com.tencent.mm.ui.contact.profile;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.a.k;
import com.tencent.mm.am.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.ax;
import com.tencent.mm.modelfriend.ay;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.chatting.oj;
import java.io.ByteArrayOutputStream;
import java.util.List;

public class ContactSocialInfoUI extends MMPreference
{
  private com.tencent.mm.ui.base.preference.o eom;
  private com.tencent.mm.storage.i fDi;
  private com.tencent.mm.modelfriend.i jCU;
  private String jCV;
  private String jCW;
  private String jCX;
  private String jCY;
  private String jCZ;
  private String jDa;
  private String jDb;
  private String jDc;
  private long jDd;
  private String user;

  private void dial(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.DIAL");
    localIntent.setFlags(268435456);
    localIntent.setData(Uri.parse("tel:" + paramString));
    startActivity(localIntent);
  }

  private void g(String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((!ap.jb(paramString2)) && (!ap.jb(paramString1)))
    {
      KeyValuePreference localKeyValuePreference = (KeyValuePreference)this.eom.BU(paramString1);
      if (localKeyValuePreference != null)
      {
        if (paramBoolean)
          localKeyValuePreference.pZ(getResources().getColor(com.tencent.mm.f.Oo));
        localKeyValuePreference.setSummary(paramString2);
        localKeyValuePreference.fb(false);
      }
      return;
    }
    this.eom.BV(paramString1);
  }

  private boolean s(String paramString, Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
      return aa.a(paramString, aPI(), localByteArrayOutputStream.toByteArray());
    }
    return false;
  }

  protected final void DP()
  {
    oP(n.cDb);
    a(new e(this));
    this.eom = aTL();
    String str1 = getIntent().getStringExtra("Contact_Mobile_MD5");
    String str2 = getIntent().getStringExtra("Contact_full_Mobile_MD5");
    label144: int j;
    if ((ap.jb(str1)) && (ap.jb(str2)))
      if (ap.jb(this.fDi.getUsername()))
      {
        this.jCU = az.wZ().gl(this.user);
        if ((this.jCU != null) && (this.jCU.vu() != null) && (this.jCU.vu().length() > 0))
          break label653;
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXR+gVSI1ZPdl2KTBA9Tr56o=", "error : this is not the mobile contact, MD5 = " + this.jCV);
        g("contact_info_social_mobile", this.jCW, true);
        int i = ap.a((Integer)bg.qW().oQ().get(9));
        this.jDd = getIntent().getLongExtra("Contact_Uin", 0L);
        this.jCX = getIntent().getStringExtra("Contact_QQNick");
        if ((this.jDd != 0L) && (i != 0))
        {
          if ((this.jCX == null) || (this.jCX.length() == 0))
          {
            long l = this.jDd;
            ax localax = az.xe().K(l);
            if (localax == null)
              localax = null;
            if (localax != null)
              this.jCX = localax.getDisplayName();
          }
          this.jCY = ap.ja(this.jCX);
          this.jCY = (this.jCY + " " + new k(this.jDd).longValue());
        }
        g("contact_info_social_qq", this.jCY, true);
        String str3 = com.tencent.mm.f.e.or().getValue("LinkedinPluginClose");
        if ((!ap.jb(str3)) && (Integer.valueOf(str3).intValue() != 0))
          break label711;
        j = 1;
        label373: if ((j == 0) || (ap.jb(this.fDi.jE())))
          break label717;
      }
    label653: label711: label717: for (this.jCZ = this.fDi.jF(); ; this.jCZ = "")
    {
      g("contact_info_social_linkedin", this.jCZ, true);
      g("contact_info_social_facebook", this.jDa, false);
      this.jDc = ap.Y(getIntent().getStringExtra("verify_gmail"), "");
      this.jDb = ap.Y(getIntent().getStringExtra("profileName"), ch.xE(this.jDc));
      if ((ap.jb(this.jDc)) || (ap.jb(this.jDb)))
        break label727;
      g("contact_info_social_googlecontacts", this.jDb + '\n' + this.jDc, false);
      return;
      this.jCU = az.wZ().gl(this.fDi.getUsername());
      break;
      if (((str1 == null) || (str1.length() <= 0)) && ((str2 == null) || (str2.length() <= 0)))
        break;
      this.jCU = az.wZ().gn(str1);
      if ((this.jCU != null) && (this.jCU.vu() != null) && (this.jCU.vu().length() > 0))
        break;
      this.jCU = az.wZ().gn(str2);
      if ((this.jCU == null) || (this.jCU.vu() == null))
        break;
      this.jCU.vu().length();
      break;
      this.jCW = (ap.ja(this.jCU.vw()) + " " + ap.ja(this.jCU.vC()).replace(" ", ""));
      break label144;
      j = 0;
      break label373;
    }
    label727: g("contact_info_social_googlecontacts", "", false);
  }

  public final int DZ()
  {
    return q.cEY;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.o paramo, Preference paramPreference)
  {
    String str1 = paramPreference.getKey();
    z.i("!44@/B4Tb64lLpLSOpQlr7qYXR+gVSI1ZPdl2KTBA9Tr56o=", str1 + " item has been clicked!");
    if (str1.equals("contact_info_social_mobile"))
      if ((this.jCU != null) && (this.fDi != null));
    do
    {
      int i;
      do
      {
        do
        {
          return false;
          if (bg.qW().oT().yo(this.jCU.getUsername()))
          {
            if ((this.jCU != null) && (!ap.jb(this.jCU.vJ())));
            for (String[] arrayOfString2 = getResources().getStringArray(com.tencent.mm.c.Nt); ; arrayOfString2 = getResources().getStringArray(com.tencent.mm.c.Nu))
            {
              if (oj.aWB())
              {
                List localList = ap.b(arrayOfString2);
                localList.add(getResources().getString(n.bzT));
                arrayOfString2 = (String[])localList.toArray(new String[localList.size()]);
              }
              com.tencent.mm.ui.base.e.b(this, null, arrayOfString2, null, new f(this, arrayOfString2));
              return false;
            }
          }
        }
        while ((this.jCW == null) || (this.jCW.length() == 0));
        i = 1 + this.jCW.lastIndexOf(' ');
      }
      while (i <= 0);
      dial(this.jCW.substring(i));
      return false;
      if (str1.equals("contact_info_social_qq"))
      {
        String[] arrayOfString1 = new String[2];
        arrayOfString1[0] = getResources().getString(n.bCq);
        arrayOfString1[1] = getResources().getString(n.bCr);
        com.tencent.mm.ui.base.e.b(this, null, arrayOfString1, null, new h(this));
        return false;
      }
      if (str1.equals("contact_info_social_linkedin"))
      {
        String str2 = this.fDi.jG();
        if (ap.jb(str2))
        {
          z.e("!44@/B4Tb64lLpLSOpQlr7qYXR+gVSI1ZPdl2KTBA9Tr56o=", "this liurl is null!");
          return false;
        }
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", str2);
        localIntent.putExtra("geta8key_username", x.pG());
        a.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
        return false;
      }
    }
    while (str1.equals("contact_info_social_facebook"));
    str1.equals("contact_info_social_googlecontacts");
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.user = ap.ja(getIntent().getStringExtra("Contact_User"));
    this.fDi = bg.qW().oT().ys(this.user);
    DP();
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ContactSocialInfoUI
 * JD-Core Version:    0.6.2
 */