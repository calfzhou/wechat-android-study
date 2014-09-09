package com.tencent.mm.ui.tools;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.a.d;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.q;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.chatting.na;
import com.tencent.mm.ui.chatting.ne;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ck extends s
  implements cu, com.tencent.mm.y.i
{
  private HashMap eJi = new HashMap();
  private int es = 0;
  private g jRD;
  public HashMap jRE = new HashMap();
  public final cm jRF = new cm(this);
  private HashMap jRG = new HashMap();
  private HashMap jRH = new HashMap();
  private long jRI = 0L;

  public ck(bt parambt)
  {
    super(parambt);
    f localf = a.aGB();
    na localna = new na(ne.jvw, parambt.jQK);
    this.jRD = localna;
    localf.a("RevokeMsg", localna);
    Map localMap = cz.jRT.eXu.snapshot();
    this.jRF.v(localMap);
  }

  public static Bitmap Dn(String paramString)
  {
    int i = 960;
    boolean bool1 = true;
    if (paramString == null)
      return null;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = bool1;
    Bitmap localBitmap1 = BitmapFactory.decodeFile(paramString, localOptions);
    if (localBitmap1 != null)
      localBitmap1.recycle();
    boolean bool2;
    boolean bool3;
    label96: int j;
    if ((com.tencent.mm.platformtools.ap.N(localOptions.outWidth, localOptions.outHeight)) && (localOptions.outWidth > 480))
    {
      bool2 = bool1;
      if ((!com.tencent.mm.platformtools.ap.M(localOptions.outWidth, localOptions.outHeight)) || (localOptions.outHeight <= 480))
        break label249;
      bool3 = bool1;
      if ((!bool2) && (!bool3))
        break label282;
      j = localOptions.outHeight;
      i = localOptions.outWidth;
    }
    while (true)
    {
      int k = com.tencent.mm.platformtools.c.iM(paramString);
      if ((k == 90) || (k == 270))
      {
        int m = i;
        i = j;
        j = m;
      }
      Bitmap localBitmap4;
      if ((MMNativeJpeg.IsJpegFile(paramString)) && (MMNativeJpeg.isProgressive(paramString)))
      {
        localBitmap4 = MMNativeJpeg.decodeAsBitmap(paramString);
        Object[] arrayOfObject = new Object[bool1];
        if (localBitmap4 == null)
        {
          label179: arrayOfObject[0] = Boolean.valueOf(bool1);
          z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "Progressive jpeg, result isNull:%b", arrayOfObject);
        }
      }
      for (Bitmap localBitmap2 = localBitmap4; ; localBitmap2 = null)
      {
        if (localBitmap2 == null);
        for (Bitmap localBitmap3 = com.tencent.mm.sdk.platformtools.i.a(paramString, j, i, false); ; localBitmap3 = localBitmap2)
        {
          if (localBitmap3 == null)
          {
            z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "getSuitableBmp fail, temBmp is null, filePath = " + paramString);
            return null;
            bool2 = false;
            break;
            label249: bool3 = false;
            break label96;
            bool1 = false;
            break label179;
          }
          return com.tencent.mm.sdk.platformtools.i.a(localBitmap3, k);
        }
      }
      label282: j = i;
    }
  }

  public static String a(ar paramar, l paraml, boolean paramBoolean)
  {
    if (paramar.jK() == 1)
    {
      String str3 = com.tencent.mm.y.ap.yg().d(paraml);
      String str4 = com.tencent.mm.y.ap.yg().f(str3, "", "");
      if (com.tencent.mm.a.c.ac(str4));
      do
      {
        return str4;
        String str5 = paraml.xN();
        str4 = com.tencent.mm.y.ap.yg().f(str5, "", "");
      }
      while (com.tencent.mm.a.c.ac(str4));
      return null;
    }
    if ((!paramBoolean) && (!paraml.xQ()))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Boolean.valueOf(paramBoolean);
      arrayOfObject[1] = Boolean.valueOf(paraml.xQ());
      z.w("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "getImagePath is null because of isTryToGetProgress %s img.isGetCompleted() %s", arrayOfObject);
      return null;
    }
    String str1 = paraml.xN();
    String str2;
    if (paraml.xR())
    {
      str2 = com.tencent.mm.y.ap.yg().d(paraml);
      if (str2 != null)
        z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "hasHdImg");
    }
    while (true)
    {
      z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "the path : %s", new Object[] { str2 });
      return com.tencent.mm.y.ap.yg().f(str2, "", "");
      str2 = str1;
    }
  }

  private void a(ar paramar, dp paramdp, int paramInt)
  {
    z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "edw dealFail", new Object[0]);
    String str = com.tencent.mm.y.ap.yg().gS(paramar.kp());
    dp.v(paramdp.jSX, 8);
    dp.v(paramdp.jSR, 8);
    dp.v(paramdp.jTb, 8);
    paramdp.baC().jSY.setVisibility(0);
    if ((str == null) || (!com.tencent.mm.a.c.ac(str)))
    {
      paramdp.baC().jTa.setImageResource(com.tencent.mm.h.VW);
      paramdp.baC().jSZ.setText(com.tencent.mm.n.cDp);
      return;
    }
    ImageView localImageView = paramdp.baC().jTa;
    if (localImageView != null)
    {
      if ((!ch.jb(str)) && (com.tencent.mm.a.c.ac(str)))
        break label159;
      localImageView.setImageBitmap(null);
    }
    while (paramar.aJL())
    {
      paramdp.baC().jSZ.setText(com.tencent.mm.n.cDn);
      return;
      label159: if (this.jRF.eXu.T(str))
      {
        Bitmap localBitmap2 = (Bitmap)this.jRF.eXu.get(str);
        if (!localBitmap2.isRecycled())
          localImageView.setImageBitmap(localBitmap2);
      }
      else if (this.jOZ.jQT)
      {
        Bitmap localBitmap1 = Dn(str);
        if (localBitmap1 != null)
          c(localImageView, localBitmap1);
      }
      else if (!this.jRF.b(localImageView, paramInt))
      {
        this.jRF.i(localImageView, str);
      }
    }
    paramdp.baC().jSZ.setText(com.tencent.mm.n.cDo);
  }

  private void a(dp paramdp, ar paramar, l paraml, boolean paramBoolean, int paramInt)
  {
    a(paramdp, paramar, paraml, paramBoolean, true, paramInt);
  }

  private void a(dp paramdp, ar paramar, l paraml, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "edw dealDownloading, isHd = " + paramBoolean1);
    dp.v(paramdp.jSY, 8);
    if (!paramBoolean1)
      paramdp.jTb.setVisibility(0);
    l locall = m.a(paraml);
    if ((paramBoolean1) && (paramInt == this.jOZ.jQK.W()))
      this.jOZ.jQK.bay();
    String str1 = null;
    if (paramBoolean1)
      str1 = a(paramar, paraml, true);
    if (ch.jb(str1))
      str1 = com.tencent.mm.y.ap.yg().f(locall.xO(), "", "");
    String str2 = com.tencent.mm.y.ap.yg().gS(paramar.kp());
    if (paramBoolean2)
      a(paramdp, str2, str1, paramar);
    int k;
    if (!paramBoolean1)
    {
      int i = paraml.sp();
      int j = paraml.getOffset();
      if (i == 0)
        break label244;
      k = -1 + j * 100 / i;
      if (Math.max(1, k) <= 50)
        break label250;
      paramdp.baB().jSX.setVisibility(8);
    }
    while (true)
    {
      paramdp.baB().jSV.setVisibility(8);
      paramdp.baB().jSU.setVisibility(8);
      paramdp.baB().jST.setVisibility(8);
      return;
      label244: k = 0;
      break;
      label250: paramdp.baB().jSX.setVisibility(0);
    }
  }

  private boolean a(dp paramdp, ar paramar, l paraml, int paramInt)
  {
    z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "edw dealSucc");
    String str1 = c(paramar, paraml);
    dp.v(paramdp.jSX, 8);
    String str2 = (String)this.jRH.get(paramar);
    if (str2 == null)
    {
      str2 = com.tencent.mm.y.ap.yg().gS(paramar.kp());
      this.jRH.put(paramar, str2);
    }
    boolean bool = a(paramdp, str2, str1, paramar);
    if ((paramInt == this.jOZ.jQK.W()) && (this.jOZ.jQO))
    {
      this.jOZ.af(paramar);
      this.jOZ.jQO = false;
    }
    return bool;
  }

  private boolean a(dp paramdp, String paramString1, String paramString2, ar paramar)
  {
    dp.v(paramdp.jTb, 0);
    dp.v(paramdp.jSR, 8);
    dp.v(paramdp.jSX, 8);
    dp.v(paramdp.jSY, 8);
    return a(true, paramdp.jTb, paramString1, paramString2, false, paramdp.iy);
  }

  private boolean a(boolean paramBoolean1, MultiTouchImageView paramMultiTouchImageView, String paramString1, String paramString2, boolean paramBoolean2, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramMultiTouchImageView.hashCode());
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = Integer.valueOf(paramInt);
    z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "initImageView image : %s bigImgPath %s position : %s", arrayOfObject);
    boolean bool;
    String str;
    if ((paramString2 != null) && (com.tencent.mm.a.c.ac(paramString2)))
    {
      bool = true;
      str = paramString2;
      if ((str != null) || (paramString1 == null) || (!com.tencent.mm.a.c.ac(paramString1)))
        break label315;
      if (!com.tencent.mm.a.c.ac(paramString1 + "hd"));
    }
    label315: for (paramString1 = paramString1 + "hd"; ; paramString1 = str)
    {
      if (paramString1 == null)
      {
        z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "getSuitableBmp fail, file does not exist, filePath %s", new Object[] { paramString2 });
        return false;
        str = null;
        bool = false;
        break;
      }
      if ((!paramBoolean2) && (this.jRF.eXu.T(paramString1)))
      {
        Bitmap localBitmap2 = (Bitmap)this.jRF.eXu.get(paramString1);
        if (!localBitmap2.isRecycled())
        {
          z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "use cache, fillBitmap path : %s", new Object[] { paramString1 });
          b(paramMultiTouchImageView, localBitmap2);
          return true;
        }
      }
      if (paramBoolean1)
        paramMultiTouchImageView.setImageBitmap(null);
      if (!this.jOZ.jQT)
        if (paramInt >= 0)
          this.jRF.b(paramMultiTouchImageView, paramInt);
      Bitmap localBitmap1;
      do
      {
        this.jRF.i(paramMultiTouchImageView, paramString1);
        return bool;
        localBitmap1 = Dn(paramString1);
      }
      while (localBitmap1 == null);
      c(paramMultiTouchImageView, localBitmap1);
      if (paramString1.equals(paramString2))
        this.jRF.eXu.b(paramString1, localBitmap1);
      return bool;
    }
  }

  private int ag(ar paramar)
  {
    if (this.jRE.containsKey(Long.valueOf(paramar.kk())))
      return ((Integer)this.jRE.get(Long.valueOf(paramar.kk()))).intValue();
    return 0;
  }

  public static l ah(ar paramar)
  {
    l locall;
    if (!bt.ac(paramar))
      locall = null;
    do
    {
      return locall;
      if (paramar.jK() != 1)
        break;
      long l2 = paramar.kk();
      locall = com.tencent.mm.y.ap.yg().T(l2);
    }
    while (locall.xM() != 0L);
    long l1 = paramar.kl();
    return com.tencent.mm.y.ap.yg().S(l1);
  }

  private void b(ar paramar, int paramInt)
  {
    this.jRE.put(Long.valueOf(paramar.kk()), Integer.valueOf(paramInt));
  }

  @TargetApi(11)
  private void b(MultiTouchImageView paramMultiTouchImageView, Bitmap paramBitmap)
  {
    if ((this.jOZ == null) || (this.jOZ.jQK == null))
      return;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramMultiTouchImageView.hashCode());
    arrayOfObject[1] = Integer.valueOf(paramBitmap.hashCode());
    z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "fillBitmap image : %s bmp %s", arrayOfObject);
    if (Build.VERSION.SDK_INT == 20)
      paramMultiTouchImageView.setLayerType(1, null);
    while (true)
    {
      paramMultiTouchImageView.eW(false);
      paramMultiTouchImageView.bh(paramBitmap.getWidth(), paramBitmap.getHeight());
      paramMultiTouchImageView.setImageBitmap(null);
      paramMultiTouchImageView.setImageBitmap(paramBitmap);
      paramMultiTouchImageView.invalidate();
      return;
      q.d((View)paramMultiTouchImageView.getParent(), paramBitmap.getWidth(), paramBitmap.getHeight());
    }
  }

  private String c(ar paramar, l paraml)
  {
    String str1 = (String)this.jRG.get(paramar);
    String str2;
    if (str1 == null)
    {
      str2 = a(paramar, paraml, false);
      if ((str2 == null) || (str2.length() == 0))
        str1 = null;
    }
    else
    {
      return str1;
    }
    this.jRG.put(paramar, str2);
    return str2;
  }

  private static boolean qZ(int paramInt)
  {
    return paramInt == 1;
  }

  private void u(long paramLong, int paramInt)
  {
    this.jRE.put(Long.valueOf(paramLong), Integer.valueOf(paramInt));
  }

  public final Bitmap Dm(String paramString)
  {
    return Dn(paramString);
  }

  public final l a(ar paramar, boolean paramBoolean)
  {
    boolean bool = bt.ac(paramar);
    l locall1 = null;
    if (!bool);
    do
    {
      return locall1;
      if ((this.jOZ == null) || (this.jOZ.jQL == null))
        z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "adapter is null!!");
      locall1 = null;
      if (!paramBoolean)
      {
        int j = paramar.jK();
        locall1 = null;
        if (j == 1)
          locall1 = (l)this.jOZ.jQL.jRd.get(Long.valueOf(paramar.kk()));
        if ((locall1 == null) && (paramar.kl() > 0L))
          locall1 = (l)this.jOZ.jQL.jRc.get(Long.valueOf(paramar.kl()));
      }
    }
    while (locall1 != null);
    long l3;
    l locall4;
    long l2;
    l locall3;
    if (paramar.jK() == 1)
    {
      l3 = paramar.kk();
      locall4 = com.tencent.mm.y.ap.yg().T(l3);
      if (locall4.xM() != 0L);
    }
    else
    {
      long l1 = paramar.kl();
      l locall2 = com.tencent.mm.y.ap.yg().S(l1);
      l2 = l1;
      locall3 = locall2;
    }
    for (int i = 1; ; i = 0)
    {
      bu localbu = this.jOZ.jQL;
      if (i != 0)
      {
        localbu.jRc.put(Long.valueOf(l2), locall3);
        return locall3;
      }
      localbu.jRd.put(Long.valueOf(l2), locall3);
      return locall3;
      l2 = l3;
      locall3 = locall4;
    }
  }

  public final void a(int paramInt1, Object paramObject, int paramInt2, int paramInt3, x paramx)
  {
    if (this.es != 0);
    int i;
    dp localdp;
    do
    {
      do
      {
        return;
        if (!(paramObject instanceof Integer))
        {
          z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "param data not integer instance");
          return;
        }
        i = ((Integer)paramObject).intValue();
        z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "onImgTaskProgress, pos = " + i);
        if (i == -1)
        {
          z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "onImgTaskProgress, pos is -1");
          return;
        }
      }
      while (this.jOZ.pL(i) == null);
      localdp = (dp)this.jOZ.pL(i).getTag();
    }
    while (localdp == null);
    if ((i == this.jOZ.jQK.W()) && (!qZ(paramInt1)))
      this.jOZ.jQK.bf(false);
    if ((paramInt2 != 0) && (paramInt3 != 0));
    for (int j = -1 + paramInt2 * 100 / paramInt3; ; j = 0)
    {
      int k = Math.max(1, j);
      if ((i == this.jOZ.jQK.W()) && (qZ(paramInt1)))
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Integer.valueOf(k);
        arrayOfObject3[1] = Long.valueOf(System.currentTimeMillis());
        z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "jacks loading hd from progress : %d, time: %d", arrayOfObject3);
        this.jOZ.jQK.rg(k);
      }
      ac localac = (ac)paramx;
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Boolean.valueOf(localac.xZ());
      arrayOfObject1[1] = Boolean.valueOf(MMNativeJpeg.isProgressive(localac.CI()));
      arrayOfObject1[2] = Long.valueOf(ch.ad(this.jRI));
      z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "onImgTaskProgress getCanShowProgressImg %s isProgressive %s ticksToNow %s", arrayOfObject1);
      if ((!localac.xZ()) || (!MMNativeJpeg.isProgressive(localac.CI())) || (ch.ad(this.jRI) <= 1000L))
        break;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(paramInt2);
      arrayOfObject2[1] = Integer.valueOf(paramInt3);
      z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "onImgTaskProgress show %d/%d", arrayOfObject2);
      this.jRI = ch.CN();
      ar localar = this.jOZ.qP(i);
      l locall = a(localar, true);
      if (!a(false, localdp.jTb, com.tencent.mm.y.ap.yg().gS(localar.kp()), a(localar, locall, true), true, -1))
        break;
      dp.v(localdp.jTb, 0);
      dp.v(localdp.jSV, 8);
      dp.v(localdp.jSY, 8);
      if ((i != this.jOZ.jQK.W()) || (qZ(paramInt1)))
        break;
      if (k <= 50)
        break label501;
      dp.v(localdp.jSX, 8);
      return;
    }
    label501: dp.v(localdp.jSX, 0);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    if ((this.jOZ == null) || (this.jOZ.jQK == null))
      return;
    if (!(paramObject instanceof Integer))
    {
      z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "param data not integer instance");
      return;
    }
    int i = ((Integer)paramObject).intValue();
    z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "onSceneEnd, pos = " + i);
    if (i == -1)
    {
      z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "onSceneEnd, pos is -1");
      return;
    }
    if (this.jOZ.pL(i) != null);
    for (dp localdp = (dp)this.jOZ.pL(i).getTag(); ; localdp = null)
    {
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        if (i == this.jOZ.jQK.W())
          this.jOZ.jQK.bf(true);
        u(paramLong2, 5);
        z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "onSceneEnd, errType = " + paramInt2 + ", errCode = " + paramInt3);
        this.jOZ.jQP.qN(i);
        return;
      }
      z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "pos = " + i + ", selectedPos = " + this.jOZ.jQK.W(), new Object[0]);
      u(paramLong2, 4);
      ar localar = this.jOZ.qP(i);
      l locall = a(localar, true);
      if (localdp == null)
        break;
      this.jOZ.jQK.bf(true);
      if (i == this.jOZ.jQK.W())
      {
        if (!qZ(paramInt1))
          break label433;
        this.jOZ.jQK.baz();
      }
      while (true)
      {
        if (!a(false, localdp.jTb, com.tencent.mm.y.ap.yg().gS(localar.kp()), a(localar, locall, true), true, -1))
          break label455;
        dp.v(localdp.jTb, 0);
        dp.v(localdp.jSR, 8);
        dp.v(localdp.jSX, 8);
        dp.v(localdp.jSY, 8);
        if ((ag(localar) != 4) || (!this.jOZ.jQO))
          break;
        this.jOZ.af(localar);
        this.jOZ.jQO = false;
        return;
        label433: localdp.jTb.post(new cl(this, i));
      }
      label455: z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "failed to show downloaded image!");
      return;
    }
  }

  public final boolean a(dp paramdp, ar paramar, int paramInt)
  {
    super.a(paramdp, paramar, paramInt);
    if ((paramdp == null) || (paramar == null) || (paramInt < 0));
    int i;
    l locall;
    do
    {
      return false;
      i = ag(paramar);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramdp.jTb.hashCode());
      arrayOfObject[1] = Integer.valueOf(paramInt);
      z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "filling image : %s position : %s", arrayOfObject);
      dp.v(paramdp.jSR, 8);
      locall = a(paramar, false);
    }
    while (locall == null);
    this.jOZ.jQK.ge(true);
    switch (i)
    {
    default:
    case 0:
    case 1:
    case 4:
    case 2:
    case 3:
    case 5:
    }
    while (true)
    {
      return true;
      z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "edw dealDownloadOrSucc");
      z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "deal LoadFail");
      boolean bool;
      if (paramar.jK() == 1)
        bool = paramar.aJL();
      while (true)
      {
        if (!bool)
          break label248;
        b(paramar, 5);
        a(paramar, paramdp, paramInt);
        break;
        if (paramar.aJL())
        {
          bool = true;
        }
        else if (locall.xQ())
        {
          String str = c(paramar, locall);
          if ((str == null) || (!com.tencent.mm.a.c.ac(str)))
            bool = true;
        }
        else
        {
          bool = false;
        }
      }
      label248: com.tencent.mm.y.h localh;
      label291: long l1;
      long l2;
      Integer localInteger;
      if (a(paramdp, paramar, locall, paramInt))
      {
        if ((paramar.jK() == 1) || (locall.xQ()))
        {
          b(paramar, 4);
        }
        else
        {
          b(paramar, 1);
          localh = com.tencent.mm.y.ap.yh();
          l1 = locall.xM();
          l2 = paramar.kk();
          localInteger = Integer.valueOf(paramInt);
          if (paramar.jK() != 1);
        }
      }
      else
      {
        for (int j = com.tencent.mm.h.Ti; ; j = com.tencent.mm.h.Tg)
        {
          localh.a(l1, l2, 0, localInteger, j, this, 0);
          a(paramdp, paramar, locall, false, paramInt);
          if (this.jOZ.jQK.jSo.contains(Integer.valueOf(paramInt)))
            break;
          this.jOZ.jQK.jSo.add(Integer.valueOf(paramInt));
          break;
          b(paramar, 2);
          break label291;
        }
        a(paramdp, paramar, locall, paramInt);
        continue;
        a(paramdp, paramar, locall, false, paramInt);
        continue;
        a(paramdp, paramar, locall, true, paramInt);
        continue;
        this.jOZ.jQK.ge(false);
        a(paramar, paramdp, paramInt);
        paramdp.gAm.invalidate();
      }
    }
  }

  public final void b(long paramLong, Object paramObject)
  {
    if (!(paramObject instanceof Integer))
    {
      z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "param data not integer instance");
      return;
    }
    int i = ((Integer)paramObject).intValue();
    z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "image task canceled at pos " + i, new Object[0]);
  }

  public final void c(ImageView paramImageView, Bitmap paramBitmap)
  {
    if (paramBitmap == null);
    while (paramImageView == null)
      return;
    int i = paramImageView.hashCode();
    int j = paramBitmap.hashCode();
    int k = this.jRF.eXv.indexOfValue(i);
    if (k >= 0)
      this.jRF.eXv.removeAt(k);
    this.jRF.eXv.put(j, i);
    if ((paramImageView instanceof MultiTouchImageView))
    {
      b((MultiTouchImageView)paramImageView, paramBitmap);
      return;
    }
    paramImageView.setImageBitmap(paramBitmap);
  }

  public final void detach()
  {
    super.detach();
    a.aGB().b("RevokeMsg", this.jRD);
    if (this.eJi != null)
    {
      Iterator localIterator = this.eJi.keySet().iterator();
      while (localIterator.hasNext())
      {
        Bitmap localBitmap = (Bitmap)((WeakReference)this.eJi.get(localIterator.next())).get();
        if ((localBitmap != null) && (!localBitmap.isRecycled()))
        {
          z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "detach, bmp recycled!");
          localBitmap.recycle();
        }
      }
    }
    this.jRF.detach();
    com.tencent.mm.y.ap.yh().a(this);
  }

  public final void i(int paramInt)
  {
    this.es = paramInt;
    if (this.jRF != null)
      this.jRF.i(paramInt);
  }

  public final void ra(int paramInt)
  {
    z.i("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "viewHdImg, pos = " + paramInt);
    ar localar = this.jOZ.qP(paramInt);
    if ((localar == null) || (localar.kk() == 0L))
    {
      z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "msg is null");
      return;
    }
    if (!bt.ac(localar))
    {
      z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", "not img can't download hd");
      return;
    }
    l locall = a(localar, true);
    if ((locall == null) || (locall.xM() == 0L))
    {
      StringBuilder localStringBuilder1 = new StringBuilder("viewHdImg fail, msgLocalId = ");
      Object localObject1;
      StringBuilder localStringBuilder2;
      if (localar == null)
      {
        localObject1 = "null";
        localStringBuilder2 = localStringBuilder1.append(localObject1).append(", imgLocalId = ");
        if (locall != null)
          break label162;
      }
      label162: for (Object localObject2 = "null"; ; localObject2 = Long.valueOf(locall.xM()))
      {
        z.e("!56@/B4Tb64lLpJSmuQVFTi9B9Pj/FRa46tMjyWBhAVlBvgbeW0CO/PGGA==", localObject2);
        return;
        localObject1 = Long.valueOf(localar.kk());
        break;
      }
    }
    b(localar, 3);
    if (qM(paramInt) != null)
      a(qM(paramInt), localar, locall, true, false, paramInt);
    com.tencent.mm.y.h localh = com.tencent.mm.y.ap.yh();
    long l1 = locall.xM();
    long l2 = localar.kk();
    Integer localInteger = Integer.valueOf(paramInt);
    if (localar.jK() == 1);
    for (int i = com.tencent.mm.h.Ti; ; i = com.tencent.mm.h.Tg)
    {
      localh.a(l1, l2, 1, localInteger, i, this, 0);
      return;
    }
  }

  public final Bitmap rb(int paramInt)
  {
    ar localar = this.jOZ.jQL.qX(paramInt);
    if (localar != null)
    {
      String str1 = (String)this.jRH.get(localar);
      if (str1 == null)
      {
        str1 = com.tencent.mm.y.ap.yg().gS(localar.kp());
        this.jRH.put(localar, str1);
      }
      String str2 = str1 + "hd";
      if (com.tencent.mm.a.c.ac(str2))
        return Dn(str2);
      return Dn(str1);
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ck
 * JD-Core Version:    0.6.2
 */