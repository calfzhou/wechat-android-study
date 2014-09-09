package com.tencent.mm.ui.friend;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.tencent.mm.c.a.ej;
import com.tencent.mm.c.a.el;
import com.tencent.mm.c.a.em;
import com.tencent.mm.c.a.en;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;

public final class ct extends ContentObserver
  implements m
{
  private String cTZ;
  private ContentResolver contentResolver;
  private boolean dpm = false;
  private boolean hcW = false;
  private boolean hcX = false;
  private String[] hda;
  private ProgressBar iQE;
  private aa iQF = null;
  private cm iQG = new cu(this);
  private ai iRj;
  private String iVh;
  private int jJA;
  private final cw jJr;
  private ak jJs;
  private ak jJt;
  private ai jJu;
  private String jJv;
  private boolean jJw = false;
  private View jJx;
  private String jJy = null;
  private boolean jJz = true;
  private Context mContext;
  private int progress = 0;

  public ct(int paramInt, Context paramContext, cw paramcw)
  {
    super(cm.fetchFreeHandler());
    this.jJA = paramInt;
    this.jJw = false;
    this.mContext = paramContext;
    this.hda = this.mContext.getResources().getStringArray(com.tencent.mm.c.ND);
    this.jJx = ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(k.bkC, null);
    this.iQE = ((ProgressBar)this.jJx.findViewById(i.aIB));
    this.jJr = paramcw;
  }

  private boolean F(int paramInt, String paramString)
  {
    int i = 1;
    switch (paramInt)
    {
    default:
    case -57:
    case -1:
    case -34:
    case -43:
    case -214:
    case -41:
    case -35:
    case -36:
    case -59:
    case -4:
      do
      {
        i = 0;
        com.tencent.mm.d.a locala;
        do
        {
          return i;
          Toast.makeText(this.mContext, n.btk, 0).show();
          return i;
          Toast.makeText(this.mContext, n.bwp, 0).show();
          return i;
          z.e("!44@/B4Tb64lLpLG44Zw+vFLqfFvvjnlzlCK2Wk4qIHRlkI=", "dealErrCodeBindMobile");
          this.dpm = i;
          if ((cx.jJD == this.jJA) || (this.jJA == cx.jJE))
          {
            bg.qW().oQ().set(4097, "");
            bg.qW().oQ().set(6, this.cTZ);
            this.mContext.getApplicationContext();
            com.tencent.mm.modelfriend.c.vp();
          }
          pf(i);
          Toast.makeText(this.mContext, n.bwm, 0).show();
          return i;
          locala = com.tencent.mm.d.a.ct(paramString);
        }
        while (locala == null);
        locala.a(this.mContext, null, null);
        return i;
        Toast.makeText(this.mContext, n.bwo, 0).show();
        return i;
        if (this.jJA == cx.jJC)
        {
          pf(3);
          return i;
        }
        com.tencent.mm.ui.base.e.a(this.mContext, n.bwn, n.ajf, new cv(this));
        return i;
        Toast.makeText(this.mContext, n.bwr, 0).show();
        return i;
        com.tencent.mm.ui.base.e.a(this.mContext, n.bwq, n.buo, null);
        return i;
      }
      while (!this.jJw);
      pf(6);
      return i;
    case -74:
    }
    com.tencent.mm.ui.base.e.a(this.mContext, n.bwl, n.buo, null);
    return i;
  }

  private String aYI()
  {
    String str1 = "( ";
    int i = 0;
    if (i < this.hda.length)
    {
      if (i == -1 + this.hda.length);
      for (str1 = str1 + " body like \"%" + this.hda[i] + "%\" ) "; ; str1 = str1 + "body like \"%" + this.hda[i] + "%\" or ")
      {
        i++;
        break;
      }
    }
    String str2 = str1 + " and date > " + (System.currentTimeMillis() - 300000L) + " ";
    z.v("!44@/B4Tb64lLpLG44Zw+vFLqfFvvjnlzlCK2Wk4qIHRlkI=", "sql where:" + str2);
    return str2;
  }

  private void e(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    switch (((ak)paramx).sg())
    {
    default:
      return;
    case 1:
    case 2:
    case 18:
    case 19:
    }
    if (((((ak)paramx).sg() == 2) || (((ak)paramx).sg() == 19)) && (this.iQF != null))
      this.iQF.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((((ak)paramx).sg() == 2) || (((ak)paramx).sg() == 19))
      {
        if (this.jJz)
        {
          this.mContext.getApplicationContext();
          com.tencent.mm.modelfriend.c.vp();
        }
        pf(1);
        return;
      }
      if ((((ak)paramx).sg() == 1) || (((ak)paramx).sg() == 18))
      {
        z.v("!44@/B4Tb64lLpLG44Zw+vFLqfFvvjnlzlCK2Wk4qIHRlkI=", "mobile:" + this.cTZ);
        return;
      }
    }
    if (F(paramInt2, paramString))
    {
      if (this.iQF != null)
        this.iQF.dismiss();
      this.dpm = true;
      return;
    }
    if (((ak)paramx).sg() == 2)
    {
      if (this.iQF != null)
        this.iQF.dismiss();
      this.dpm = true;
      pf(2);
      return;
    }
    this.dpm = true;
    if (this.iQF != null)
      this.iQF.dismiss();
    Context localContext1 = this.mContext;
    Context localContext2 = this.mContext;
    int i = n.bwP;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    Toast.makeText(localContext1, localContext2.getString(i, arrayOfObject), 0).show();
  }

  private void pf(int paramInt)
  {
    if ((this.jJA == cx.jJD) || (this.jJA == cx.jJE))
      bg.qX().a(132, this);
    while (true)
    {
      if (this.jJr != null)
        this.jJr.pf(paramInt);
      return;
      bg.qX().a(145, this);
    }
  }

  public final void Dd(String paramString)
  {
    if ((this.jJA == cx.jJD) || (this.jJA == cx.jJE))
    {
      bg.qX().a(132, this);
      this.cTZ = paramString;
      this.hcW = false;
      this.hcX = false;
      this.jJv = "";
      this.dpm = false;
      if ((this.jJA != cx.jJD) && (this.jJA != cx.jJE))
        break label200;
      int i = 1;
      if (this.jJA == cx.jJE)
        i = 18;
      this.jJt = new ak(this.cTZ, i, "", 0, "");
      bg.qX().d(this.jJt);
      if (this.iQF != null)
        break label257;
      this.iQF = com.tencent.mm.ui.base.e.a(this.mContext, false, this.mContext.getString(n.bwO), this.jJx, "", "", null, null);
    }
    while (true)
    {
      this.progress = 0;
      this.iQE.setIndeterminate(false);
      this.iQG.sendEmptyMessage(1000);
      return;
      bg.qX().a(145, this);
      break;
      label200: String str = this.cTZ;
      if (this.jJw);
      for (int j = 8; ; j = 5)
      {
        this.iRj = new ai(str, j, "", 0, "");
        bg.qX().d(this.iRj);
        break;
      }
      label257: this.iQF.show();
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpLG44Zw+vFLqfFvvjnlzlCK2Wk4qIHRlkI=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((!paramx.equals(this.jJs)) && (!paramx.equals(this.jJt)) && (!paramx.equals(this.jJu)) && (!paramx.equals(this.iRj)))
      z.i("!44@/B4Tb64lLpLG44Zw+vFLqfFvvjnlzlCK2Wk4qIHRlkI=", "onSceneEnd, doScene is not called by this class");
    int i;
    do
    {
      do
        return;
      while (this.dpm);
      if ((paramInt1 == 1) || (paramInt1 == 2))
      {
        z.d("!44@/B4Tb64lLpLG44Zw+vFLqfFvvjnlzlCK2Wk4qIHRlkI=", "error net");
        if (this.iQF != null)
          this.iQF.dismiss();
        pf(4);
        return;
      }
      if ((cx.jJD == this.jJA) && (paramx.getType() == 132))
      {
        e(paramInt1, paramInt2, paramString, paramx);
        return;
      }
      if ((cx.jJE == this.jJA) && (paramx.getType() == 132))
      {
        e(paramInt1, paramInt2, paramString, paramx);
        return;
      }
      if ((cx.jJC != this.jJA) || (paramx.getType() != 145))
        break label711;
      switch (((ai)paramx).sg())
      {
      case 7:
      default:
        return;
      case 5:
      case 6:
      case 8:
      case 9:
      }
      if (((((ai)paramx).sg() == 6) || (((ai)paramx).sg() == 9)) && (this.iQF != null))
        this.iQF.dismiss();
      i = ((ai)paramx).wk();
      if (((paramInt1 != 0) || (paramInt2 != 0)) && ((paramInt2 != -35) || (i != 1)))
        break;
      if (((ai)paramx).sg() == 6)
      {
        this.jJy = ((ai)paramx).wm();
        z.d("!44@/B4Tb64lLpLG44Zw+vFLqfFvvjnlzlCK2Wk4qIHRlkI=", "NetSceneBindOpMobileForReg ticket: " + this.jJy);
        pf(1);
        return;
      }
      if (((ai)paramx).sg() == 9)
      {
        this.jJy = ((ai)paramx).wm();
        z.d("!44@/B4Tb64lLpLG44Zw+vFLqfFvvjnlzlCK2Wk4qIHRlkI=", "NetSceneBindOpMobileForReg ticket: " + this.jJy);
        ((ai)paramx).getUsername();
        ((ai)paramx).wl();
        return;
      }
      if ((((ai)paramx).sg() != 5) && (((ai)paramx).sg() != 8))
        break;
      z.v("!44@/B4Tb64lLpLG44Zw+vFLqfFvvjnlzlCK2Wk4qIHRlkI=", "mobile:" + this.cTZ);
    }
    while ((((ai)paramx).sg() != 5) || (paramInt2 != -35) || (i != 1));
    this.jJw = true;
    pf(5);
    return;
    if ((((ai)paramx).sg() == 6) || (((ai)paramx).sg() == 9))
    {
      if (this.iQF != null)
        this.iQF.dismiss();
      this.dpm = true;
      pf(2);
      return;
    }
    if (F(paramInt2, paramString))
    {
      if (this.iQF != null)
        this.iQF.dismiss();
      this.dpm = true;
      return;
    }
    this.dpm = true;
    if (this.iQF != null)
      this.iQF.dismiss();
    Context localContext1 = this.mContext;
    Context localContext2 = this.mContext;
    int j = n.bwP;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    Toast.makeText(localContext1, localContext2.getString(j, arrayOfObject), 0).show();
    return;
    label711: Assert.assertTrue("code path should not be here!", false);
  }

  public final void fP(boolean paramBoolean)
  {
    this.jJz = paramBoolean;
  }

  public final void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    z.v("!44@/B4Tb64lLpLG44Zw+vFLqfFvvjnlzlCK2Wk4qIHRlkI=", "sms number:" + this.jJv);
    if ((this.hcW) || (this.dpm) || (this.hcX));
    Cursor localCursor1;
    int i;
    while (true)
    {
      return;
      Uri localUri = Uri.parse("content://sms/inbox");
      this.contentResolver = this.mContext.getContentResolver();
      String[] arrayOfString = { "body", "_id", "date" };
      String str1 = aYI();
      if ((str1 != null) && (!str1.equals("")))
        try
        {
          Cursor localCursor2 = this.contentResolver.query(localUri, arrayOfString, str1, null, null);
          localCursor1 = localCursor2;
          if (localCursor1 != null)
          {
            i = -1;
            long l1 = 0L;
            while (localCursor1.moveToNext())
            {
              long l2 = localCursor1.getLong(2);
              if (l2 > l1)
              {
                i = localCursor1.getPosition();
                l1 = l2;
              }
            }
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            z.e("!44@/B4Tb64lLpLG44Zw+vFLqfFvvjnlzlCK2Wk4qIHRlkI=", "get sms failed");
            localCursor1 = null;
          }
          this.iVh = null;
          if (i < 0)
            break label441;
        }
    }
    this.hcX = true;
    localCursor1.moveToPosition(i);
    String str2 = localCursor1.getString(localCursor1.getColumnIndex("body"));
    Matcher localMatcher = Pattern.compile("\\d{4,8}").matcher(str2);
    String str3;
    String str4;
    String str5;
    if (localMatcher.find())
    {
      str3 = localMatcher.group();
      this.iVh = str3;
      if (this.iQF != null)
        this.iQF.setCancelable(true);
      if ((this.jJA != cx.jJD) && (this.jJA != cx.jJE))
        break label455;
      ej localej = new ej();
      localej.cJY.context = this.mContext;
      com.tencent.mm.sdk.c.a.aGB().g(localej);
      str4 = localej.cJZ.cFd;
      em localem = new em();
      com.tencent.mm.sdk.c.a.aGB().g(localem);
      str5 = localem.cKa.cFf;
      if (this.jJA != cx.jJE)
        break label515;
    }
    label515: for (int j = 19; ; j = 2)
    {
      this.jJs = new ak(this.cTZ, j, this.iVh, "", str4, str5);
      bg.qX().d(this.jJs);
      label441: localCursor1.close();
      return;
      str3 = null;
      break;
      label455: String str6 = this.cTZ;
      if (this.jJw);
      for (int k = 9; ; k = 6)
      {
        this.jJu = new ai(str6, k, this.iVh, 0, "");
        bg.qX().d(this.jJu);
        break;
      }
    }
  }

  public final void recycle()
  {
    bg.qX().b(132, this);
    bg.qX().b(145, this);
    this.mContext = null;
    this.dpm = true;
    if (this.iQF != null)
      this.iQF.dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.ct
 * JD-Core Version:    0.6.2
 */