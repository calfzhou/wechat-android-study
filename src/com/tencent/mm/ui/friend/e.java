package com.tencent.mm.ui.friend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.g;
import com.tencent.mm.aj.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.contact.bb;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import junit.framework.Assert;

public final class e
  implements AdapterView.OnItemClickListener
{
  private Context context;
  private m jHV;

  public e(Context paramContext, m paramm)
  {
    this.context = paramContext;
    this.jHV = paramm;
  }

  public static void aB(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      z.e("!64@/B4Tb64lLpJPpbbQ0APJeVgA0WAHgHPcdO67WNFedgaK5LDYw6Z6KJq1onIS1Fk2", "dealOnClick fail, talker is null");
    f localf;
    av localav;
    do
    {
      String str1;
      do
      {
        as localas;
        do
        {
          return;
          z.d("!64@/B4Tb64lLpJPpbbQ0APJeVgA0WAHgHPcdO67WNFedgaK5LDYw6Z6KJq1onIS1Fk2", "dealOnClick, talker = " + paramString);
          l.AF().hC(paramString);
          localf = l.AE().hK(paramString);
          if (localf == null)
          {
            z.e("!64@/B4Tb64lLpJPpbbQ0APJeVgA0WAHgHPcdO67WNFedgaK5LDYw6Z6KJq1onIS1Fk2", "onItemClick, lastRecvFmsg is null, talker = " + paramString);
            return;
          }
          if (localf.field_type != 0)
            break;
          localas = bg.qW().oV().zD(localf.field_msgContent);
        }
        while ((localas == null) || (localas.aJQ().length() <= 0));
        Bundle localBundle = new Bundle();
        localBundle.putBoolean("Contact_ShowFMessageList", true);
        localBundle.putInt("Contact_Source_FMessage", localas.Ew());
        localBundle.putBoolean("Contact_AlwaysShowRemarkBtn", true);
        localBundle.putBoolean("Contact_AlwaysShowSnsPreBtn", true);
        com.tencent.mm.storage.i locali2 = bg.qW().oT().ys(localas.aJQ());
        if ((locali2 != null) && ((int)locali2.dhv > 0) && (com.tencent.mm.g.a.cv(locali2.getType())))
        {
          bb.a(paramContext, locali2, localas, true, true, localBundle, "");
          return;
        }
        if (localas.aJT() > 0L)
        {
          if ((ap.jb(localas.wU())) && (ap.jb(localas.wR())) && (!ap.jb(localas.iV())))
            localBundle.putString("Contact_QQNick", localas.iV());
          bb.a(paramContext, localas, true, true, localBundle);
          return;
        }
        if ((!ap.jb(localas.aJS())) || (!ap.jb(localas.aJV())))
        {
          com.tencent.mm.modelfriend.i locali = az.wZ().gn(localas.aJS());
          if ((locali == null) || (locali.vu() == null) || (locali.vu().length() <= 0))
          {
            locali = az.wZ().gn(localas.aJV());
            if ((locali == null) || (locali.vu() == null) || (locali.vu().length() <= 0))
            {
              if ((locali2 != null) && ((int)locali2.dhv > 0))
                bb.a(paramContext, locali2, localas, true, true, localBundle, "");
              while (true)
              {
                z.e("!64@/B4Tb64lLpJPpbbQ0APJeVgA0WAHgHPcdO67WNFedgaK5LDYw6Z6KJq1onIS1Fk2", "error : this is not the mobile contact, MD5 = " + localas.aJS() + " fullMD5:" + localas.aJV());
                return;
                bb.a(paramContext, localas, true, true, localBundle);
              }
            }
          }
          if ((locali.getUsername() == null) || (locali.getUsername().length() <= 0))
          {
            locali.setUsername(localas.aJQ());
            locali.db(128);
            if (az.wZ().a(locali.vu(), locali) == -1)
            {
              z.e("!64@/B4Tb64lLpJPpbbQ0APJeVgA0WAHgHPcdO67WNFedgaK5LDYw6Z6KJq1onIS1Fk2", "update mobile contact username failed");
              return;
            }
          }
          bb.a(paramContext, localas, true, true, localBundle);
          return;
        }
        bb.a(paramContext, localas, true, true, localBundle);
        return;
        str1 = localf.field_msgContent;
        z.w("!64@/B4Tb64lLpJPpbbQ0APJeVgA0WAHgHPcdO67WNFedgaK5LDYw6Z6KJq1onIS1Fk2", "dealClickVerifyMsgEvent : " + str1);
      }
      while ((str1 == null) || (str1.length() <= 0));
      localav = bg.qW().oV().zC(str1);
    }
    while (localav == null);
    boolean bool;
    com.tencent.mm.storage.i locali1;
    Intent localIntent;
    if (localav.aJQ().length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      locali1 = bg.qW().oT().ys(localav.aJQ());
      localIntent = new Intent(paramContext, ContactInfoUI.class);
      localIntent.putExtra("Contact_ShowUserName", false);
      localIntent.putExtra("Contact_ShowFMessageList", true);
      localIntent.putExtra("Contact_Scene", localav.Ew());
      localIntent.putExtra("Verify_ticket", localav.aKg());
      localIntent.putExtra("Contact_Source_FMessage", localav.Ew());
      localIntent.putExtra("Contact_AlwaysShowRemarkBtn", true);
      localIntent.putExtra("Contact_AlwaysShowSnsPreBtn", true);
      if ((locali1 == null) || ((int)locali1.dhv <= 0) || (!com.tencent.mm.g.a.cv(locali1.getType())))
        break label1027;
      localIntent.putExtra("Contact_User", locali1.getUsername());
      bb.c(localIntent, locali1.getUsername());
      label780: str2 = localav.getContent();
      if (ap.ja(str2).length() <= 0)
        switch (localav.Ew())
        {
        case 19:
        case 20:
        case 21:
        default:
        case 18:
        case 22:
        case 23:
        case 24:
        case 25:
        case 26:
        case 27:
        case 28:
        case 29:
        }
    }
    for (String str2 = paramContext.getString(n.bzc); ; str2 = paramContext.getString(n.bzg))
    {
      localIntent.putExtra("Contact_Content", str2);
      localIntent.putExtra("Contact_verify_Scene", localav.Ew());
      localIntent.putExtra("Contact_Uin", localav.aJT());
      localIntent.putExtra("Contact_QQNick", localav.wR());
      localIntent.putExtra("Contact_Mobile_MD5", localav.aJS());
      localIntent.putExtra("User_From_Fmessage", true);
      localIntent.putExtra("Contact_from_msgType", 37);
      if ((locali1 == null) || (!com.tencent.mm.g.a.cv(locali1.getType())))
        localIntent.putExtra("Contact_KSnsIFlag", 0);
      localIntent.putExtra("Contact_KSnsBgUrl", localav.aKi());
      localIntent.putExtra("verify_gmail", localav.aJX());
      paramContext.startActivity(localIntent);
      return;
      bool = false;
      break;
      label1027: if ((localf.field_type == 1) || (localf.field_type == 2))
        localIntent.putExtra("User_Verify", true);
      localIntent.putExtra("Contact_User", localav.aJQ());
      localIntent.putExtra("Contact_Alias", localav.iS());
      localIntent.putExtra("Contact_Nick", localav.iV());
      localIntent.putExtra("Contact_QuanPin", localav.iX());
      localIntent.putExtra("Contact_PyInitial", localav.iW());
      localIntent.putExtra("Contact_Sex", localav.jj());
      localIntent.putExtra("Contact_Signature", localav.jo());
      localIntent.putExtra("Contact_FMessageCard", true);
      localIntent.putExtra("Contact_City", localav.jq());
      localIntent.putExtra("Contact_Province", localav.jp());
      localIntent.putExtra("Contact_Mobile_MD5", localav.aJS());
      localIntent.putExtra("Contact_full_Mobile_MD5", localav.aJV());
      localIntent.putExtra("Contact_KSnsBgUrl", localav.aKi());
      break label780;
    }
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    com.tencent.mm.aj.a locala = (com.tencent.mm.aj.a)this.jHV.getItem(paramInt);
    if (locala == null)
    {
      z.e("!64@/B4Tb64lLpJPpbbQ0APJeVgA0WAHgHPcdO67WNFedgaK5LDYw6Z6KJq1onIS1Fk2", "onItemClick, item is null, pos = " + paramInt);
      return;
    }
    aB(this.context, locala.field_talker);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.e
 * JD-Core Version:    0.6.2
 */