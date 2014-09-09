package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import android.widget.ImageView;
import com.tencent.mm.platformtools.q;
import com.tencent.mm.platformtools.s;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;

public class ag
{
  private byte[] dcy = new byte[0];
  private ao hLA;
  private ao hLB;
  private boolean hLC = true;
  private t hLD = new am(this);
  private volatile boolean hLt = false;
  private HandlerThread hLu = new HandlerThread("ImageEngine-" + System.currentTimeMillis(), 1);
  private cm hLv;
  private HashMap hLw = new HashMap();
  private HashMap hLx = new HashMap();
  private ar hLy;
  private SparseArray hLz;
  private cm jzh;

  public ag(int paramInt)
  {
    this.hLu.start();
    this.hLv = new cm(this.hLu.getLooper());
    this.jzh = new cm(Looper.getMainLooper());
    this.hLA = new ah(this, this.hLu.getLooper());
    this.hLB = new ai(this, Looper.getMainLooper());
    this.hLz = new SparseArray();
    this.hLy = new aj(this, paramInt);
    s.b(this.hLD);
  }

  private void a(ImageView paramImageView, int paramInt)
  {
    if (paramInt == 0)
    {
      at.b(paramImageView, null);
      return;
    }
    Bitmap localBitmap = (Bitmap)this.hLz.get(paramInt);
    if (localBitmap == null)
    {
      localBitmap = BitmapFactory.decodeResource(paramImageView.getResources(), paramInt);
      this.hLz.put(paramInt, localBitmap);
    }
    at.b(paramImageView, localBitmap);
  }

  private static String d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    return ch.Y(paramString1, "null") + "_" + ch.Y(paramString2, "null") + "_" + paramInt1 + "_" + paramInt2;
  }

  public final void RF()
  {
    z.d("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "do destory");
    this.hLt = true;
    this.hLu.quit();
    s.c(this.hLD);
    SparseArray localSparseArray = this.hLz;
    ar localar = this.hLy;
    this.hLz = new SparseArray();
    this.hLy = new ak(this);
    new al(this, "image-engine-destory-thread-" + System.currentTimeMillis(), localSparseArray, localar).start();
  }

  public final void a(ImageView paramImageView, String[] paramArrayOfString, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!this.hLC)
      return;
    if (this.hLt)
    {
      z.w("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "on attach, isQuit, return");
      return;
    }
    if (paramImageView == null)
    {
      z.w("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "attach from file path fail, imageview is null");
      return;
    }
    if (((paramArrayOfString == null) || (paramArrayOfString.length <= 0)) && (ch.jb(paramString)))
    {
      z.w("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "attach from file path fail, path and url are null or empty");
      a(paramImageView, paramInt1);
      return;
    }
    String str1;
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
      str1 = null;
    String str2;
    while (true)
    {
      str2 = d(str1, paramString, paramInt2, paramInt3);
      synchronized (this.dcy)
      {
        String str3 = (String)this.hLx.get(paramImageView);
        if (str3 != null)
          this.hLw.remove(str3);
        this.hLx.put(paramImageView, str2);
        Bitmap localBitmap1 = (Bitmap)this.hLy.get(str2);
        if ((localBitmap1 != null) && (!localBitmap1.isRecycled()))
        {
          at.b(paramImageView, localBitmap1);
          return;
          str1 = paramArrayOfString[0];
        }
      }
    }
    z.v("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "get first render bmp fail, key[%s]", new Object[] { str2 });
    int i = 0;
    int k;
    if (paramArrayOfString != null)
    {
      int j = paramArrayOfString.length;
      i = 0;
      if (j > 1)
        k = 1;
    }
    while (true)
    {
      int m = paramArrayOfString.length;
      i = 0;
      boolean bool;
      if (k < m)
      {
        String str4 = d(paramArrayOfString[k], paramString, paramInt2, paramInt3);
        Bitmap localBitmap2 = (Bitmap)this.hLy.get(str4);
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = str2;
        if (localBitmap2 != null)
        {
          bool = true;
          label292: arrayOfObject[1] = Boolean.valueOf(bool);
          z.v("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "get next render bmp, key[%s], result[%B]", arrayOfObject);
          if (localBitmap2 == null)
            break label435;
          at.b(paramImageView, localBitmap2);
          i = 1;
        }
      }
      else if (i == 0)
      {
        z.v("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "use default res to render");
        a(paramImageView, paramInt1);
      }
      synchronized (this.dcy)
      {
        this.hLw.put(str2, paramImageView);
        aq localaq = (aq)this.hLB.aFa();
        aq.a(localaq, paramArrayOfString);
        aq.a(localaq, paramString);
        aq.b(localaq, str2);
        aq.a(localaq, paramInt2);
        aq.b(localaq, paramInt3);
        this.hLv.postAtFrontOfQueueV2(localaq);
        return;
        bool = false;
        break label292;
        label435: k++;
      }
    }
  }

  public final void aEY()
  {
    synchronized (this.dcy)
    {
      z.d("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "do clear mark");
      this.hLw.clear();
      this.hLx.clear();
      this.hLw = new HashMap();
      this.hLx = new HashMap();
      return;
    }
  }

  protected q b(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.ag
 * JD-Core Version:    0.6.2
 */