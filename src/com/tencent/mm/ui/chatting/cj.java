package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.f.e;
import com.tencent.mm.h;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ac;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.pluginsdk.ui.chat.bf;
import com.tencent.mm.pluginsdk.ui.chat.bg;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ar;

public abstract class cj
{
  protected final int fjl;
  protected boolean hMJ;
  public boolean iWI;

  public cj(int paramInt)
  {
    this.fjl = paramInt;
  }

  protected static boolean Cd(String paramString)
  {
    return ((!y.du(paramString)) && (!y.dK(paramString)) && (!y.dj(paramString)) && (!y.dQ(paramString))) || (y.dc(paramString));
  }

  protected static void a(int paramInt, ck paramck, ar paramar, String paramString, boolean paramBoolean, fu paramfu)
  {
    int i;
    if (paramar.jK() == 1)
    {
      paramck.jmh.setTag(new ms(paramar, paramBoolean, paramInt, paramString, 5, (byte)0));
      paramck.jmh.setOnClickListener(paramfu);
      switch (paramar.getStatus())
      {
      default:
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKwUcOR+EdWcpgJkyl6H9WI", "getMsgStateResId: not found this state");
        i = -1;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
    }
    while (i != -1)
    {
      paramck.jmh.setImageResource(i);
      paramck.jmh.setVisibility(0);
      if (paramck.fIh != null)
        paramck.fIh.setVisibility(8);
      return;
      i = -1;
      continue;
      i = h.Xa;
    }
    paramck.jmh.setVisibility(8);
  }

  public static void a(ar paramar, ad paramad)
  {
    if (!paramad.aJo())
      com.tencent.mm.pluginsdk.g.axR().c(paramar.kt(), com.tencent.mm.storage.z.yW(paramar.getContent()).aIO(), paramar.kl());
  }

  protected static void a(ck paramck, CharSequence paramCharSequence)
  {
    if ((paramck == null) || (paramck.joA == null))
      return;
    if (paramCharSequence == null)
    {
      paramck.joA.setVisibility(8);
      return;
    }
    paramck.joA.setText(paramCharSequence);
    paramck.joA.setVisibility(0);
  }

  protected static void a(hd paramhd, View paramView, ar paramar, com.tencent.mm.ai.b paramb, String paramString)
  {
    if (!l.uW(paramb.appId))
      return;
    if (paramhd.jom);
    for (int i = 2; ; i = 1)
    {
      bf localbf = new bf();
      localbf.appId = paramb.appId;
      localbf.dkc = "message";
      localbf.pkgName = paramString;
      localbf.cMU = b(paramhd, paramar);
      localbf.hEq = paramb.type;
      localbf.cCn = i;
      localbf.hEr = paramb.mediaTagName;
      a(paramhd, paramView, localbf);
      return;
    }
  }

  protected static void a(hd paramhd, View paramView, Object paramObject)
  {
    paramView.setTag(paramObject);
    paramView.setOnClickListener(paramhd.joh.jqi);
  }

  protected static void a(hd paramhd, View paramView, String paramString)
  {
    if (!l.uW(paramString))
      return;
    bg localbg = new bg();
    localbg.appId = paramString;
    localbg.dkc = "message";
    a(paramhd, paramView, localbg);
  }

  private static void a(hd paramhd, TextView paramTextView, Bitmap paramBitmap)
  {
    BitmapDrawable localBitmapDrawable = new BitmapDrawable(paramBitmap);
    int i = (int)paramhd.getResources().getDimension(com.tencent.mm.g.Pz);
    localBitmapDrawable.setBounds(0, 0, i, i);
    paramTextView.setCompoundDrawables(localBitmapDrawable, null, null, null);
  }

  protected static void a(hd paramhd, TextView paramTextView, String paramString)
  {
    Bitmap localBitmap = l.b(paramString, 2, com.tencent.mm.aq.a.getDensity(paramhd.agh()));
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      a(paramhd, paramTextView, localBitmap);
      return;
    }
    a(paramhd, paramTextView, BitmapFactory.decodeResource(paramhd.getResources(), h.Xw));
  }

  protected static void a(hd paramhd, com.tencent.mm.ai.b paramb, ar paramar)
  {
    ac localac = com.tencent.mm.pluginsdk.g.axX();
    if (localac != null)
      if (!paramhd.jom)
        break label57;
    label57: for (int i = 2; ; i = 1)
    {
      String str = b(paramhd, paramar);
      paramhd.agh();
      localac.a(paramb.appId, str, paramb.type, i, paramb.mediaTagName, paramar.kl());
      return;
    }
  }

  protected static void a(hd paramhd, com.tencent.mm.ai.b paramb, ar paramar, k paramk)
  {
    ac localac = com.tencent.mm.pluginsdk.g.axX();
    int i;
    String str1;
    Activity localActivity;
    String str2;
    if (localac != null)
    {
      if (!paramhd.jom)
        break label72;
      i = 2;
      str1 = b(paramhd, paramar);
      localActivity = paramhd.agh();
      str2 = paramb.appId;
      if (paramk != null)
        break label78;
    }
    label72: label78: for (String str3 = null; ; str3 = paramk.field_packageName)
    {
      localac.a(localActivity, str2, str3, str1, paramb.type, paramb.mediaTagName, i);
      return;
      i = 1;
      break;
    }
  }

  protected static void a(hd paramhd, com.tencent.mm.ai.b paramb, String paramString, k paramk)
  {
    ac localac = com.tencent.mm.pluginsdk.g.axX();
    int i;
    int j;
    if (localac != null)
    {
      if (!paramhd.jom)
        break label98;
      i = 2;
      if ((paramk == null) || (!u.d(paramhd.agh(), paramk.field_packageName)))
        break label104;
      j = 3;
      label41: if (paramb.type != 2)
        break label120;
    }
    label98: label104: label120: for (int k = 4; ; k = j)
    {
      Activity localActivity = paramhd.agh();
      String str1 = paramb.appId;
      if (paramk == null);
      for (String str2 = null; ; str2 = paramk.field_packageName)
      {
        localac.a(localActivity, str1, str2, paramString, paramb.type, i, k, paramb.mediaTagName);
        return;
        i = 1;
        break;
        j = 6;
        break label41;
      }
    }
  }

  protected static void a(hd paramhd, String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean, long paramLong)
  {
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString2 == null) || (paramString2.length() == 0)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKwUcOR+EdWcpgJkyl6H9WI", "url, lowUrl both are empty");
      return;
    }
    if (bc.bD(paramhd.agh()))
      if ((paramString2 != null) && (paramString2.length() > 0))
        break label154;
    while (true)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("msg_id", paramLong);
      localIntent.putExtra("rawUrl", paramString1);
      localIntent.putExtra("version_name", paramString3);
      localIntent.putExtra("version_code", paramInt);
      localIntent.putExtra("usePlugin", paramBoolean);
      localIntent.putExtra("geta8key_username", paramhd.aUL());
      com.tencent.mm.am.a.b(paramhd.agh(), "webview", ".ui.tools.WebViewUI", localIntent);
      return;
      if ((paramString1 == null) || (paramString1.length() <= 0))
        label154: paramString1 = paramString2;
    }
  }

  protected static boolean a(hd paramhd, k paramk)
  {
    int i = 2;
    ac localac = com.tencent.mm.pluginsdk.g.axX();
    if ((!ch.jb(paramk.field_appId)) && (paramk.field_appId.equals("wxab9305c2bdfa88bd")))
      if ((localac != null) && (!localac.b(paramk)))
        localac.b(paramhd.agh(), paramk);
    boolean bool;
    do
    {
      return true;
      return false;
      if ((l.c(paramhd.agh(), paramk)) || (localac == null))
        break label212;
      if (ch.jb(paramk.iG()))
        break;
      bool = u.an(paramhd.agh(), paramk.iG());
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramk.iG();
      arrayOfObject[1] = Boolean.valueOf(bool);
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKwUcOR+EdWcpgJkyl6H9WI", "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]", arrayOfObject);
    }
    while (bool);
    if (paramhd.jom);
    while (true)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("game_app_id", paramk.field_appId);
      localIntent.putExtra("game_report_from_scene", i);
      com.tencent.mm.am.a.b(paramhd.agh(), "game", ".ui.GameDetailInfoUI", localIntent);
      paramhd.agh();
      localac.j(paramk.field_appId, i, i);
      return true;
      i = 1;
    }
    label212: return false;
  }

  protected static boolean aUR()
  {
    String str = e.or().getValue("ShowRevokeMsgEntry");
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKwUcOR+EdWcpgJkyl6H9WI", "[oneliang][isRevokeMsgEnable] enable:%s", new Object[] { str });
    if (ch.jb(str))
      str = "0";
    return 1 == Integer.valueOf(str).intValue();
  }

  protected static boolean aUS()
  {
    String str = e.or().getValue("ShowSendOK");
    if (ch.jb(str))
      str = "0";
    return 1 == Integer.valueOf(str).intValue();
  }

  protected static PackageInfo ai(Context paramContext, String paramString)
  {
    String str = uf(paramString);
    if (str == null)
      return null;
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(str, 0);
      return localPackageInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }

  protected static boolean ay(Context paramContext, String paramString)
  {
    if (!u.d(paramContext, uf(paramString)));
    k localk;
    do
    {
      return false;
      localk = l.F(paramString, false);
    }
    while ((localk == null) || ((localk.field_status != 1) && (localk.field_status != 0) && (localk.field_status != -1)));
    return true;
  }

  protected static String b(hd paramhd, ar paramar)
  {
    String str = paramhd.aUL();
    if (y.dc(str))
      str = bw.em(paramar.getContent());
    return str;
  }

  protected static void b(ck paramck, hd paramhd, String paramString)
  {
    if (paramck.egy == null)
      return;
    if (y.dP(paramString))
    {
      paramck.egy.setVisibility(8);
      return;
    }
    h(paramck.egy, paramString);
    paramck.egy.setVisibility(0);
    paramck.egy.setTag(new ms(paramString));
    paramck.egy.setOnClickListener(paramhd.joh.jqc);
    paramck.egy.setOnLongClickListener(paramhd.joh.jqe);
    paramck.egy.setContentDescription(y.dh(paramString) + paramhd.agh().getString(n.buJ));
  }

  protected static void b(hd paramhd, View paramView, Object paramObject)
  {
    paramView.setTag(paramObject);
    paramView.setOnClickListener(paramhd.joh.jqc);
  }

  protected static void c(hd paramhd, View paramView, Object paramObject)
  {
    paramView.setTag(paramObject);
    paramView.setOnClickListener(paramhd.joh.jqm);
  }

  protected static boolean cR(long paramLong)
  {
    return (fn.jqC > 0L) && (fn.jqC == paramLong);
  }

  public static void h(ImageView paramImageView, String paramString)
  {
    if (ch.jb(paramString))
    {
      paramImageView.setImageResource(h.Ut);
      return;
    }
    com.tencent.mm.pluginsdk.ui.c.a(paramImageView, paramString);
  }

  private static String uf(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0));
    k localk;
    do
    {
      return null;
      localk = l.F(paramString, true);
    }
    while (localk == null);
    return localk.field_packageName;
  }

  public abstract View a(LayoutInflater paramLayoutInflater, View paramView);

  protected String a(hd paramhd, ar paramar)
  {
    String str1 = paramhd.joh.cEh;
    if (!a(paramhd))
      return str1;
    String str2 = bw.em(paramar.getContent());
    if ((str1 != null) && (str2 != null) && (str2.length() > 0));
    while (true)
    {
      return str2;
      str2 = str1;
    }
  }

  public abstract void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString);

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, boolean paramBoolean)
  {
    this.hMJ = paramBoolean;
    boolean bool = aUQ();
    String str = null;
    if (bool)
    {
      str = a(paramhd, paramar);
      a(paramck, paramhd, str);
      b(paramck, paramhd, str);
    }
    a(paramck, paramInt, paramhd, paramar, str);
  }

  protected final void a(ck paramck, hd paramhd, String paramString)
  {
    if ((paramString == null) || (paramck.joA == null))
      return;
    boolean bool1 = a(paramhd);
    SpannableString localSpannableString = null;
    if (bool1)
    {
      boolean bool2 = paramhd.jsq;
      localSpannableString = null;
      if (bool2)
        localSpannableString = com.tencent.mm.ar.b.c(paramhd.agh(), paramhd.dh(paramString), (int)paramck.joA.getTextSize());
    }
    a(paramck, localSpannableString);
  }

  public abstract boolean a(ContextMenu paramContextMenu, View paramView, ar paramar);

  public abstract boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar);

  public abstract boolean a(View paramView, hd paramhd, ar paramar);

  protected boolean a(hd paramhd)
  {
    return paramhd.jom;
  }

  public final int aUP()
  {
    return this.fjl;
  }

  protected boolean aUQ()
  {
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.cj
 * JD-Core Version:    0.6.2
 */