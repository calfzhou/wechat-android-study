package com.tencent.mm.ui.tools;

import android.graphics.Bitmap;
import android.support.v4.view.bz;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.widget.ImageView;
import com.tencent.mm.a.d;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

final class cm
  implements bz
{
  private bp dqZ = new bp(1, "chatting-image-gallery-lazy-loader");
  private int eXD = -1;
  private SparseArray eXq = new SparseArray();
  private HashMap eXr = new HashMap();
  private SparseArray eXs = new SparseArray();
  private SparseArray eXt = new SparseArray();
  protected d eXu = new d(5, new co(this));
  protected SparseIntArray eXv = new SparseIntArray();
  private LinkedList eXw = new LinkedList();
  private boolean eXz = false;
  private int es = 0;
  private cu jRK;
  protected d jRL = new d(40, new cn(this));
  private LinkedList jRM = new LinkedList();
  private com.tencent.mm.sdk.platformtools.cm jzh = new com.tencent.mm.sdk.platformtools.cm();

  public cm(cu paramcu)
  {
    this.jRK = paramcu;
  }

  private void Lt()
  {
    if (this.eXz);
    String str;
    do
    {
      do
        return;
      while (this.eXw.size() == 0);
      str = (String)this.eXw.removeLast();
    }
    while (!this.eXr.containsKey(str));
    this.eXz = true;
    ct localct = new ct(this, str);
    this.dqZ.c(localct);
  }

  private boolean TK()
  {
    return this.es == 0;
  }

  private void b(int paramInt, Bitmap paramBitmap)
  {
    if (this.eXq.get(paramInt) == null)
      return;
    ImageView localImageView = (ImageView)((WeakReference)this.eXq.get(paramInt)).get();
    this.eXs.get(paramInt);
    this.jRK.c(localImageView, paramBitmap);
    hN(paramInt);
  }

  private void hN(int paramInt)
  {
    if (this.eXs.get(paramInt) != null)
    {
      String str = (String)this.eXs.get(paramInt);
      this.eXq.remove(paramInt);
      this.eXs.remove(paramInt);
      this.eXr.remove(str);
      this.eXt.remove(paramInt);
    }
  }

  private void hO(int paramInt)
  {
    if (this.jRL.T(Integer.valueOf(paramInt)))
      return;
    bg.qQ().a(new cr(this, paramInt), 300L);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final boolean b(ImageView paramImageView, int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.i("!44@/B4Tb64lLpJSmuQVFTi9B6QdAPUqkDaT/sMIXOVKzm0=", "loadThumb position %s", arrayOfObject);
    Bitmap localBitmap = (Bitmap)this.jRL.get(Integer.valueOf(paramInt));
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      this.jRK.c(paramImageView, localBitmap);
      return true;
    }
    return false;
  }

  public final void detach()
  {
    this.jRK = null;
    this.eXq.clear();
    this.eXt.clear();
    this.eXs.clear();
    this.eXr.clear();
    d locald1 = this.jRL;
    new cp(this);
    locald1.hk();
    d locald2 = this.eXu;
    new cq(this);
    locald2.hk();
  }

  public final void h(int paramInt)
  {
    if (!((ck)this.jRK).jOZ.jQL.jQW)
      return;
    if (this.eXD == -1)
    {
      int i = 0;
      if (i == 0)
        hO(paramInt);
      while (true)
      {
        i++;
        break;
        if ((paramInt + i > paramInt + 3) && (paramInt - i < Math.max(paramInt - 3, 0)))
          break label125;
        if (paramInt + i <= paramInt + 3)
          hO(paramInt + i);
        if (paramInt - i >= Math.max(paramInt - 3, 0))
          hO(paramInt - i);
      }
    }
    if (this.eXD > paramInt)
      hO(Math.max(paramInt - 3, 0));
    while (true)
    {
      label125: this.eXD = paramInt;
      return;
      if (this.eXD < paramInt)
        hO(paramInt + 3);
    }
  }

  public final void i(int paramInt)
  {
    this.es = paramInt;
    if (TK())
    {
      int[] arrayOfInt = new int[this.eXt.size()];
      int k;
      for (int i = 0; ; i++)
      {
        int j = arrayOfInt.length;
        k = 0;
        if (i >= j)
          break;
        arrayOfInt[i] = this.eXt.keyAt(i);
      }
      while (k < arrayOfInt.length)
      {
        int m = arrayOfInt[k];
        b(m, (Bitmap)this.eXt.get(m));
        k++;
      }
    }
  }

  public final void i(ImageView paramImageView, String paramString)
  {
    if (this.eXw.contains(paramString))
      return;
    int i = paramImageView.hashCode();
    hN(i);
    this.eXr.put(paramString, Integer.valueOf(i));
    this.eXs.put(i, paramString);
    this.eXq.put(i, new WeakReference(paramImageView));
    this.eXw.add(paramString);
    Lt();
  }

  public final void v(Map paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Bitmap localBitmap = (Bitmap)paramMap.get(str);
      if (localBitmap != null)
      {
        this.eXu.put(str, localBitmap);
        this.jRM.push(Integer.valueOf(localBitmap.hashCode()));
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = str;
        arrayOfObject[1] = Integer.valueOf(localBitmap.hashCode());
        z.i("!44@/B4Tb64lLpJSmuQVFTi9B6QdAPUqkDaT/sMIXOVKzm0=", "we got one cache from preload : %s %s", arrayOfObject);
      }
      else
      {
        z.e("!44@/B4Tb64lLpJSmuQVFTi9B6QdAPUqkDaT/sMIXOVKzm0=", "we got one null cache from preload");
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.cm
 * JD-Core Version:    0.6.2
 */