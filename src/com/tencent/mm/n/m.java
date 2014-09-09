package com.tencent.mm.n;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.mm.a.c;
import com.tencent.mm.a.f;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.sdk.f.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public final class m
{
  private static int dne = 150;
  private static int dnf = 150;
  static final Map dng;
  private static a dnk = new a(dnf);
  private am dnh = new n(this);
  private Vector dni = new Vector();
  private final p dnj = new o(this);
  private String dnl = "";

  static
  {
    HashMap localHashMap = new HashMap();
    dng = localHashMap;
    localHashMap.put("voipapp", "avatar/default_voip.png");
    dng.put("qqmail", "avatar/default_qqmail.png");
    dng.put("fmessage", "avatar/default_fmessage.png");
    dng.put("qmessage", "avatar/default_qmessage.png");
    dng.put("qqsync", "avatar/default_qqsync.png");
    dng.put("floatbottle", "avatar/default_bottle.png");
    dng.put("lbsapp", "avatar/default_nearby.png");
    dng.put("shakeapp", "avatar/default_shake.png");
    dng.put("medianote", "avatar/default_medianote.png");
    dng.put("qqfriend", "avatar/default_qqfriend.png");
    dng.put("masssendapp", "avatar/default_masssend.png");
    dng.put("feedsapp", "avatar/default_feedsapp.png");
    dng.put("facebookapp", "avatar/default_facebookapp.png");
    dng.put("newsapp", "avatar/default_readerapp.png");
    dng.put("helper_entry", "avatar/default_PluginForContractIcon.png");
    dng.put("voicevoipapp", "avatar/default_voicevoip.png");
    dng.put("voiceinputapp", "avatar/default_voiceinput.png");
    dng.put("officialaccounts", "avatar/default_brand_contact.png");
    dng.put("service_officialaccounts", "avatar/default_servicebrand_contact.png");
    dng.put("googlecontact", "avatar/default_googlecontact.png");
    dng.put("linkedinplugin", "avatar/default_linkedin.png");
  }

  public m(String paramString)
  {
    reset();
    this.dnl = paramString;
    this.dnh.a(this.dnj, null);
  }

  public static void a(Context paramContext, ImageView paramImageView, String paramString)
  {
    z.d("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "want attach avatar from assets, path %s", new Object[] { paramString });
    try
    {
      Bitmap localBitmap1 = i.decodeStream(paramContext.getAssets().open(paramString));
      Bitmap localBitmap2 = Bitmap.createScaledBitmap(localBitmap1, 96, 96, true);
      localBitmap1.recycle();
      paramImageView.setImageBitmap(i.a(localBitmap2, true, 1.0F));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static boolean a(Bitmap paramBitmap)
  {
    return (paramBitmap != null) && (!paramBitmap.isRecycled());
  }

  private boolean a(String paramString, Bitmap paramBitmap, int paramInt)
  {
    if (!a(paramBitmap))
      return false;
    Object localObject;
    if ((paramBitmap.getWidth() == 96) && (paramBitmap.getHeight() == 96))
    {
      localObject = paramBitmap;
      if ((localObject == null) || (localObject == paramBitmap))
        break label146;
      paramBitmap.recycle();
    }
    while (true)
    {
      while (paramInt > 0)
      {
        if (paramInt > 1)
          paramInt = 1;
        localObject = i.a((Bitmap)localObject, true, paramInt, true);
        if (!a((Bitmap)localObject))
        {
          return false;
          try
          {
            Bitmap localBitmap = Bitmap.createScaledBitmap(paramBitmap, 96, 96, true);
            localObject = localBitmap;
          }
          catch (OutOfMemoryError localOutOfMemoryError)
          {
            z.e("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "kevin updateAvatar fail  s% ", new Object[] { paramString });
            if (a(paramBitmap))
              paramBitmap.recycle();
            return false;
          }
        }
      }
      c(paramString, (Bitmap)localObject);
      q.e(g(paramString, false), (Bitmap)localObject);
      return true;
      label146: localObject = paramBitmap;
    }
  }

  private WeakReference c(p paramp)
  {
    Vector localVector = this.dni;
    int i = 0;
    try
    {
      while (i < this.dni.size())
      {
        WeakReference localWeakReference = (WeakReference)this.dni.get(i);
        if (localWeakReference != null)
        {
          p localp = (p)localWeakReference.get();
          if ((localp != null) && (localp.equals(paramp)))
            return localWeakReference;
        }
        i++;
      }
      return null;
    }
    finally
    {
    }
  }

  public static Bitmap eR(String paramString)
  {
    if (ch.jb(paramString));
    Bitmap localBitmap;
    do
    {
      return null;
      localBitmap = dnk.eD(paramString);
    }
    while (localBitmap == null);
    if (localBitmap.isRecycled())
    {
      dnk.remove(paramString);
      return null;
    }
    return localBitmap;
  }

  public static Bitmap eW(String paramString)
  {
    String str = (String)dng.get(paramString);
    try
    {
      af.sI();
      Bitmap localBitmap2 = i.decodeStream(af.getContext().getAssets().open(str));
      localBitmap1 = localBitmap2;
      return i.a(localBitmap1, true, 1.0F, true);
    }
    catch (IOException localIOException)
    {
      while (true)
        Bitmap localBitmap1 = null;
    }
  }

  private static Bitmap p(byte[] paramArrayOfByte)
  {
    Bitmap localBitmap3;
    if (ch.B(paramArrayOfByte))
    {
      localBitmap3 = null;
      return localBitmap3;
    }
    long l1 = ch.CN();
    Bitmap localBitmap1 = i.decodeByteArray(paramArrayOfByte, 96, 96);
    if (localBitmap1 == null)
    {
      z.e("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "updating avatar decode failed");
      return null;
    }
    Bitmap localBitmap2;
    try
    {
      Bitmap localBitmap4 = Bitmap.createScaledBitmap(localBitmap1, 96, 96, true);
      localBitmap2 = localBitmap4;
      if (localBitmap2 == null)
      {
        z.e("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "updating avatar decode failed");
        return null;
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
        localBitmap2 = null;
      if (localBitmap2 == null)
        break label146;
    }
    if (localBitmap1 != localBitmap2)
      localBitmap1.recycle();
    while (true)
    {
      localBitmap3 = i.a(localBitmap2, true, 1.0F, true);
      long l2 = ch.ad(l1);
      if (l2 <= 30L)
        break;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l2);
      z.w("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "update avatar cost=%d", arrayOfObject);
      return localBitmap3;
      label146: localBitmap2 = localBitmap1;
    }
  }

  public static void reset()
  {
    if (dnk == null)
      dnk = new a(dnf);
  }

  public final boolean E(String paramString1, String paramString2)
  {
    while (true)
    {
      int m;
      try
      {
        BitmapFactory.Options localOptions1 = new BitmapFactory.Options();
        localOptions1.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(paramString1, localOptions1);
        int i = localOptions1.outWidth;
        int j = localOptions1.outHeight;
        int k;
        int i2;
        int i3;
        if (j > i)
        {
          m = 96;
          k = i * 96 / j;
          if (96 - k <= 1)
            break label391;
          n = m;
          i1 = 0;
          Object[] arrayOfObject = new Object[5];
          arrayOfObject[0] = Integer.valueOf(i);
          arrayOfObject[1] = Integer.valueOf(j);
          arrayOfObject[2] = Integer.valueOf(k);
          arrayOfObject[3] = Integer.valueOf(n);
          arrayOfObject[4] = Integer.valueOf(i1);
          z.d("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "inJustDecodeBounds old [w:%d h:%d]  new [w:%d h:%d] corner:%d", arrayOfObject);
          BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
          localOptions2.inPreferredConfig = Bitmap.Config.ARGB_8888;
          localOptions2.inSampleSize = Math.max(i / k, j / n);
          i.a(localOptions2);
          Bitmap localBitmap1 = BitmapFactory.decodeFile(paramString1, localOptions2);
          Bitmap localBitmap2 = Bitmap.createBitmap(96, 96, Bitmap.Config.ARGB_8888);
          Canvas localCanvas = new Canvas(localBitmap2);
          Matrix localMatrix = new Matrix();
          i2 = localBitmap1.getWidth();
          i3 = localBitmap1.getHeight();
          if ((i2 <= 96) && (i3 <= 96))
          {
            f2 = 1.0F;
            float f3 = (int)(0.5F + 0.5F * (96.0F - f2 * i2));
            float f4 = (int)(0.5F + 0.5F * (96.0F - f2 * i3));
            localMatrix.setScale(f2, f2);
            localMatrix.postTranslate(f3, f4);
            localCanvas.drawBitmap(localBitmap1, localMatrix, null);
            localBitmap1.recycle();
            return a(paramString2, localBitmap2, i1);
          }
        }
        else
        {
          k = 96;
          m = j * 96 / i;
          if (96 - m <= 1)
            break label391;
          n = m;
          i1 = 0;
          continue;
        }
        float f1 = Math.min(96.0F / i2, 96.0F / i3);
        float f2 = f1;
        continue;
      }
      catch (Exception localException)
      {
        return false;
      }
      label391: int n = m;
      int i1 = 1;
    }
  }

  public final void a(p paramp)
  {
    synchronized (this.dni)
    {
      this.dni.add(new WeakReference(paramp));
      return;
    }
  }

  public final Bitmap b(String paramString, byte[] paramArrayOfByte)
  {
    l locall = new l();
    Bitmap localBitmap = p(paramArrayOfByte);
    long l1 = locall.nM();
    if (!a(localBitmap))
    {
      z.e("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "decode failed: %s", new Object[] { paramString });
      return null;
    }
    long l2 = locall.nM();
    q.e(g(paramString, false), localBitmap);
    long l3 = locall.nM();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Long.valueOf(l1);
    arrayOfObject[2] = Long.valueOf(l2);
    arrayOfObject[3] = Long.valueOf(l3);
    z.d("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "dkavatar save avatar: %s %d %d %d", arrayOfObject);
    return localBitmap;
  }

  public final void b(p paramp)
  {
    synchronized (this.dni)
    {
      this.dni.remove(c(paramp));
      return;
    }
  }

  public final void c(String paramString, Bitmap paramBitmap)
  {
    dnk.b(paramString, paramBitmap);
    this.dnh.ae(paramString);
    this.dnh.Bo();
    z.d("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "setToCache %s", new Object[] { paramString });
  }

  public final boolean c(String paramString, byte[] paramArrayOfByte)
  {
    Bitmap localBitmap = p(paramArrayOfByte);
    if (!a(localBitmap))
    {
      z.e("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "decode failed: %s", new Object[] { paramString });
      return false;
    }
    c(paramString, localBitmap);
    q.e(g(paramString, false), localBitmap);
    return true;
  }

  @Deprecated
  public final void d(p paramp)
  {
    this.dnh.a(paramp, Looper.getMainLooper());
  }

  public final boolean d(String paramString, Bitmap paramBitmap)
  {
    return a(paramString, paramBitmap, 1);
  }

  @Deprecated
  public final void e(p paramp)
  {
    this.dnh.remove(paramp);
  }

  public final boolean eS(String paramString)
  {
    boolean bool1 = q.fa(g(paramString, false));
    boolean bool2 = false;
    if (bool1)
      bool2 = true;
    return bool2;
  }

  public final Bitmap eT(String paramString)
  {
    Bitmap localBitmap = q.F(g(paramString, false), paramString);
    if (a(localBitmap))
      return localBitmap;
    return null;
  }

  final String eU(String paramString)
  {
    return f.d(c.a(g(paramString, true), 0, -1));
  }

  public final Bitmap eV(String paramString)
  {
    z.d("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "getHDBitmap user:%s", new Object[] { paramString });
    if (ch.jb(paramString))
      return null;
    return i.o(g(paramString, true), 480, 480);
  }

  public final String g(String paramString, boolean paramBoolean)
  {
    if (ch.jb(paramString))
      return null;
    String str1 = this.dnl;
    StringBuilder localStringBuilder = new StringBuilder("user_");
    if (paramBoolean);
    for (String str2 = "hd_"; ; str2 = "")
      return com.tencent.mm.sdk.platformtools.o.a(str1, str2, f.d(paramString.getBytes()), ".png", 1);
  }

  public final boolean h(String paramString, boolean paramBoolean)
  {
    String str = g(paramString, paramBoolean);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = str;
    z.d("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "removeavatar: %s, hd: %b, path:%s", arrayOfObject);
    if (!paramBoolean)
    {
      q.fb(str);
      return true;
    }
    c.deleteFile(str);
    return true;
  }

  public final Bitmap x(Context paramContext)
  {
    paramContext.getResources();
    Bitmap localBitmap = eR("I_AM_NO_SDCARD_USER_NAME");
    if ((!a(localBitmap)) && (localBitmap != null))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Boolean.valueOf(localBitmap.isRecycled());
      arrayOfObject[1] = "I_AM_NO_SDCARD_USER_NAME";
      z.i("!32@/B4Tb64lLpJO3ngf+FD8EfYnsqwOArnz", "not cached, recycled=%b, reload=%s", arrayOfObject);
      localBitmap = i.a(localBitmap, true, 1.0F);
      c("I_AM_NO_SDCARD_USER_NAME", localBitmap);
    }
    return localBitmap;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.m
 * JD-Core Version:    0.6.2
 */