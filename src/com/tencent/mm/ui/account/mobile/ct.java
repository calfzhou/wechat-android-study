package com.tencent.mm.ui.account.mobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.a.c;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cq;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.plugin.accountsync.a.f;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.RegSetInfoUI;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.bindmobile.FindMContactAlertUI;
import com.tencent.mm.ui.bindmobile.FindMContactIntroUI;
import java.io.File;
import java.util.Map;

public final class ct
  implements com.tencent.mm.o.m, ed
{
  private String fAX;
  private a iOY = null;
  private MobileVerifyUI iUO;

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!44@/B4Tb64lLpKNhhU94SG29uszzGqinD/vUtNV6SLJGOM=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.iUO.dWT != null)
    {
      this.iUO.dWT.dismiss();
      this.iUO.dWT = null;
    }
    if (paramx.getType() == 255)
    {
      bg.qX().b(255, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        this.iUO.aRf();
    }
    int n;
    do
    {
      do
      {
        do
        {
          return;
          if ((paramx.getType() != 380) || (this.iOY == null))
            break;
          bg.qX().b(380, this);
          this.iOY.a(this.iUO, paramInt1, paramInt2, paramString, paramx);
        }
        while ((paramInt1 != 0) || (paramInt2 != 0));
        bg.qX().a(255, this);
        ad localad = new ad(1);
        bg.qX().d(localad);
        MobileVerifyUI localMobileVerifyUI5 = this.iUO;
        MobileVerifyUI localMobileVerifyUI6 = this.iUO;
        this.iUO.getString(n.buo);
        localMobileVerifyUI5.dWT = e.a(localMobileVerifyUI6, this.iUO.getString(n.cfP), true, new dg(this, localad));
        return;
        if (paramx.getType() != 145)
          break;
        bg.qX().b(145, this);
        n = ((ai)paramx).sg();
      }
      while (n != 15);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break;
    }
    while (n != 15);
    if (this.iUO.iVk.booleanValue())
    {
      String str14 = ((ai)paramx).wm();
      bg.qX().a(126, this);
      ae localae = new ae("", this.iUO.iUC, this.iUO.dkB, 0, "", this.iUO.cTZ, str14, this.iUO.dCP, "", "", "", true, this.iUO.iVj.booleanValue());
      bg.qX().d(localae);
      MobileVerifyUI localMobileVerifyUI3 = this.iUO;
      MobileVerifyUI localMobileVerifyUI4 = this.iUO;
      this.iUO.getString(n.buo);
      localMobileVerifyUI3.dWT = e.a(localMobileVerifyUI4, this.iUO.getString(n.bZa), true, new db(this, localae));
      return;
    }
    Intent localIntent5 = new Intent();
    localIntent5.putExtra("regsetinfo_ticket", ((ai)paramx).wm());
    localIntent5.putExtra("regsetinfo_user", this.iUO.cTZ);
    localIntent5.putExtra("regsetinfo_ismobile", 1);
    localIntent5.putExtra("regsetinfo_NextControl", ((ai)paramx).wo());
    localIntent5.setClass(this.iUO, RegSetInfoUI.class);
    this.iUO.startActivity(localIntent5);
    f.eU(com.tencent.mm.plugin.accountsync.a.i.dWA);
    b.jE("R200_900_phone");
    cq.rO();
    b.b(false, bg.qS() + "," + getClass().getName() + "," + "RE200_300" + "," + bg.eg("RE200_300") + ",2");
    return;
    if (paramInt2 == -35)
    {
      com.tencent.mm.d.a locala2 = com.tencent.mm.d.a.ct(paramString);
      if (locala2 != null)
      {
        locala2.a(this.iUO, new dh(this, paramx), new dj(this));
        return;
      }
      e.a(this.iUO, this.iUO.getString(n.bwb), null, new dk(this, paramx), new dm(this));
      return;
    }
    if (paramInt2 == -212)
    {
      Intent localIntent4 = new Intent(this.iUO, MobileLoginOrForceReg.class);
      localIntent4.putExtra("ticket", ((ai)paramx).wm());
      localIntent4.putExtra("moble", this.iUO.cTZ);
      localIntent4.putExtra("next_controll", ((ai)paramx).wo());
      localIntent4.putExtra("username", ((ai)paramx).getUsername());
      localIntent4.putExtra("password", ((ai)paramx).wl());
      localIntent4.putExtra("nickname", ((ai)paramx).wv());
      localIntent4.putExtra("avatar_url", ((ai)paramx).wu());
      if (this.iUO.iVk.booleanValue())
      {
        localIntent4.putExtra("kintent_nickname", this.iUO.dkB);
        localIntent4.putExtra("kintent_password", this.iUO.iUC);
        localIntent4.putExtra("kintent_hasavatar", this.iUO.iVj);
      }
      this.iUO.startActivity(localIntent4);
      b.jE("R200_600");
      cq.rO();
      b.b(false, bg.qS() + "," + getClass().getName() + "," + "RE200_300" + "," + bg.eg("RE200_300") + ",2");
      return;
    }
    String str1;
    Boolean localBoolean;
    String str2;
    String str3;
    int j;
    String str4;
    int k;
    String str5;
    boolean bool1;
    String str10;
    String str12;
    String str6;
    String str7;
    if (paramInt2 == -51)
    {
      com.tencent.mm.d.a locala1 = com.tencent.mm.d.a.ct(paramString);
      if (locala1 != null)
      {
        locala1.a(this.iUO, null, null);
        return;
      }
      e.b(this.iUO, n.bwQ, n.ajf);
      return;
      if ((paramx.getType() == 126) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        str1 = this.iUO.cTZ;
        localBoolean = this.iUO.iVj;
        str2 = this.iUO.iUC;
        str3 = this.iUO.dkB;
        j = ((ae)paramx).ws();
        str4 = ((ae)paramx).zB();
        k = ((ae)paramx).zC();
        str5 = ((ae)paramx).zD();
        Map localMap = com.tencent.mm.sdk.platformtools.x.bB(str5, "wording");
        bool1 = false;
        if (localMap == null)
          break label2093;
        str10 = (String)localMap.get(".wording.switch");
        if (ch.jb(str10))
        {
          bool1 = true;
          if (!bool1)
            break label2093;
          String str11 = (String)localMap.get(".wording.title");
          boolean bool2 = ch.jb(str11);
          str12 = null;
          if (!bool2)
            str12 = str11;
          String str13 = (String)localMap.get(".wording.desc");
          if (ch.jb(str13))
            break label2083;
          str6 = str13;
          str7 = str12;
        }
      }
    }
    while (true)
    {
      z.i("!44@/B4Tb64lLpKNhhU94SG29uszzGqinD/vUtNV6SLJGOM=", "hasSetAvatar , %s", new Object[] { localBoolean });
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(j);
      z.i("!44@/B4Tb64lLpKNhhU94SG29uszzGqinD/vUtNV6SLJGOM=", "styleId , %s", arrayOfObject2);
      z.i("!44@/B4Tb64lLpKNhhU94SG29uszzGqinD/vUtNV6SLJGOM=", "nextStep , %s", new Object[] { str4 });
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(k);
      z.i("!44@/B4Tb64lLpKNhhU94SG29uszzGqinD/vUtNV6SLJGOM=", "nextStyle , %s", arrayOfObject3);
      z.i("!44@/B4Tb64lLpKNhhU94SG29uszzGqinD/vUtNV6SLJGOM=", "mShowStyleContactUploadWordings , %s", new Object[] { str5 });
      bg.rf();
      bg.S(true);
      if (localBoolean.booleanValue())
      {
        String str8 = h.dOS + "temp.avatar";
        String str9 = h.dOS + "temp.avatar.hd";
        new File(str8).renameTo(new File(str9));
        c.deleteFile(str8);
        com.tencent.mm.sdk.platformtools.i.a(str9, 96, 96, Bitmap.CompressFormat.JPEG, 90, str8, true);
        q localq = new q(this.iUO, h.dOS + "temp.avatar");
        localq.a(new cv(this, paramx, str1, str4, bool1, str7, str6, k), new cw(this, paramx, str1, str4, bool1, str7, str6, k));
      }
      while (true)
        if (paramInt2 == -6)
        {
          if (this.iUO.iMR == null)
          {
            this.iUO.iMR = com.tencent.mm.ui.applet.m.a(this.iUO, n.bZc, false, ((ae)paramx).wB(), ((ae)paramx).wC(), "", new cx(this, str2, str3, paramx, localBoolean), null, new cz(this), new da(this, str2, str3, paramx, localBoolean));
            return;
            int m = ch.xy(str10);
            if (m == 0)
            {
              bool1 = false;
              break;
            }
            bool1 = false;
            if (m != 1)
              break;
            bool1 = true;
            break;
            this.fAX = ((ae)paramx).zA();
            bf.dkH.y("login_user_name", str1);
            if ((str4 != null) && (str4.contains("0")))
            {
              b.jE("R300_100_phone");
              Intent localIntent2;
              if (!bool1)
                localIntent2 = new Intent(this.iUO, FindMContactIntroUI.class);
              while (true)
              {
                localIntent2.addFlags(67108864);
                localIntent2.putExtra("regsetinfo_ticket", this.fAX);
                localIntent2.putExtra("regsetinfo_NextStep", str4);
                localIntent2.putExtra("regsetinfo_NextStyle", k);
                Intent localIntent3 = com.tencent.mm.plugin.a.a.dWo.k(this.iUO);
                localIntent3.addFlags(67108864);
                localIntent3.putExtra("LauncherUI.enter_from_reg", true);
                MMWizardActivity.b(this.iUO, localIntent2, localIntent3);
                this.iUO.finish();
                break;
                localIntent2 = new Intent(this.iUO, FindMContactAlertUI.class);
                localIntent2.putExtra("alert_title", str7);
                localIntent2.putExtra("alert_message", str6);
              }
            }
            Intent localIntent1 = com.tencent.mm.plugin.a.a.dWo.k(this.iUO);
            localIntent1.addFlags(67108864);
            localIntent1.putExtra("LauncherUI.enter_from_reg", true);
            this.iUO.startActivity(localIntent1);
            b.jF(bg.qS() + "," + this.iUO.getClass().getName() + ",R200_900_phone," + bg.eg("R200_900_phone") + ",4");
            this.iUO.finish();
            continue;
          }
          this.iUO.iMR.b(false, ((ae)paramx).wB(), ((ae)paramx).wC(), "");
          return;
        }
      if ((this.iUO.j(paramInt1, paramInt2, paramString)) || ((paramInt1 == 0) && (paramInt2 == 0)))
        break;
      MobileVerifyUI localMobileVerifyUI1 = this.iUO;
      MobileVerifyUI localMobileVerifyUI2 = this.iUO;
      int i = n.bwP;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      arrayOfObject1[1] = Integer.valueOf(paramInt2);
      Toast.makeText(localMobileVerifyUI1, localMobileVerifyUI2.getString(i, arrayOfObject1), 0).show();
      return;
      label2083: str7 = str12;
      str6 = null;
      continue;
      label2093: str6 = null;
      str7 = null;
    }
  }

  public final void a(MobileVerifyUI paramMobileVerifyUI)
  {
    this.iUO = paramMobileVerifyUI;
  }

  public final boolean ph(int paramInt)
  {
    switch (dc.iUR[(paramInt - 1)])
    {
    default:
      return false;
    case 1:
      e.a(this.iUO, this.iUO.getString(n.bSP), "", this.iUO.getString(n.bSQ), this.iUO.getString(n.bSR), new dd(this), new de(this));
      return true;
    case 2:
      bg.qX().a(145, this);
      ai localai3 = new ai(this.iUO.cTZ, 15, this.iUO.iTQ.getText().toString().trim(), 0, "");
      bg.qX().d(localai3);
      MobileVerifyUI localMobileVerifyUI3 = this.iUO;
      MobileVerifyUI localMobileVerifyUI4 = this.iUO;
      this.iUO.getString(n.buo);
      localMobileVerifyUI3.dWT = e.a(localMobileVerifyUI4, this.iUO.getString(n.bwO), true, new df(this, localai3));
      return false;
    case 3:
      b.jF(bg.qS() + "," + getClass().getName() + ",R200_400," + bg.eg("R200_400") + ",1");
      cq.rO();
      b.jD("RE200_250");
      bg.qX().a(145, this);
      ai localai2 = new ai(this.iUO.cTZ, 14, "", 0, "");
      bg.qX().d(localai2);
      f.eU(com.tencent.mm.plugin.accountsync.a.i.dWz);
      return false;
    case 4:
    }
    b.jF(bg.qS() + "," + getClass().getName() + ",R200_350_auto," + bg.eg("R200_350_auto") + ",1");
    bg.qX().a(145, this);
    ai localai1 = new ai(this.iUO.cTZ, 15, this.iUO.iTQ.getText().toString().trim(), 0, "");
    bg.qX().d(localai1);
    MobileVerifyUI localMobileVerifyUI1 = this.iUO;
    MobileVerifyUI localMobileVerifyUI2 = this.iUO;
    this.iUO.getString(n.buo);
    localMobileVerifyUI1.dWT = e.a(localMobileVerifyUI2, this.iUO.getString(n.bwO), true, new cu(this, localai1));
    return false;
  }

  public final void start()
  {
    cq.rO();
    b.b(true, bg.qS() + "," + getClass().getName() + ",RE200_300," + bg.eg("RE200_300") + ",1");
    b.jD("RE200_300");
  }

  public final void stop()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.ct
 * JD-Core Version:    0.6.2
 */