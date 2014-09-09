package com.tencent.mm.pluginsdk.ui.simley;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.tencent.mm.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.ui.SmileyGrid;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i
{
  private final String TAG = "!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=";
  private Context dkf = ak.getContext();
  private float ezE = com.tencent.mm.aq.a.getDensity(this.dkf);
  private String hDa;
  private int hIK = this.dkf.getResources().getDimensionPixelSize(com.tencent.mm.g.Qp);
  private int hIL = this.dkf.getResources().getDimensionPixelSize(com.tencent.mm.g.Qn);
  private int hIM = this.dkf.getResources().getDimensionPixelSize(com.tencent.mm.g.Qo);
  private int hIN = com.tencent.mm.aq.a.fromDPToPix(this.dkf, SmileyGrid.hzi);
  private int hIO = com.tencent.mm.aq.a.fromDPToPix(this.dkf, 80);
  private int hIP = com.tencent.mm.aq.a.fromDPToPix(this.dkf, 48);
  private d hIQ = a.hId;
  private String hIR = "";
  private boolean hIS;
  private boolean hIT;
  private boolean hIU;
  private boolean hIV;
  private boolean hIW;
  private boolean hIX;
  private boolean hIY;
  private int hIZ;
  private com.tencent.mm.sdk.c.g hJa;
  private volatile boolean hJb = false;
  private final int hJc = 4;
  private boolean hJd = false;
  private boolean hJe = false;

  public i()
  {
    aDP();
    a.aDm();
  }

  public static boolean aDG()
  {
    if ((com.tencent.mm.k.i.Ck().cC(262147)) || (com.tencent.mm.k.i.Ck().cC(262149)));
    for (int i = 1; ; i = 0)
    {
      boolean bool = com.tencent.mm.pluginsdk.g.axR().ML();
      if ((i == 0) || (bool))
        break;
      return true;
    }
    return false;
  }

  private int[] aEo()
  {
    int[] arrayOfInt = new int[2];
    if ((this.dkf instanceof Activity))
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((Activity)this.dkf).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      arrayOfInt[0] = localDisplayMetrics.widthPixels;
      arrayOfInt[1] = localDisplayMetrics.heightPixels;
      return arrayOfInt;
    }
    Display localDisplay = ((WindowManager)this.dkf.getSystemService("window")).getDefaultDisplay();
    arrayOfInt[0] = localDisplay.getWidth();
    arrayOfInt[1] = localDisplay.getHeight();
    return arrayOfInt;
  }

  public static int al(View paramView)
  {
    int i = paramView.hashCode();
    if (i < 0)
      i &= 2147483647;
    return i;
  }

  public static boolean b(ab paramab)
  {
    return (paramab != null) && (paramab.field_packStatus == 1);
  }

  public static boolean c(ab paramab)
  {
    return (paramab != null) && (paramab.field_packStatus == 0);
  }

  public static int vP(String paramString)
  {
    if (paramString == null)
      return m.hJk;
    if (paramString.equals("TAG_DEFAULT_TAB"))
      return m.hJh;
    if (paramString.equals(String.valueOf(ab.iiH)))
      return m.hJi;
    if (paramString.equals(String.valueOf(ab.iiI)))
      return m.hJj;
    return m.hJk;
  }

  private int vQ(String paramString)
  {
    if ("TAG_DEFAULT_TAB".equals(paramString))
      return this.hIP;
    return this.hIN;
  }

  public final l a(ImageView paramImageView, ab paramab)
  {
    if (paramab == null)
      return null;
    l locall = new l();
    switch (k.hJg[(-1 + vP(paramab.field_productID))])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return locall;
      locall.resource = h.UN;
      continue;
      locall.resource = h.UJ;
      continue;
      locall.resource = h.UL;
      continue;
      if (!b(paramab))
        locall.djc = com.tencent.mm.pluginsdk.g.axR().a(paramImageView, paramab.field_productID, 5, paramab.field_packGrayIconUrl, this.hIM);
      else
        locall.djc = com.tencent.mm.pluginsdk.g.axR().a(paramImageView, paramab.field_productID, 6, "", this.hIM);
    }
  }

  public final void a(String paramString, n paramn, boolean paramBoolean)
  {
    if (this.hIQ.hIk == null)
      return;
    int i = this.hIQ.hIk.size();
    t localt1;
    if (i <= 0)
    {
      localt1 = null;
      if (localt1 != null)
        break label112;
    }
    label112: for (int j = 0; ; j = localt1.aDt() + localt1.aDw())
    {
      t localt2 = new t(paramString, j, this, paramn, paramBoolean);
      this.hIQ.hIk.add(localt2);
      z.i("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=", "add Tab: %s", new Object[] { paramString });
      return;
      localt1 = (t)this.hIQ.hIk.get(i - 1);
      break;
    }
  }

  public final void a(String paramString, n paramn, boolean paramBoolean, int paramInt)
  {
    if (this.hIQ.hIk == null)
      return;
    int i;
    if ((paramInt <= 0) || (this.hIQ.hIk.size() <= 1))
    {
      i = 0;
      if (i < 0)
        i = 0;
      t localt1 = new t(paramString, i, this, paramn, paramBoolean);
      this.hIQ.hIk.remove(paramInt);
      this.hIQ.hIk.add(paramInt, localt1);
      z.i("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=", "replace Tab: %s", new Object[] { paramString });
      return;
    }
    int j = this.hIQ.hIk.size();
    if (paramInt > j);
    while (true)
    {
      t localt2 = (t)this.hIQ.hIk.get(j - 1);
      i = localt2.aDt() + localt2.aDw();
      break;
      j = paramInt;
    }
  }

  public final Context aDF()
  {
    return this.dkf;
  }

  public final ArrayList aDJ()
  {
    ArrayList localArrayList = com.tencent.mm.pluginsdk.g.axR().MM();
    this.hIQ.hIm = System.currentTimeMillis();
    this.hIQ.hIl = localArrayList;
    return localArrayList;
  }

  public final long aDK()
  {
    return this.hIQ.hIm;
  }

  public final int aDL()
  {
    return this.hIK;
  }

  public final int aDM()
  {
    return this.hIL;
  }

  public final String aDN()
  {
    return this.hIR;
  }

  public final void aDO()
  {
    if (ch.jb(this.hIR));
    while (this.hIX)
      return;
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=", "save product Id");
    bg.qW().oQ().set(-29414086, this.hIR);
  }

  public final void aDP()
  {
    this.hIR = ((String)bg.qW().oQ().get(-29414086, "TAG_DEFAULT_TAB"));
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.hIR;
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=", "restore show tab product id: %s", arrayOfObject);
  }

  public final int aDQ()
  {
    return com.tencent.mm.ar.d.cc(this.dkf);
  }

  public final int aDR()
  {
    return com.tencent.mm.ar.d.cd(this.dkf);
  }

  public final boolean aDS()
  {
    return this.hIS;
  }

  public final boolean aDT()
  {
    return this.hIT;
  }

  public final ArrayList aDU()
  {
    return this.hIQ.hIl;
  }

  public final boolean aDV()
  {
    return (((Boolean)bg.qW().oQ().get(66832, Boolean.valueOf(false))).booleanValue()) && (!this.hIY);
  }

  public final int aDW()
  {
    String str = this.hIR;
    if (this.hIQ.hIk != null)
      for (int i = 0; i < this.hIQ.hIk.size(); i++)
      {
        g localg = (g)this.hIQ.hIk.get(i);
        if ((localg != null) && (localg.JS().equals(str)))
          return i;
      }
    return 0;
  }

  public final g aDX()
  {
    return vT(this.hIR);
  }

  public final boolean aDY()
  {
    return this.hIU;
  }

  public final boolean aDZ()
  {
    return this.hIQ.hIr;
  }

  public final void aEa()
  {
    this.hIQ.hIr = true;
    this.hIQ.hIs = false;
  }

  public final boolean aEb()
  {
    return this.hIQ.hIs;
  }

  public final void aEc()
  {
    this.hIQ.hIs = true;
    this.hIQ.hIr = false;
  }

  public final boolean aEd()
  {
    return this.hIV;
  }

  public final boolean aEe()
  {
    return this.hIW;
  }

  public final boolean aEf()
  {
    return this.hIX;
  }

  public final void aEg()
  {
    this.hIX = true;
  }

  public final void aEh()
  {
    this.hIQ.clear();
  }

  public final void aEi()
  {
    z.v("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0KXlW+3FKbuI=", "push to soft");
  }

  public final int aEj()
  {
    if (this.hIX)
      return vT("TAG_DEFAULT_TAB").aDw();
    return this.hIQ.hIo;
  }

  public final List aEk()
  {
    return this.hIQ.hIk;
  }

  public final void aEl()
  {
    this.hIQ.hIo = 0;
    if (this.hIQ.hIk == null)
      return;
    Iterator localIterator = this.hIQ.hIk.iterator();
    while (localIterator.hasNext())
    {
      g localg2 = (g)localIterator.next();
      d locald = this.hIQ;
      locald.hIo += localg2.aDw();
    }
    if (this.hIQ.hIk != null);
    try
    {
      this.hIQ.hIn = new int[this.hIQ.hIo];
      int i = 0;
      int k;
      for (int j = 0; ; j = k)
      {
        g localg1;
        int m;
        if (i < this.hIQ.hIk.size())
        {
          localg1 = (g)this.hIQ.hIk.get(i);
          k = j;
          m = 0;
        }
        while (m < localg1.aDw())
        {
          int n = this.hIQ.hIo;
          if (k >= n)
          {
            label178: Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = Integer.valueOf(this.hIQ.hIo);
            z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=", "refreshAllCount count: %d", arrayOfObject);
            return;
          }
          int[] arrayOfInt = this.hIQ.hIn;
          int i1 = k + 1;
          arrayOfInt[k] = i;
          m++;
          k = i1;
        }
        i++;
      }
    }
    catch (Exception localException)
    {
      break label178;
    }
  }

  public final boolean aEm()
  {
    return this.hJb;
  }

  public final boolean aEn()
  {
    int[] arrayOfInt = aEo();
    if (arrayOfInt[0] < arrayOfInt[1]);
    for (int i = 1; i == 1; i = 2)
      return true;
    return false;
  }

  public final String aEp()
  {
    return this.hDa;
  }

  public final void aEq()
  {
    if (this.hJa != null)
    {
      z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=", "remove succeed send listener");
      com.tencent.mm.sdk.c.a.aGB().b("SucceedUploadEmotion", this.hJa);
      this.hJa = null;
    }
  }

  public final void aEr()
  {
    this.hJd = true;
  }

  public final boolean aEs()
  {
    return this.hJd;
  }

  public final boolean aEt()
  {
    return this.hJe;
  }

  public final int ae(String paramString, int paramInt)
  {
    return (this.hIQ.hIp - paramInt * vQ(paramString)) / (paramInt + 1);
  }

  public final void dN(boolean paramBoolean)
  {
    this.hIS = paramBoolean;
  }

  public final void dO(boolean paramBoolean)
  {
    this.hIT = paramBoolean;
  }

  public final void dP(boolean paramBoolean)
  {
    this.hIY = paramBoolean;
  }

  public final void dQ(boolean paramBoolean)
  {
    this.hIU = paramBoolean;
  }

  public final void dR(boolean paramBoolean)
  {
    this.hIV = paramBoolean;
  }

  public final void dS(boolean paramBoolean)
  {
    this.hIW = paramBoolean;
  }

  public final void dT(boolean paramBoolean)
  {
    this.hJb = paramBoolean;
  }

  public final void dU(boolean paramBoolean)
  {
    this.hJe = paramBoolean;
  }

  public final void destroy()
  {
    Iterator localIterator = this.hIQ.hIk.iterator();
    while (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      if (localg != null)
        localg.aDD();
    }
    aEq();
  }

  public final void mZ(int paramInt)
  {
    this.hIQ.hIp = paramInt;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=", "set viewpager height px: %d", arrayOfObject);
  }

  public final void na(int paramInt)
  {
    this.hIQ.hIq = paramInt;
  }

  public final g nb(int paramInt)
  {
    if ((this.hIQ.hIk == null) || (paramInt >= this.hIQ.hIk.size()))
      return null;
    return (g)this.hIQ.hIk.get(paramInt);
  }

  public final g nc(int paramInt)
  {
    if (this.hIQ.hIk == null)
      return null;
    return (g)this.hIQ.hIk.get(nd(paramInt));
  }

  public final int nd(int paramInt)
  {
    if ((this.hIQ.hIn == null) || (paramInt >= this.hIQ.hIn.length) || (paramInt <= 0))
      return 0;
    return this.hIQ.hIn[paramInt];
  }

  public final void ne(int paramInt)
  {
    if (this.hIZ != paramInt)
    {
      this.hIQ.hIs = false;
      this.hIQ.hIr = false;
    }
    this.hIZ = paramInt;
  }

  public final View ng(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=", "get Item: %d", arrayOfObject);
    t localt = (t)this.hIQ.hIk.get(nd(paramInt));
    if (localt == null)
      return new SmileyGrid(this.dkf);
    return (View)localt.getItem(paramInt - localt.aDt());
  }

  public final void vR(String paramString)
  {
    if (ch.jb(paramString))
      return;
    this.hIR = paramString;
  }

  public final boolean vS(String paramString)
  {
    return (paramString != null) && (this.hIR.equals(paramString));
  }

  public final g vT(String paramString)
  {
    if ((this.hIQ.hIk == null) || (paramString == null))
      return null;
    Iterator localIterator = this.hIQ.hIk.iterator();
    while (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      if (localg == null)
        z.e("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=", "get null tab");
      else if (localg.JS() == null)
        z.e("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=", "get null tab productId");
      else if (localg.JS().equals(paramString))
        return localg;
    }
    return null;
  }

  public final int vU(String paramString)
  {
    int i = this.hIQ.hIp;
    int j = 0;
    if (i > 0)
    {
      boolean bool1 = ch.jb(paramString);
      j = 0;
      if (!bool1)
        break label29;
    }
    label29: label88: label92: 
    while (true)
    {
      return j;
      int k = this.hIQ.hIp / vQ(paramString);
      boolean bool2 = ch.jb(paramString);
      j = 0;
      if (bool2)
        if (k <= j)
          break label88;
      while (true)
      {
        if (j > 0)
          break label92;
        return 1;
        if (paramString.equals("TAG_DEFAULT_TAB"))
        {
          j = 3;
          break;
        }
        j = 2;
        break;
        j = k;
      }
    }
  }

  public final int vV(String paramString)
  {
    int i = 4;
    if (ch.jb(paramString))
      return 0;
    if (paramString.equals("TAG_DEFAULT_TAB"))
    {
      if (aEn())
        return 7;
      return 14;
    }
    if (this.hIQ.hIp <= 0)
      return 0;
    if (this.hIQ.hIq <= 1)
      this.hIQ.hIq = aEo()[0];
    int j = this.hIQ.hIq / this.hIO;
    if (aEn())
      if (j <= i);
    while (true)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=", "return calc Col Nums: %d", arrayOfObject);
      return i;
      i = j;
      continue;
      i = j;
    }
  }

  public final void vW(String paramString)
  {
    this.hDa = paramString;
  }

  public final void vX(String paramString)
  {
    vR(paramString);
    aDO();
    if (this.hJa == null)
      this.hJa = new j(this);
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0qRffxBlWzAE=", "add succeed send listener");
    com.tencent.mm.sdk.c.a.aGB().a("SucceedUploadEmotion", this.hJa);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.simley.i
 * JD-Core Version:    0.6.2
 */