package com.tencent.mm.y;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.mm.a.d;
import com.tencent.mm.aq.a;
import com.tencent.mm.as.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;

public final class n extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS ImgInfo ( id INTEGER PRIMARY KEY, msgSvrId LONG, offset INT, totalLen INT, bigImgPath TEXT, thumbImgPath TEXT )", "CREATE TABLE IF NOT EXISTS ImgInfo2 ( id INTEGER PRIMARY KEY, msgSvrId LONG, offset INT, totalLen INT, bigImgPath TEXT, thumbImgPath TEXT, createtime INT, msglocalid INT, status INT, nettimes INT, reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text, hashdthumb int )", "CREATE INDEX IF NOT EXISTS  serverImgInfoIndex ON ImgInfo2 ( msgSvrId ) ", "CREATE INDEX IF NOT EXISTS  serverImgInfoHdIndex ON ImgInfo2 ( reserved1 ) ", "CREATE INDEX IF NOT EXISTS  msgLocalIdIndex ON ImgInfo2 ( msglocalid ) ", "insert into imginfo2 (id,msgSvrId , offset , totalLen , bigImgPath , thumbImgPath) select id, msgSvrId, offset ,totallen , bigimgpath , thumbimgpath from imginfo; ", "delete from ImgInfo ; ", "CREATE INDEX IF NOT EXISTS iscomplete_index ON ImgInfo2 ( iscomplete ) " };
  private h dmb = null;
  private FrameLayout.LayoutParams dxA = new FrameLayout.LayoutParams(-2, -2);
  private SoftReference dxB;
  private d dxr = new d(40, new o(this));
  private List dxs = new ArrayList();
  private Map dxt = new HashMap();
  private Map dxu = new HashMap();
  private Map dxv = new HashMap();
  private Set dxw = new HashSet();
  private Map dxy = new HashMap();
  private int dxz = 1;
  private cm jzh = new cm(Looper.getMainLooper());

  public n(h paramh)
  {
    b(paramh);
    this.dmb = paramh;
    Cursor localCursor = this.dmb.a("ImgInfo2", null, null, null, null, "id desc  LIMIT 1");
    if (localCursor.moveToFirst())
      this.dxz = (1 + localCursor.getInt(0));
    localCursor.close();
    z.w("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "loading new img id:" + this.dxz);
  }

  private Bitmap a(String paramString, boolean paramBoolean1, float paramFloat, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt, boolean paramBoolean5)
  {
    if (!paramBoolean1)
      paramString = gT(paramString);
    Bitmap localBitmap1;
    if (paramString == null)
      localBitmap1 = null;
    boolean bool;
    Bitmap localBitmap2;
    do
    {
      do
      {
        return localBitmap1;
        localBitmap1 = null;
        if (paramBoolean5)
        {
          localBitmap1 = (Bitmap)this.dxr.get(paramString);
          if (localBitmap1 == null)
          {
            Object[] arrayOfObject5 = new Object[2];
            if (localBitmap1 != null)
              break;
            bool = true;
            arrayOfObject5[0] = Boolean.valueOf(bool);
            arrayOfObject5[1] = paramString;
            z.a("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "bm is null:%b,  url:%s", arrayOfObject5);
          }
        }
      }
      while ((localBitmap1 != null) && (!localBitmap1.isRecycled()));
      localBitmap2 = i.f(paramString, paramFloat);
    }
    while (localBitmap2 == null);
    long l = System.currentTimeMillis();
    int i;
    int j;
    label136: label180: float f;
    int k;
    int m;
    if (paramString.endsWith("hd"))
    {
      i = localBitmap2.getWidth();
      j = localBitmap2.getHeight();
      if ((paramBoolean3) && ((i > 150) || (j > 150)))
      {
        if (i <= j)
          break label501;
        j = j * 150 / i;
        i = 150;
      }
      if (!paramBoolean4)
        break label633;
      if ((i < 200.0F * paramFloat) && (j < 200.0F * paramFloat))
        break label622;
      if (j <= i)
        break label540;
      f = 200.0F * paramFloat / j;
      int n = (int)(f * i);
      k = (int)(f * j);
      m = n;
      label246: if (m < 50.0F * paramFloat)
      {
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(m);
        z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "pic to small width is %d ", arrayOfObject4);
        m = (int)(50.0F * paramFloat);
      }
      if (k < 50.0F * paramFloat)
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(k);
        z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "pic to small height is %d ", arrayOfObject3);
        k = (int)(50.0F * paramFloat);
      }
    }
    while (true)
    {
      try
      {
        Bitmap localBitmap5 = Bitmap.createScaledBitmap(localBitmap2, m, k, true);
        localBitmap3 = localBitmap5;
        if (localBitmap2 != localBitmap3)
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = localBitmap2.toString();
          z.i("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "[bitmapFromUriPath]:bitmap recycle %s", arrayOfObject2);
          localBitmap2.recycle();
        }
        if (paramBoolean4)
        {
          localBitmap4 = i.a(localBitmap3, paramInt);
          z.v("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "bitmap time:" + (System.currentTimeMillis() - l));
          if (localBitmap4 != null)
            this.dxr.b(paramString, localBitmap4);
          z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "cached file " + paramString);
          return localBitmap4;
          bool = false;
          break;
          i = (int)(1.25F * (paramFloat * localBitmap2.getWidth()));
          j = (int)(1.25F * (paramFloat * localBitmap2.getHeight()));
          break label136;
          label501: if (i == j)
          {
            j = 150;
            i = 150;
            break label180;
          }
          i = i * 150 / j;
          j = 150;
          break label180;
          label540: f = 200.0F * paramFloat / i;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        Bitmap localBitmap3 = localBitmap2;
        continue;
        if (paramBoolean2)
        {
          localBitmap4 = i.a(localBitmap3, true, a.fromDPToPix(ak.getContext(), 3));
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = localBitmap3.toString();
          z.i("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "[bitmapFromUriPath]:bitmap recycle %s", arrayOfObject1);
          localBitmap3.recycle();
          continue;
        }
        Bitmap localBitmap4 = localBitmap3;
        continue;
      }
      label622: k = j;
      m = i;
      break label246;
      label633: k = j;
      m = i;
    }
  }

  private l a(String paramString1, int paramInt1, int paramInt2, int paramInt3, PInt paramPInt1, PInt paramPInt2, String paramString2)
  {
    return a(paramString1, paramInt1, true, paramInt2, paramInt3, paramPInt1, paramPInt2, paramString2, -1);
  }

  private l a(String paramString1, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, PInt paramPInt1, PInt paramPInt2, String paramString2, int paramInt4)
  {
    if (!com.tencent.mm.a.c.ac(paramString1))
      return null;
    int i = com.tencent.mm.sdk.platformtools.f.iM(paramString1) + paramInt3 * 90;
    String str1 = com.tencent.mm.a.f.d((paramString1 + System.currentTimeMillis()).getBytes());
    String str2 = f(str1, "", ".jpg");
    String str3 = "insert : original img path = " + paramString1 + ",fullpath:%s, needimg:%b,comresstype:%d";
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = str2;
    arrayOfObject1[1] = Boolean.valueOf(paramBoolean);
    arrayOfObject1[2] = Integer.valueOf(paramInt1);
    z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", str3, arrayOfObject1);
    BitmapFactory.Options localOptions1 = i.wS(paramString1);
    try
    {
      if (bc.bP(ak.getContext()))
      {
        int i18 = Integer.valueOf(com.tencent.mm.f.e.or().getValue("CompressPicLevelForWifi")).intValue();
        j = i18;
      }
      while (true)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(j);
        z.i("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "CompressPicLevel-level:%d", arrayOfObject2);
        if ((j <= 10) || (j > 100))
        {
          k = 70;
          m = 0;
          try
          {
            boolean bool2 = bc.bP(ak.getContext());
            m = 0;
            Object localObject;
            if (bool2)
              localObject = com.tencent.mm.f.e.or().getValue("CompressResolutionForWifi");
            int i1;
            long l5;
            while (true)
            {
              int i15 = ((String)localObject).indexOf("*");
              n = 0;
              m = 0;
              if (-1 != i15)
              {
                m = Integer.valueOf(((String)localObject).substring(0, i15)).intValue();
                int i16 = Integer.valueOf(((String)localObject).substring(i15 + 1)).intValue();
                n = i16;
              }
              Object[] arrayOfObject3 = new Object[2];
              arrayOfObject3[0] = Integer.valueOf(m);
              arrayOfObject3[1] = Integer.valueOf(n);
              z.i("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "CompressResolution-width:%d CompressResolution-height:%d", arrayOfObject3);
              if (m <= 0)
                m = 960;
              if (n <= 0)
                n = 960;
              if (m < n)
              {
                int i14 = m;
                m = n;
                n = i14;
              }
              i1 = MMNativeJpeg.queryQuality(paramString1);
              if ((i1 == 0) || (i1 > k))
                break label1799;
              bool1 = false;
              if (!paramBoolean)
                break label885;
              i2 = 0;
              i3 = 0;
              if (localOptions1 != null)
              {
                i2 = localOptions1.outWidth;
                i3 = localOptions1.outHeight;
                if (i2 >= i3)
                  break label1784;
              }
              Object[] arrayOfObject4 = new Object[3];
              arrayOfObject4[0] = Integer.valueOf(paramInt1);
              arrayOfObject4[1] = Boolean.valueOf(bool1);
              arrayOfObject4[2] = Integer.valueOf(i1);
              z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "compresstype:%d,needCompressByQuality:%b,calculatedQuality:%d", arrayOfObject4);
              if ((paramInt1 != 0) || ((!bool1) && ((i1 != 0) || ((com.tencent.mm.a.c.ab(paramString1) <= 204800) && ((localOptions1 == null) || ((i2 <= n) && (i3 <= m)))))))
                break label985;
              if (i2 < n)
                n = i2;
              if (i3 < m)
                m = i3;
              if ((localOptions1 == null) || (localOptions1.outWidth >= localOptions1.outHeight))
                break label1773;
              i8 = n;
              l5 = ch.CN();
              if (i.a(paramString1, m, i8, Bitmap.CompressFormat.JPEG, k, str2))
                break label686;
              z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "createThumbNail big pic fail");
              return null;
              if (bc.bE(ak.getContext()))
              {
                j = Integer.valueOf(com.tencent.mm.f.e.or().getValue("CompressPicLevelFor2G")).intValue();
                break;
              }
              int i17 = Integer.valueOf(com.tencent.mm.f.e.or().getValue("CompressPicLevelFor3G")).intValue();
              j = i17;
              break;
              boolean bool3 = bc.bE(ak.getContext());
              m = 0;
              if (bool3)
              {
                localObject = com.tencent.mm.f.e.or().getValue("CompressResolutionFor2G");
              }
              else
              {
                String str7 = com.tencent.mm.f.e.or().getValue("CompressResolutionFor3G");
                localObject = str7;
              }
            }
            label686: Object[] arrayOfObject11 = new Object[1];
            arrayOfObject11[0] = Long.valueOf(ch.ad(l5));
            z.v("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "test decode mid img:%d", arrayOfObject11);
            BitmapFactory.Options localOptions2 = i.wS(str2);
            Object[] arrayOfObject12 = new Object[10];
            arrayOfObject12[0] = Integer.valueOf(i1);
            arrayOfObject12[1] = Integer.valueOf(k);
            arrayOfObject12[2] = Integer.valueOf(i8);
            arrayOfObject12[3] = Integer.valueOf(m);
            arrayOfObject12[4] = Integer.valueOf(com.tencent.mm.a.c.ab(paramString1));
            arrayOfObject12[5] = Integer.valueOf(com.tencent.mm.a.c.ab(str2));
            int i9;
            int i10;
            label821: int i11;
            if (localOptions1 != null)
            {
              i9 = localOptions1.outWidth;
              arrayOfObject12[6] = Integer.valueOf(i9);
              if (localOptions1 == null)
                break label967;
              i10 = localOptions1.outHeight;
              arrayOfObject12[7] = Integer.valueOf(i10);
              if (localOptions2 == null)
                break label973;
              i11 = localOptions2.outWidth;
              label843: arrayOfObject12[8] = Integer.valueOf(i11);
              if (localOptions2 == null)
                break label979;
            }
            label885: long l1;
            label967: label973: label979: for (int i12 = localOptions2.outHeight; ; i12 = -1)
            {
              arrayOfObject12[9] = Integer.valueOf(i12);
              z.i("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "createThumbNail big pic ok, calculatedQuality:%d, comLev:%d width:%d height:%d origLen:%d compressedLen:%d oriWidth:%d oriHeight:%d comWidth:%d comHeight:%d", arrayOfObject12);
              z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "insert: compressed bigImgPath = " + str2);
              l1 = ch.CN();
              if (((!x.cZ(str2)) && (paramInt1 != 0)) || (!paramBoolean) || (i == 0) || (i.a(str2, i, Bitmap.CompressFormat.JPEG, 90, str2)))
                break label1086;
              z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "rotate big pic fail");
              return null;
              i9 = -1;
              break;
              i10 = -1;
              break label821;
              i11 = -1;
              break label843;
            }
            label985: Object[] arrayOfObject5 = new Object[4];
            arrayOfObject5[0] = Integer.valueOf(i1);
            arrayOfObject5[1] = Integer.valueOf(com.tencent.mm.a.c.ab(paramString1));
            int i4;
            if (localOptions1 != null)
            {
              i4 = localOptions1.outWidth;
              label1023: arrayOfObject5[2] = Integer.valueOf(i4);
              if (localOptions1 == null)
                break label1080;
            }
            label1080: for (int i5 = localOptions1.outHeight; ; i5 = -1)
            {
              arrayOfObject5[3] = Integer.valueOf(i5);
              z.i("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "createThumbNail big pic no compress, calculatedQuality:%d, origLen:%d oriWidth:%d oriHeight:%d", arrayOfObject5);
              com.tencent.mm.sdk.platformtools.p.f(paramString1, str2, false);
              break;
              i4 = -1;
              break label1023;
            }
            label1086: Object[] arrayOfObject6 = new Object[1];
            arrayOfObject6[0] = Long.valueOf(ch.ad(l1));
            z.v("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "test rotate :%d", arrayOfObject6);
            l locall;
            String str4;
            if (paramInt4 <= 0)
            {
              locall = new l();
              locall.db(-1);
              int i6 = this.dxz;
              this.dxz = (i6 + 1);
              locall.P(i6);
              str4 = com.tencent.mm.a.f.d(System.currentTimeMillis().getBytes());
              if (paramInt4 <= 0)
                break label1303;
            }
            String str6;
            long l3;
            label1303: for (String str5 = locall.xO(); ; str5 = "THUMBNAIL_DIRPATH://th_" + str4)
            {
              str6 = f(str5, "th_", "");
              if (!paramBoolean)
                break label1539;
              if ((!ch.jb(paramString2)) && (com.tencent.mm.a.c.ac(paramString2)))
                break label1734;
              int i7 = i.wT(str2);
              l3 = ch.CN();
              if (i7 <= 0)
                break label1326;
              if (i.a(str2, 2000, 2000, Bitmap.CompressFormat.JPEG, 90, f(str4, "th_", ""), i7, i, paramPInt1, paramPInt2))
                break label1403;
              z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "createLongPictureThumbNail fail");
              return null;
              locall = dT(paramInt4);
              break;
            }
            label1326: long l4 = ch.CN();
            if (!i.a(str2, 100, 100, Bitmap.CompressFormat.JPEG, 90, f(str4, "th_", ""), true, paramPInt1, paramPInt2))
            {
              z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "createThumbNail thumb fail");
              return null;
            }
            Object[] arrayOfObject8 = new Object[1];
            arrayOfObject8[0] = Long.valueOf(ch.ad(l4));
            z.v("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "test decode thumb img:%d", arrayOfObject8);
            label1403: File localFile = new File(str6);
            label1539: long l2;
            if (localFile.exists())
            {
              Object[] arrayOfObject9 = new Object[1];
              arrayOfObject9[0] = Long.valueOf(localFile.length());
              z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", " thumbSize: %d", arrayOfObject9);
              com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
              Object[] arrayOfObject10 = new Object[4];
              arrayOfObject10[0] = Long.valueOf(localFile.length());
              arrayOfObject10[1] = Integer.valueOf(com.tencent.mm.a.c.ab(str2));
              arrayOfObject10[2] = Integer.valueOf(90);
              arrayOfObject10[3] = Long.valueOf(ch.ad(l3));
              localn.d(10921, arrayOfObject10);
              z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "insert: thumbName = " + str5);
              if ((paramInt1 == 0) && (paramBoolean))
              {
                l2 = ch.CN();
                if ((MMNativeJpeg.IsJpegFile(str2)) && (!MMNativeJpeg.isProgressive(str2)))
                {
                  z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "file [%s] not progressive jpeg. need convert.", new Object[] { str2 });
                  if (MMNativeJpeg.convertToProgressive(str2, k))
                    break label1746;
                  z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "convert to progressive failed.");
                }
              }
            }
            while (true)
            {
              Object[] arrayOfObject7 = new Object[1];
              arrayOfObject7[0] = Long.valueOf(ch.ad(l2));
              z.v("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "test decode progress jpeg :%d", arrayOfObject7);
              locall.setSource(paramInt2);
              if (paramBoolean)
              {
                locall.gM(str1 + ".jpg");
                locall.gN(str5);
                locall.cZ(com.tencent.mm.a.c.ab(str2));
              }
              locall.dQ((int)ch.CL());
              z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "insert: compress img size = " + locall.sp());
              return locall;
              z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", " thumbImg not exits");
              break;
              label1734: com.tencent.mm.sdk.platformtools.p.f(paramString2, str6, false);
              break;
              label1746: z.i("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "convert to progressive successed.");
            }
          }
          catch (Exception localException2)
          {
            while (true)
              n = 0;
          }
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        int n;
        int j = 0;
        continue;
        label1773: int i8 = m;
        int m = n;
        continue;
        label1784: int i13 = i3;
        int i3 = i2;
        int i2 = i13;
        continue;
        label1799: boolean bool1 = true;
        continue;
        int k = j;
      }
    }
  }

  private l a(String paramString, boolean paramBoolean, int paramInt1, int paramInt2, PInt paramPInt1, PInt paramPInt2)
  {
    return a(paramString, 0, paramBoolean, paramInt1, paramInt2, paramPInt1, paramPInt2, "", -1);
  }

  private l a(String paramString1, boolean paramBoolean, int paramInt1, int paramInt2, PInt paramPInt1, PInt paramPInt2, String paramString2)
  {
    z.i("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "fromPathToImgInfoJustThumb, orig:%s", new Object[] { paramString1 });
    if (!com.tencent.mm.a.c.ac(paramString1))
    {
      z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "file not exit:%s", new Object[] { paramString1 });
      return null;
    }
    int i = com.tencent.mm.sdk.platformtools.f.iM(paramString1) + paramInt2 * 90;
    String str1 = com.tencent.mm.a.f.d(System.currentTimeMillis().getBytes());
    String str2 = "THUMBNAIL_DIRPATH://th_" + str1;
    String str3 = f(str2, "th_", "");
    if (paramBoolean)
    {
      if ((!ch.jb(paramString2)) && (com.tencent.mm.a.c.ac(paramString2)))
        break label590;
      int m = i.wT(paramString1);
      long l2 = ch.CN();
      if (m > 0)
      {
        if (!i.a(paramString1, 2000, 2000, Bitmap.CompressFormat.JPEG, 90, f(str1, "th_", ""), m, i, paramPInt1, paramPInt2))
        {
          z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "createLongPictureThumbNail fail");
          return null;
        }
      }
      else
      {
        long l3 = ch.CN();
        if (!i.a(paramString1, 100, 100, Bitmap.CompressFormat.JPEG, 100, f(str1, "th_", ""), true, paramPInt1, paramPInt2))
        {
          z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "createThumbNail thumb fail");
          return null;
        }
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Long.valueOf(ch.ad(l3));
        z.v("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "test decode thumb img:%d", arrayOfObject2);
      }
      File localFile = new File(str3);
      if (!localFile.exists())
        break label579;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Long.valueOf(localFile.length());
      z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", " thumbSize: %d", arrayOfObject3);
      com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject4 = new Object[4];
      arrayOfObject4[0] = Long.valueOf(localFile.length());
      arrayOfObject4[1] = Integer.valueOf(com.tencent.mm.a.c.ab(paramString1));
      arrayOfObject4[2] = Integer.valueOf(90);
      arrayOfObject4[3] = Long.valueOf(ch.ad(l2));
      localn.d(10921, arrayOfObject4);
    }
    while (true)
    {
      z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "insert: thumbName = " + str2);
      long l1 = ch.CN();
      if ((i == 90) || (i == 270))
      {
        int j = paramPInt1.value;
        paramPInt1.value = paramPInt2.value;
        paramPInt2.value = j;
      }
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(ch.ad(l1));
      z.v("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "test rotate :%d", arrayOfObject1);
      l locall = new l();
      locall.db(-1);
      int k = this.dxz;
      this.dxz = (k + 1);
      locall.P(k);
      locall.setSource(paramInt1);
      if (paramBoolean)
      {
        locall.gN(str2);
        locall.cZ(com.tencent.mm.a.c.ab(paramString1));
      }
      locall.dQ((int)ch.CL());
      z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "insert: compress img size = " + locall.sp());
      return locall;
      label579: z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", " thumbImg not exits");
      continue;
      label590: com.tencent.mm.sdk.platformtools.p.f(paramString2, str3, false);
    }
  }

  private void a(ImageView paramImageView1, ImageView paramImageView2, View paramView, String paramString, float paramFloat, boolean paramBoolean, int paramInt)
  {
    int i = paramString.hashCode();
    int j = paramImageView1.hashCode();
    Iterator localIterator = this.dxs.iterator();
    while (localIterator.hasNext())
    {
      s locals2 = (s)localIterator.next();
      if (j == locals2.dxI)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(locals2.dxI);
        arrayOfObject[1] = locals2.url;
        z.i("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "setbitmapFromUri  [%d, %s] ", arrayOfObject);
        locals2.url = paramString;
        if (!this.dxw.contains(Integer.valueOf(i)))
        {
          this.dxw.add(Integer.valueOf(i));
          a(paramString, paramFloat, paramBoolean, paramInt);
        }
        return;
      }
    }
    this.dxt.put(Integer.valueOf(j), new WeakReference(paramImageView1));
    int n;
    if (paramImageView2 != null)
    {
      n = paramImageView2.hashCode();
      this.dxu.put(Integer.valueOf(n), new WeakReference(paramImageView2));
    }
    for (int k = n; ; k = 0)
    {
      int m;
      if (paramView != null)
      {
        m = paramView.hashCode();
        this.dxv.put(Integer.valueOf(m), new WeakReference(paramView));
      }
      while (true)
      {
        s locals1 = new s(j, paramString, k, m);
        this.dxs.add(locals1);
        if (this.dxw.contains(Integer.valueOf(i)))
          break;
        this.dxw.add(Integer.valueOf(i));
        a(paramString, paramFloat, paramBoolean, paramInt);
        return;
        m = 0;
      }
    }
  }

  private void a(String paramString, float paramFloat, boolean paramBoolean, int paramInt)
  {
    bg.qQ().n(new q(this, paramString, paramFloat, paramBoolean, paramInt));
  }

  private static void b(h paramh)
  {
    int i = 0;
    Cursor localCursor = paramh.rawQuery("PRAGMA table_info(ImgInfo2)", null);
    int j = 0;
    while (localCursor.moveToNext())
    {
      int k = localCursor.getColumnIndex("name");
      if (k >= 0)
      {
        String str = localCursor.getString(k);
        if ("hashdthumb".equals(str))
          j = 1;
        if ("iscomplete".equals(str))
          i = 1;
      }
    }
    localCursor.close();
    if (j == 0)
      paramh.bp("ImgInfo2", "Alter table ImgInfo2 add hashdthumb INT DEFAULT 0");
    if (i == 0)
      paramh.bp("ImgInfo2", "Alter table ImgInfo2 add iscomplete INT DEFAULT 1");
  }

  public static String gQ(String paramString)
  {
    return "THUMBNAIL_DIRPATH://th_" + paramString;
  }

  private String gT(String paramString)
  {
    String str;
    if ((paramString != null) && (this.dxy.containsKey(paramString)))
      str = (String)this.dxy.get(paramString);
    do
    {
      return str;
      str = gS(paramString);
    }
    while (ch.jb(str));
    this.dxy.put(paramString, str);
    return str;
  }

  public final l Q(long paramLong)
  {
    l locall = new l();
    h localh = this.dmb;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    Cursor localCursor = localh.a("ImgInfo2", null, "id=?", arrayOfString, null, null);
    if ((localCursor != null) && (localCursor.moveToFirst()))
      locall.b(localCursor);
    localCursor.close();
    return locall;
  }

  public final void R(long paramLong)
  {
    l locall1 = S(paramLong);
    if (locall1.kl() != paramLong);
    do
    {
      return;
      com.tencent.mm.a.c.deleteFile(f(locall1.xN(), "", ""));
      com.tencent.mm.a.c.deleteFile(f(locall1.xO(), "", ""));
      com.tencent.mm.a.c.deleteFile(f(locall1.xO(), "", "") + "hd");
      h localh1 = this.dmb;
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = String.valueOf(paramLong);
      localh1.delete("ImgInfo2", "msgSvrId=?", arrayOfString1);
    }
    while (!locall1.xR());
    l locall2 = dT(locall1.xP());
    com.tencent.mm.a.c.deleteFile(f(locall2.xN(), "", ""));
    com.tencent.mm.a.c.deleteFile(f(locall2.xO(), "", ""));
    com.tencent.mm.a.c.deleteFile(f(locall2.xO(), "", "") + "hd");
    h localh2 = this.dmb;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = locall2.xM();
    localh2.delete("ImgInfo2", "id=?", arrayOfString2);
  }

  public final l S(long paramLong)
  {
    l locall = new l();
    h localh = this.dmb;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    Cursor localCursor = localh.a("ImgInfo2", null, "msgSvrId=?", arrayOfString, null, null);
    if ((localCursor != null) && (localCursor.moveToFirst()))
      locall.b(localCursor);
    localCursor.close();
    return locall;
  }

  public final l T(long paramLong)
  {
    l locall = new l();
    h localh = this.dmb;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    Cursor localCursor = localh.a("ImgInfo2", null, "msglocalid=?", arrayOfString, null, null);
    if ((localCursor != null) && (localCursor.moveToLast()))
      locall.b(localCursor);
    localCursor.close();
    return locall;
  }

  public final int a(long paramLong, l paraml)
  {
    ContentValues localContentValues = paraml.ir();
    h localh = this.dmb;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    int i = localh.update("ImgInfo2", localContentValues, "id=?", arrayOfString);
    if (i != -1)
      Bo();
    return i;
  }

  public final long a(int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, PString paramPString, PInt paramPInt1, PInt paramPInt2)
  {
    l locall4;
    long l;
    if (paramInt2 == 0)
    {
      locall4 = a(paramString, 0, true, paramInt3, paramInt4, paramPInt1, paramPInt2, paramPString.value, paramInt1);
      if (locall4 == null)
        l = -1L;
    }
    do
    {
      do
      {
        return l;
        paramPString.value = locall4.xO();
        l = a(paramInt1, locall4);
      }
      while (l == -1L);
      Bo();
      return l;
      if (paramInt2 != 1)
        break;
      l locall1 = dT(paramInt1);
      l locall2 = a(paramString, 1, true, paramInt3, paramInt4, paramPInt1, paramPInt2, paramPString.value, locall1.xP());
      if (locall2 == null)
        return -1L;
      paramPString.value = locall2.xO();
      locall2.O(0L);
      locall2.p(0L);
      a(locall1.xP(), locall2);
      l locall3 = a(paramString, 0, false, paramInt3, paramInt4, new PInt(), new PInt(), "", paramInt1);
      locall3.gM(locall2.xN());
      locall3.gN(locall2.xO());
      locall3.cZ(0);
      l = a(paramInt1, locall3);
    }
    while (l == -1L);
    Bo();
    return l;
    Assert.assertTrue(false);
    return 0L;
  }

  public final long a(String paramString, int paramInt1, int paramInt2, int paramInt3, PString paramPString, PInt paramPInt1, PInt paramPInt2)
  {
    l locall3;
    long l2;
    if (paramInt1 == 0)
    {
      locall3 = a(paramString, 0, paramInt2, paramInt3, paramPInt1, paramPInt2, paramPString.value);
      if (locall3 == null)
        l2 = -1L;
    }
    do
    {
      do
      {
        return l2;
        paramPString.value = locall3.xO();
        l2 = this.dmb.insert("ImgInfo2", "id", locall3.ir());
      }
      while (l2 == -1L);
      Bo();
      return l2;
      if (paramInt1 != 1)
        break;
      l locall1 = a(paramString, 1, paramInt2, paramInt3, paramPInt1, paramPInt2, paramPString.value);
      if (locall1 == null)
        return -1L;
      paramPString.value = locall1.xO();
      locall1.O(0L);
      locall1.p(0L);
      long l1 = this.dmb.insert("ImgInfo2", "id", locall1.ir());
      l locall2 = a(paramString, false, paramInt2, paramInt3, new PInt(), new PInt());
      locall2.dR((int)l1);
      locall2.gM(locall1.xN());
      locall2.gN(locall1.xO());
      locall2.cZ(0);
      l2 = this.dmb.insert("ImgInfo2", "id", locall2.ir());
    }
    while (l2 == -1L);
    Bo();
    return l2;
    Assert.assertTrue(false);
    return 0L;
  }

  public final long a(String paramString, int paramInt1, int paramInt2, PString paramPString, PInt paramPInt1, PInt paramPInt2)
  {
    l locall = a(paramString, true, paramInt1, paramInt2, paramPInt1, paramPInt2);
    long l;
    if (locall == null)
      l = -1L;
    do
    {
      return l;
      locall.setOffset(locall.sp());
      paramPString.value = locall.xO();
      l = this.dmb.insert("ImgInfo2", "id", locall.ir());
    }
    while (l == -1L);
    Bo();
    return l;
  }

  public final long a(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean, String paramString1, int paramInt, String paramString2, PString paramPString, PInt paramPInt1, PInt paramPInt2)
  {
    String str1 = "SERVERID://" + paramLong;
    String str2 = com.tencent.mm.a.f.d(str1.getBytes());
    Bitmap localBitmap1;
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length >= 0))
    {
      localBitmap1 = i.cB(paramArrayOfByte);
      if (localBitmap1 == null)
        z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "create decodeByteArray failed: " + new String(paramArrayOfByte));
      if ((paramBoolean) || (localBitmap1 == null));
    }
    try
    {
      Bitmap localBitmap2 = i.a(localBitmap1, 200, 200);
      paramPInt1.value = localBitmap2.getWidth();
      paramPInt2.value = localBitmap2.getHeight();
      i.a(localBitmap2, 90, Bitmap.CompressFormat.JPEG, f(str2, "th_", ""), true);
      locall = new l();
      if (!ch.jb(paramString1))
      {
        locall.setOffset(paramInt);
        locall.cZ(paramInt);
        locall.db(-1);
        int i = this.dxz;
        this.dxz = (i + 1);
        locall.P(i);
        locall.gM(paramString1);
        locall.gN("THUMBNAIL_DIRPATH://th_" + str2);
        paramPString.value = locall.xO();
        if (paramBoolean)
        {
          locall.p(0L);
          locall.gO(paramString2);
          locall.dQ((int)ch.CL());
          long l = this.dmb.insert("ImgInfo2", "id", locall.ir());
          if (l != -1L)
            Bo();
          return l;
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        l locall;
        z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "create thumbnail from byte failed: " + str2 + " " + new String(paramArrayOfByte));
        continue;
        locall.p(paramLong);
        continue;
        paramString1 = str1;
      }
    }
  }

  public final long a(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean, String paramString, PString paramPString, PInt paramPInt1, PInt paramPInt2)
  {
    return a(paramArrayOfByte, paramLong, paramBoolean, "", 0, paramString, paramPString, paramPInt1, paramPInt2);
  }

  public final Bitmap a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    if (paramBoolean);
    for (String str = "location_backgroup_key_from"; ; str = "location_backgroup_key_tor")
    {
      Bitmap localBitmap = (Bitmap)this.dxr.get(str);
      if ((localBitmap == null) || (localBitmap.isRecycled()))
      {
        localBitmap = i.j(paramInt1, paramInt2, paramInt3, paramInt4);
        this.dxr.b(str, localBitmap);
      }
      return localBitmap;
    }
  }

  public final Bitmap a(long paramLong, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (paramBoolean);
    for (String str = "location_backgroup_key_from" + paramLong; ; str = "location_backgroup_key_tor" + paramLong)
    {
      Bitmap localBitmap = (Bitmap)this.dxr.get(str);
      if ((localBitmap == null) || (localBitmap.isRecycled()))
      {
        localBitmap = i.d(paramString, paramInt1, paramInt2, paramInt3);
        this.dxr.b(str, localBitmap);
      }
      return localBitmap;
    }
  }

  public final Bitmap a(String paramString, float paramFloat, Context paramContext)
  {
    return a(paramString, paramFloat, paramContext, -1);
  }

  public final Bitmap a(String paramString, float paramFloat, Context paramContext, int paramInt)
  {
    Bitmap localBitmap1;
    if ((paramString == null) || (paramString.length() <= 0))
      localBitmap1 = null;
    String str;
    do
    {
      return localBitmap1;
      str = paramString.trim();
      localBitmap1 = (Bitmap)this.dxr.get(str);
    }
    while ((localBitmap1 != null) && (!localBitmap1.isRecycled()));
    Bitmap localBitmap2 = com.tencent.mm.sdk.platformtools.e.c(str, paramFloat);
    if (localBitmap2 != null)
    {
      int i = localBitmap2.getWidth();
      int j = localBitmap2.getHeight();
      int k = com.tencent.mm.sdk.platformtools.e.a(paramContext, 120.0F);
      float f = i / k;
      Bitmap localBitmap3 = Bitmap.createScaledBitmap(localBitmap2, k, (int)(j / f), true);
      if (paramInt != -1)
        localBitmap3 = i.a(localBitmap3, paramInt);
      if (localBitmap2 != localBitmap3)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localBitmap2.toString();
        z.i("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "[getVideoThumb] bitmap:%s", arrayOfObject);
        localBitmap2.recycle();
      }
      z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "cached file " + str);
      this.dxr.b(str, localBitmap3);
      return localBitmap3;
    }
    return localBitmap2;
  }

  public final Bitmap a(String paramString, float paramFloat, boolean paramBoolean)
  {
    return a(paramString, paramFloat, paramBoolean, false, -1);
  }

  public final Bitmap a(String paramString, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    return a(paramString, false, paramFloat, paramBoolean1, false, paramBoolean2, paramInt);
  }

  public final Bitmap a(String paramString, boolean paramBoolean1, float paramFloat, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt)
  {
    return a(paramString, paramBoolean1, paramFloat, paramBoolean2, paramBoolean3, paramBoolean4, paramInt, true);
  }

  public final String a(byte[] paramArrayOfByte, boolean paramBoolean, Bitmap.CompressFormat paramCompressFormat)
  {
    int i = 150;
    if (ch.B(paramArrayOfByte))
    {
      z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "save dir thumb error, thumbBuf is null");
      return null;
    }
    String str1 = com.tencent.mm.a.f.d(ch.CM().getBytes());
    String str2 = f(str1, "th_", "");
    String str3 = str2 + ".tmp";
    z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "saveDirThumb, fullPath = " + str2);
    while (true)
    {
      try
      {
        FileOutputStream localFileOutputStream = new FileOutputStream(str3);
        localFileOutputStream.write(paramArrayOfByte);
        localFileOutputStream.flush();
        localFileOutputStream.close();
        int j;
        if (paramBoolean)
        {
          j = i;
          break label341;
          i.a(i.a(str3, j, i, false), 90, paramCompressFormat, str2, true);
          File localFile3;
          return "THUMBNAIL_DIRPATH://th_" + str1;
        }
        else
        {
          j = 100;
          break label341;
          i = 100;
          continue;
        }
      }
      catch (Exception localException)
      {
        z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "create thumbnail from byte failed: th_" + str1 + ", ex = " + localException.getMessage());
        File localFile2;
        return null;
      }
      finally
      {
        File localFile1 = new File(str3);
        if (localFile1.exists())
        {
          z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "create thumbnail, delete tmp file");
          localFile1.delete();
        }
      }
      label341: if (!paramBoolean);
    }
  }

  public final HashMap a(Long[] paramArrayOfLong)
  {
    int i = 1;
    int j = paramArrayOfLong.length;
    String str1 = "(";
    int k = 0;
    if (k < j)
    {
      long l = paramArrayOfLong[k].longValue();
      StringBuilder localStringBuilder = new StringBuilder().append(str1);
      if (i != 0);
      for (Object localObject = Long.valueOf(l); ; localObject = "," + l)
      {
        str1 = localObject;
        k++;
        i = 0;
        break;
      }
    }
    String str2 = str1 + ")";
    Cursor localCursor = this.dmb.a("ImgInfo2", null, "msgSvrId in " + str2, null, null, null);
    HashMap localHashMap = new HashMap();
    while (localCursor.moveToNext())
    {
      l locall = new l();
      locall.b(localCursor);
      localHashMap.put(Long.valueOf(locall.kl()), locall);
    }
    localCursor.close();
    return localHashMap;
  }

  public final boolean a(ImageView paramImageView1, String paramString, float paramFloat, int paramInt1, int paramInt2, int paramInt3, ImageView paramImageView2, int paramInt4)
  {
    return a(paramImageView1, paramString, paramFloat, paramInt1, paramInt2, true, paramInt3, paramImageView2, paramInt4, 0, false, null);
  }

  public final boolean a(ImageView paramImageView1, String paramString, float paramFloat, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, ImageView paramImageView2, int paramInt4, int paramInt5, boolean paramBoolean2, View paramView)
  {
    if (ch.jb(paramString))
    {
      z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "invalid uri is %s", new Object[] { paramString });
      return false;
    }
    boolean bool;
    String str;
    synchronized (this.dxy)
    {
      bool = this.dxy.containsKey(paramString);
      str = gT(paramString);
      if (ch.jb(str))
      {
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = ch.ja(paramString);
        z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "getFullThumbPathByCache uri is null, uri:%s", arrayOfObject4);
        return false;
      }
    }
    if ((!bool) && (!str.endsWith("hd")) && (com.tencent.mm.a.c.ac(str + "hd")))
    {
      this.dxy.put(paramString, str + "hd");
      str = str + "hd";
    }
    Bitmap localBitmap3;
    int i;
    Bitmap localBitmap1;
    if (str.endsWith("hd"))
    {
      localBitmap3 = (Bitmap)this.dxr.get(str);
      if (localBitmap3 == null)
      {
        a(paramImageView1, paramImageView2, paramView, str, paramFloat, true, paramInt3);
        str = str.substring(0, -2 + str.length());
        i = 1;
        localBitmap1 = localBitmap3;
      }
    }
    while (true)
    {
      if (localBitmap1 == null);
      label398: label416: label962: label1094: for (Bitmap localBitmap2 = (Bitmap)this.dxr.get(str); ; localBitmap2 = localBitmap1)
      {
        if ((localBitmap2 != null) && (!localBitmap2.isRecycled()))
        {
          Object[] arrayOfObject3 = new Object[2];
          arrayOfObject3[0] = Integer.valueOf(localBitmap2.getWidth());
          arrayOfObject3[1] = Integer.valueOf(localBitmap2.getHeight());
          z.i("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "[setbitmapFromUri] bitmap width %d,height %d", arrayOfObject3);
          paramImageView1.setBackgroundDrawable(null);
          ax.a(localBitmap2, paramImageView1);
          FrameLayout.LayoutParams localLayoutParams3;
          label363: label374: int i3;
          int i4;
          FrameLayout.LayoutParams localLayoutParams4;
          label468: FrameLayout.LayoutParams localLayoutParams5;
          if (paramImageView1.getLayoutParams().width != -2)
          {
            localLayoutParams3 = this.dxA;
            if (paramInt5 != 0)
              break label588;
            localLayoutParams3.gravity = 5;
            paramImageView1.setLayoutParams(localLayoutParams3);
            if (localBitmap2.getWidth() < 2 * localBitmap2.getHeight())
              break label603;
            i3 = 1;
            if (localBitmap2.getHeight() < 2 * localBitmap2.getWidth())
              break label609;
            i4 = 1;
            if ((i3 != 0) || (i4 != 0))
              paramImageView1.setScaleType(ImageView.ScaleType.CENTER);
            if (paramImageView2 != null)
            {
              localLayoutParams4 = new FrameLayout.LayoutParams(localBitmap2.getWidth(), localBitmap2.getHeight());
              if (paramInt5 != 0)
                break label615;
              localLayoutParams4.gravity = 5;
              paramImageView2.setLayoutParams(localLayoutParams4);
            }
            if (paramView != null)
            {
              localLayoutParams5 = new FrameLayout.LayoutParams(localBitmap2.getWidth(), localBitmap2.getHeight());
              if (paramInt5 != 0)
                break label630;
              localLayoutParams5.gravity = 5;
            }
          }
          while (true)
          {
            paramView.setLayoutParams(localLayoutParams5);
            return true;
            if (this.dxr.remove(str.substring(0, -2 + str.length())) != null)
              z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "remove low quality thumb from cacheMap, path: " + str);
            localBitmap1 = localBitmap3;
            i = 0;
            break;
            localLayoutParams3 = (FrameLayout.LayoutParams)paramImageView1.getLayoutParams();
            break label363;
            label588: if (paramInt5 != 1)
              break label374;
            localLayoutParams3.gravity = 3;
            break label374;
            label603: i3 = 0;
            break label398;
            label609: i4 = 0;
            break label416;
            label615: if (paramInt5 != 1)
              break label468;
            localLayoutParams4.gravity = 3;
            break label468;
            label630: if (paramInt5 == 1)
              localLayoutParams5.gravity = 3;
          }
        }
        float f;
        int k;
        int m;
        label720: int n;
        label733: int i1;
        if ((paramInt4 > 0) && (paramBoolean2))
        {
          paramImageView1.setBackgroundResource(paramInt4);
          paramImageView1.setImageDrawable(null);
          if ((paramInt1 >= 200) || (paramInt2 >= 200))
            if (paramInt2 > paramInt1)
            {
              f = 200.0F / paramInt2;
              k = (int)(f * paramInt1);
              m = (int)(f * paramInt2);
              if (k <= 0)
                break label904;
              n = (int)(paramFloat * k);
              if (m <= 0)
                break label911;
              i1 = (int)(paramFloat * m);
              if (n >= 50.0F * paramFloat)
                break label1123;
              Object[] arrayOfObject2 = new Object[1];
              arrayOfObject2[0] = Integer.valueOf(n);
              z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "pic to small width is %d ", arrayOfObject2);
            }
        }
        label849: label1123: for (int i2 = (int)(50.0F * paramFloat); ; i2 = n)
        {
          if (i1 < 50.0F * paramFloat)
          {
            Object[] arrayOfObject1 = new Object[1];
            arrayOfObject1[0] = Integer.valueOf(i1);
            z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "pic to small height is %d ", arrayOfObject1);
            i1 = (int)(50.0F * paramFloat);
          }
          FrameLayout.LayoutParams localLayoutParams2 = new FrameLayout.LayoutParams(i2, i1);
          FrameLayout.LayoutParams localLayoutParams1;
          if (paramInt5 == 0)
          {
            localLayoutParams2.gravity = 5;
            if (paramView != null)
              paramView.setLayoutParams(localLayoutParams2);
            localLayoutParams1 = localLayoutParams2;
          }
          while (true)
          {
            paramImageView1.setLayoutParams(localLayoutParams1);
            if (i == 0)
              a(paramImageView1, paramImageView2, paramView, str, paramFloat, true, paramInt3);
            return false;
            f = 200.0F / paramInt1;
            break;
            k = 100;
            break label720;
            m = 75;
            break label733;
            if (paramInt1 > 0)
            {
              n = (int)(1.25F * (paramFloat * paramInt1));
              if (paramInt2 <= 0)
                break label962;
            }
            while (true)
            {
              i1 = (int)(1.25F * (paramFloat * paramInt2));
              break;
              paramInt1 = 100;
              break label923;
              paramInt2 = 75;
            }
            if (paramInt5 != 1)
              break label849;
            localLayoutParams2.gravity = 3;
            break label849;
            if (paramBoolean2)
            {
              if ((this.dxB == null) || (this.dxB.get() == null))
                this.dxB = new SoftReference(new ColorDrawable(-1118482));
              paramImageView1.setImageDrawable((ColorDrawable)this.dxB.get());
              int j;
              if (paramInt1 > 0)
              {
                j = (int)(1.25F * (paramFloat * paramInt1));
                if (paramInt2 <= 0)
                  break label1094;
              }
              while (true)
              {
                localLayoutParams1 = new FrameLayout.LayoutParams(j, (int)(1.25F * (paramFloat * paramInt2)));
                break;
                paramInt1 = 100;
                break label1046;
                paramInt2 = 75;
              }
            }
            paramImageView1.setImageResource(paramInt4);
            localLayoutParams1 = new FrameLayout.LayoutParams(this.dxA);
          }
        }
      }
      label904: label911: label923: localBitmap1 = null;
      label1046: i = 0;
    }
  }

  public final boolean a(ar paramar, int paramInt1, int paramInt2)
  {
    Object localObject;
    if (paramar == null)
    {
      z.w("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "[getBigPicPath] msg is null.");
      localObject = null;
    }
    while (true)
    {
      String str1;
      if (!ch.jb((String)localObject))
      {
        return a((String)localObject, paramar.kp(), paramInt1, paramInt2);
        long l = System.currentTimeMillis();
        l locall1;
        if (paramar.jK() == 1)
        {
          locall1 = ap.yg().T(paramar.kk());
          if (locall1.xM() != 0L);
        }
        else
        {
          locall1 = ap.yg().S(paramar.kl());
        }
        if (bg.qW().isSDCardAvailable())
        {
          if (paramar.jK() == 1)
          {
            str2 = m.c(locall1);
            str3 = ap.yg().f(str2, "", "");
            if ((str2 != null) && (str2.length() > 0) && (com.tencent.mm.a.c.ac(str3)))
            {
              localObject = str3;
              continue;
            }
            str4 = locall1.xN();
            localObject = ap.yg().f(str4, "", "");
            if ((str4 != null) && (str4.length() > 0) && (com.tencent.mm.a.c.ac((String)localObject)))
              continue;
          }
        }
        else
        {
          while (!locall1.xQ())
          {
            String str2;
            String str3;
            String str4;
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = (System.currentTimeMillis() - l);
            z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "getBigPicPath use time:%s", arrayOfObject);
            localObject = null;
            break;
          }
          str1 = locall1.xN();
          if (locall1.xR())
          {
            l locall2 = m.a(locall1);
            if ((locall2 != null) && (locall2.xM() > 0L) && (locall2.xQ()) && (com.tencent.mm.a.c.ac(ap.yg().f(locall2.xN(), "", ""))))
              localObject = locall2.xN();
          }
        }
      }
      else
      {
        return false;
        localObject = str1;
      }
    }
  }

  public final boolean a(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "createHDThumbNail bigPicPath%s thumbPath%s", new Object[] { paramString1, paramString2 });
    long l = System.currentTimeMillis();
    float f1 = a.getDensity(ak.getContext());
    if ((ch.jb(paramString1)) || (ch.jb(paramString2)))
      return false;
    String str1 = gT(paramString2);
    if (ch.jb(str1))
      return false;
    String str3;
    if (!str1.endsWith("hd"))
      str3 = str1 + "hd";
    BitmapFactory.Options localOptions;
    String str2;
    for (Object localObject1 = str1; ; localObject1 = str2)
    {
      localOptions = i.wS((String)localObject1);
      if (localOptions != null)
        break;
      return false;
      str2 = str1.substring(0, -2 + str1.length());
      str3 = str1;
    }
    int i = (int)(1.25F * (f1 * localOptions.outWidth));
    int j = (int)(1.25F * (f1 * localOptions.outHeight));
    float f2;
    int k;
    int m;
    if ((i >= 200.0F * f1) || (j >= 200.0F * f1))
      if (j > i)
      {
        f2 = 200.0F * f1 / j;
        k = (int)(f2 * i);
        m = (int)(f2 * j);
      }
    while (true)
    {
      while (true)
      {
        int n = Math.max(k, i);
        int i1 = Math.max(m, j);
        if (paramInt2 == 0);
        try
        {
          boolean bool3 = i.a(paramString1, i1, n, Bitmap.CompressFormat.JPEG, 80, str3, true, new PInt(), new PInt(), true);
          boolean bool1;
          for (boolean bool2 = bool3; ; bool2 = bool1)
          {
            Object[] arrayOfObject2 = new Object[4];
            arrayOfObject2[0] = (System.currentTimeMillis() - l);
            arrayOfObject2[1] = Integer.valueOf(i1);
            arrayOfObject2[2] = Integer.valueOf(n);
            arrayOfObject2[3] = Boolean.valueOf(bool2);
            z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "createHDThumbNail user time %s, height %d, width %d, hasHDThumb:%b", arrayOfObject2);
            float f3 = a.getDensity(ak.getContext());
            a((String)localObject1, true, f3, true, false, true, paramInt1, false);
            synchronized (this.dxy)
            {
              if ((this.dxy.containsKey(paramString2)) && (!((String)this.dxy.get(paramString2)).endsWith("hd")))
                this.dxy.put(paramString2, str3);
              return bool2;
            }
            f2 = 200.0F * f1 / i;
            break;
            Bitmap.CompressFormat localCompressFormat = Bitmap.CompressFormat.JPEG;
            PInt localPInt1 = new PInt();
            PInt localPInt2 = new PInt();
            bool1 = i.a(paramString1, i1, n, localCompressFormat, str3, localPInt1, localPInt2);
          }
        }
        catch (Exception localException)
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = localException.toString();
          z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "create hd thumbnail failed. %s", arrayOfObject1);
          return false;
        }
      }
      m = j;
      k = i;
    }
  }

  public final long b(String paramString, int paramInt1, int paramInt2, int paramInt3, PString paramPString, PInt paramPInt1, PInt paramPInt2)
  {
    l locall3;
    long l2;
    if (paramInt1 == 0)
    {
      locall3 = a(paramString, true, paramInt2, paramInt3, paramPInt1, paramPInt2, paramPString.value);
      if (locall3 == null)
        l2 = -1L;
    }
    do
    {
      do
      {
        return l2;
        paramPString.value = locall3.xO();
        l2 = this.dmb.insert("ImgInfo2", "id", locall3.ir());
      }
      while (l2 == -1L);
      Bo();
      return l2;
      if (paramInt1 != 1)
        break;
      l locall1 = a(paramString, true, paramInt2, paramInt3, paramPInt1, paramPInt2, paramPString.value);
      if (locall1 == null)
        return -1L;
      paramPString.value = locall1.xO();
      locall1.O(0L);
      locall1.p(0L);
      long l1 = this.dmb.insert("ImgInfo2", "id", locall1.ir());
      l locall2 = a(paramString, false, paramInt2, paramInt3, new PInt(), new PInt(), "");
      locall2.dR((int)l1);
      locall2.gM(locall1.xN());
      locall2.gN(locall1.xO());
      locall2.cZ(locall2.sp());
      l2 = this.dmb.insert("ImgInfo2", "id", locall2.ir());
    }
    while (l2 == -1L);
    Bo();
    return l2;
    Assert.assertTrue(false);
    return 0L;
  }

  public final Bitmap b(String paramString, float paramFloat)
  {
    return a(paramString, paramFloat, true);
  }

  public final Bitmap b(String paramString, float paramFloat, boolean paramBoolean)
  {
    return a(paramString, true, paramFloat, false, paramBoolean, false, 0);
  }

  public final HashMap b(Long[] paramArrayOfLong)
  {
    int i = 1;
    int j = paramArrayOfLong.length;
    String str1 = "(";
    int k = 0;
    if (k < j)
    {
      long l = paramArrayOfLong[k].longValue();
      StringBuilder localStringBuilder = new StringBuilder().append(str1);
      if (i != 0);
      for (Object localObject = Long.valueOf(l); ; localObject = "," + l)
      {
        str1 = localObject;
        k++;
        i = 0;
        break;
      }
    }
    String str2 = str1 + ")";
    Cursor localCursor = this.dmb.a("ImgInfo2", null, "msglocalid in " + str2, null, null, null);
    HashMap localHashMap = new HashMap();
    while (localCursor.moveToNext())
    {
      l locall = new l();
      locall.b(localCursor);
      localHashMap.put(Long.valueOf(locall.kl()), locall);
    }
    localCursor.close();
    return localHashMap;
  }

  public final String d(l paraml)
  {
    if (paraml == null);
    while (!paraml.xR())
      return null;
    h localh = this.dmb;
    String[] arrayOfString1 = { "bigImgPath" };
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = paraml.xP();
    Cursor localCursor = localh.a("ImgInfo2", arrayOfString1, "id=? and totalLen = offset", arrayOfString2, null, null);
    boolean bool = localCursor.moveToFirst();
    String str = null;
    if (bool)
      str = localCursor.getString(0);
    localCursor.close();
    return str;
  }

  public final void dS(int paramInt)
  {
    l locall1 = dT(paramInt);
    if (locall1.xM() != paramInt);
    do
    {
      return;
      com.tencent.mm.a.c.deleteFile(f(locall1.xN(), "", ""));
      com.tencent.mm.a.c.deleteFile(f(locall1.xO(), "", ""));
      com.tencent.mm.a.c.deleteFile(f(locall1.xO(), "", "") + "hd");
      h localh1 = this.dmb;
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = String.valueOf(paramInt);
      localh1.delete("ImgInfo2", "id=?", arrayOfString1);
    }
    while (!locall1.xR());
    l locall2 = dT(locall1.xP());
    com.tencent.mm.a.c.deleteFile(f(locall2.xN(), "", ""));
    com.tencent.mm.a.c.deleteFile(f(locall2.xO(), "", ""));
    com.tencent.mm.a.c.deleteFile(f(locall2.xO(), "", "") + "hd");
    h localh2 = this.dmb;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = locall2.xM();
    localh2.delete("ImgInfo2", "id=?", arrayOfString2);
  }

  public final l dT(int paramInt)
  {
    l locall = new l();
    h localh = this.dmb;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramInt);
    Cursor localCursor = localh.a("ImgInfo2", null, "id=?", arrayOfString, null, null);
    if ((localCursor != null) && (localCursor.moveToFirst()))
      locall.b(localCursor);
    localCursor.close();
    return locall;
  }

  // ERROR //
  public final l dU(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 103	com/tencent/mm/y/n:dmb	Lcom/tencent/mm/as/h;
    //   6: astore 8
    //   8: iconst_1
    //   9: anewarray 31	java/lang/String
    //   12: astore 9
    //   14: aload 9
    //   16: iconst_0
    //   17: iload_1
    //   18: invokestatic 1088	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   21: aastore
    //   22: aload 8
    //   24: ldc 115
    //   26: aconst_null
    //   27: ldc_w 1091
    //   30: aload 9
    //   32: aconst_null
    //   33: aconst_null
    //   34: invokevirtual 123	com/tencent/mm/as/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore 10
    //   39: aload 10
    //   41: ifnull +146 -> 187
    //   44: aload 10
    //   46: invokeinterface 129 1 0
    //   51: ifeq +136 -> 187
    //   54: new 450	com/tencent/mm/y/l
    //   57: dup
    //   58: invokespecial 451	com/tencent/mm/y/l:<init>	()V
    //   61: astore 12
    //   63: aload 12
    //   65: aload 10
    //   67: invokevirtual 734	com/tencent/mm/y/l:b	(Landroid/database/Cursor;)V
    //   70: aload 12
    //   72: astore 6
    //   74: aload 10
    //   76: ifnull +10 -> 86
    //   79: aload 10
    //   81: invokeinterface 136 1 0
    //   86: aload 6
    //   88: areturn
    //   89: astore 4
    //   91: aload 4
    //   93: astore 5
    //   95: aconst_null
    //   96: astore 6
    //   98: iconst_1
    //   99: anewarray 174	java/lang/Object
    //   102: astore 7
    //   104: aload 7
    //   106: iconst_0
    //   107: aload 5
    //   109: invokevirtual 1073	java/lang/Exception:toString	()Ljava/lang/String;
    //   112: aastore
    //   113: ldc 138
    //   115: ldc_w 1093
    //   118: aload 7
    //   120: invokestatic 1095	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: aload_2
    //   124: ifnull -38 -> 86
    //   127: aload_2
    //   128: invokeinterface 136 1 0
    //   133: aload 6
    //   135: areturn
    //   136: astore_3
    //   137: aload_2
    //   138: ifnull +9 -> 147
    //   141: aload_2
    //   142: invokeinterface 136 1 0
    //   147: aload_3
    //   148: athrow
    //   149: astore_3
    //   150: aload 10
    //   152: astore_2
    //   153: goto -16 -> 137
    //   156: astore 11
    //   158: aload 11
    //   160: astore 5
    //   162: aload 10
    //   164: astore_2
    //   165: aconst_null
    //   166: astore 6
    //   168: goto -70 -> 98
    //   171: astore 13
    //   173: aload 10
    //   175: astore_2
    //   176: aload 13
    //   178: astore 5
    //   180: aload 12
    //   182: astore 6
    //   184: goto -86 -> 98
    //   187: aconst_null
    //   188: astore 6
    //   190: goto -116 -> 74
    //
    // Exception table:
    //   from	to	target	type
    //   2	39	89	java/lang/Exception
    //   2	39	136	finally
    //   98	123	136	finally
    //   44	63	149	finally
    //   63	70	149	finally
    //   44	63	156	java/lang/Exception
    //   63	70	171	java/lang/Exception
  }

  public final String f(String paramString1, String paramString2, String paramString3)
  {
    if (ch.jb(paramString1))
      return null;
    Object localObject = "";
    String str3;
    if (paramString1.startsWith("SERVERID://"))
      str3 = paramString1.substring(11);
    while (true)
    {
      try
      {
        String str4 = S(Long.valueOf(str3).longValue()).xN();
        localObject = str4;
        if (paramString1.startsWith("THUMBNAIL_DIRPATH://"))
        {
          paramString1 = paramString1.substring(23);
          paramString2 = "th_";
        }
        String str1 = bg.qW().pa();
        String str2 = bg.qW().pb();
        if (ch.jb((String)localObject))
          return com.tencent.mm.sdk.platformtools.o.a(str1, str2, paramString2, paramString1, paramString3);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "read img buf failed: " + localNumberFormatException.getMessage());
        return null;
      }
      paramString1 = (String)localObject;
    }
  }

  public final String gP(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    Object localObject = "";
    String str3;
    if (paramString.startsWith("SERVERID://"))
      str3 = paramString.substring(11);
    while (true)
    {
      try
      {
        String str4 = S(Long.valueOf(str3).longValue()).xN();
        localObject = str4;
        String str1 = bg.qW().pa();
        String str2 = bg.qW().pb();
        if (ch.jb((String)localObject))
          return com.tencent.mm.sdk.platformtools.o.a(str1, str2, "th_", paramString, "");
      }
      catch (NumberFormatException localNumberFormatException)
      {
        z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "read img buf failed: " + localNumberFormatException.getMessage());
        return null;
      }
      paramString = (String)localObject;
    }
  }

  public final String gR(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return null;
    String str1 = "";
    Object localObject = paramString.trim();
    String str2;
    if (((String)localObject).startsWith("THUMBNAIL://"))
      str2 = ((String)localObject).substring(12);
    while (true)
    {
      try
      {
        String str3 = dT(Integer.valueOf(str2).intValue()).xO();
        localObject = str3;
        return f((String)localObject, str1, "");
      }
      catch (NumberFormatException localNumberFormatException)
      {
        z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "read img buf failed: " + localNumberFormatException.getMessage());
        return null;
      }
      if (((String)localObject).startsWith("THUMBNAIL_DIRPATH://"))
      {
        localObject = ((String)localObject).substring(23);
        str1 = "th_";
      }
    }
  }

  public final String gS(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return null;
    Object localObject = paramString.trim();
    if (((String)localObject).startsWith("THUMBNAIL://"))
      str1 = ((String)localObject).substring(12);
    while (!((String)localObject).startsWith("THUMBNAIL_DIRPATH://"))
      try
      {
        String str1;
        String str2 = dT(Integer.valueOf(str1).intValue()).xO();
        localObject = str2;
        return f((String)localObject, "", "");
      }
      catch (NumberFormatException localNumberFormatException)
      {
        z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "read img buf failed: " + localNumberFormatException.getMessage());
        return null;
      }
    return f(((String)localObject).substring(20).substring(3), "th_", "");
  }

  public final l h(ar paramar)
  {
    l locall = T(paramar.kk());
    if (locall.xM() == 0L)
    {
      locall = S(paramar.kl());
      if (locall.xM() == 0L)
      {
        z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "deleteByMsg can't find correspond imgInfo");
        locall = null;
      }
    }
    return locall;
  }

  public final void i(ar paramar)
  {
    l locall1 = h(paramar);
    if ((locall1 == null) || (locall1.xM() == 0L))
      z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "deleteByMsg can't find correspond imgInfo");
    do
    {
      return;
      com.tencent.mm.a.c.deleteFile(f(locall1.xN(), "", ""));
      com.tencent.mm.a.c.deleteFile(f(locall1.xO(), "", ""));
      com.tencent.mm.a.c.deleteFile(f(locall1.xO(), "", "") + "hd");
      h localh1 = this.dmb;
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = locall1.xM();
      localh1.delete("ImgInfo2", "id=?", arrayOfString1);
    }
    while (!locall1.xR());
    l locall2 = dT(locall1.xP());
    com.tencent.mm.a.c.deleteFile(f(locall2.xN(), "", ""));
    com.tencent.mm.a.c.deleteFile(f(locall2.xO(), "", ""));
    com.tencent.mm.a.c.deleteFile(f(locall2.xO(), "", "") + "hd");
    h localh2 = this.dmb;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = locall2.xM();
    localh2.delete("ImgInfo2", "id=?", arrayOfString2);
  }

  public final String t(byte[] paramArrayOfByte)
  {
    if (ch.B(paramArrayOfByte))
    {
      z.e("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "save dir thumb error, thumbBuf is null");
      return null;
    }
    String str1 = com.tencent.mm.a.f.d(ch.CM().getBytes());
    String str2 = f(str1, "th_", "");
    z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "saveDirThumb, fullPath = " + str2);
    com.tencent.mm.a.c.deleteFile(str2);
    com.tencent.mm.a.c.a(str2, paramArrayOfByte);
    return "THUMBNAIL_DIRPATH://th_" + str1;
  }

  public final void xU()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ch.aHN();
    z.i("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "clearCacheMap stack:%s", arrayOfObject);
    d locald = this.dxr;
    new p(this);
    locald.hk();
  }

  public final List xV()
  {
    String str1 = "select * " + " FROM ImgInfo2";
    String str2 = str1 + " WHERE iscomplete= 0 AND totalLen != 0 ";
    Cursor localCursor = this.dmb.rawQuery(str2, null);
    int i = localCursor.getCount();
    z.d("!32@/B4Tb64lLpJ+Bo2xAmIx3SdU4aHz6y+k", "getUnfinishInfo resCount:" + i);
    if (i == 0)
    {
      localCursor.close();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int j = 0;
    if (j < i)
    {
      localCursor.moveToPosition(j);
      l locall1 = new l();
      locall1.b(localCursor);
      l locall2 = dU((int)locall1.xM());
      if (locall2 != null)
        if ((locall2.kl() != 0L) || (locall2.xL() != 0L))
          localArrayList.add(locall1);
      while (true)
      {
        j++;
        break;
        if ((locall1.kl() != 0L) || (locall1.xL() != 0L))
          localArrayList.add(locall1);
      }
    }
    localCursor.close();
    return localArrayList;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.n
 * JD-Core Version:    0.6.2
 */