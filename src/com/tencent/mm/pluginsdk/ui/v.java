package com.tencent.mm.pluginsdk.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.n.m;
import com.tencent.mm.n.s;
import com.tencent.mm.o;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.base.en;

public final class v
{
  private static final Drawable hyA = new ColorDrawable();
  private Activity cHB;
  private GetHdHeadImageGalleryView hyB;
  private int hyC;
  private s hyD;
  private String hyw = null;
  private String hyx = null;
  private z hyy;
  private cn hyz;
  private String username;

  public v(Activity paramActivity, String paramString)
  {
    this(paramActivity, paramString, null);
  }

  public v(Activity paramActivity, String paramString1, String paramString2)
  {
    this(paramActivity, paramString1, paramString2, y.hyH);
  }

  public v(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    this(paramActivity, paramString1, paramString2, paramInt, (byte)0);
  }

  private v(Activity paramActivity, String paramString1, String paramString2, int paramInt, byte paramByte)
  {
    this.cHB = paramActivity;
    this.username = paramString1;
    this.hyx = paramString2;
    this.hyy = null;
    this.hyC = paramInt;
  }

  private void a(Bitmap paramBitmap, String paramString)
  {
    while (true)
    {
      try
      {
        if (paramBitmap.getWidth() < 480)
        {
          float f = 480 / paramBitmap.getWidth();
          Matrix localMatrix = new Matrix();
          localMatrix.postScale(f, f);
          localBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
          Object[] arrayOfObject = new Object[4];
          arrayOfObject[0] = Integer.valueOf(paramBitmap.getWidth());
          arrayOfObject[1] = Integer.valueOf(paramBitmap.getHeight());
          arrayOfObject[2] = Integer.valueOf(localBitmap.getWidth());
          arrayOfObject[3] = Integer.valueOf(localBitmap.getHeight());
          com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJVNeQZm2lJBnzQojVcN8Km", "dkhdbm old[%d %d] new[%d %d]", arrayOfObject);
          this.hyB.l(localBitmap);
          this.hyB.vn(paramString);
          return;
        }
      }
      catch (Exception localException)
      {
        return;
      }
      Bitmap localBitmap = paramBitmap;
    }
  }

  public final void aAf()
  {
    View localView = LayoutInflater.from(this.cHB).inflate(k.bgv, null);
    this.hyz = new cn(localView, -1, -1);
    switch (x.hyG[(-1 + this.hyC)])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      this.hyz.setFocusable(true);
      this.hyz.setOutsideTouchable(true);
      this.hyz.setBackgroundDrawable(hyA);
      this.hyz.showAtLocation(this.cHB.getWindow().getDecorView(), 49, 0, 0);
      this.hyB = ((GetHdHeadImageGalleryView)localView.findViewById(i.auH));
      this.hyB.a(this.hyz);
      this.hyB.setUsername(this.username);
      if (bg.qW().isSDCardAvailable())
        break;
      en.cp(this.cHB);
      a(af.sh().x(this.cHB), null);
      return;
      this.hyz.setAnimationStyle(o.cuw);
      continue;
      this.hyz.setAnimationStyle(o.cux);
      continue;
      this.hyz.setAnimationStyle(o.cuv);
    }
    Bitmap localBitmap1;
    if (!ch.jb(this.hyx))
    {
      localBitmap1 = com.tencent.mm.q.v.b(this.username, this.hyx, h.Xu);
      if (localBitmap1 == null)
        localBitmap1 = BitmapFactory.decodeResource(this.cHB.getResources(), h.Ut);
      if ((localBitmap1 == null) || (localBitmap1.isRecycled()))
        break label402;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.username;
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJVNeQZm2lJBnzQojVcN8Km", "The avatar of %s is in the cache", arrayOfObject3);
      this.hyB.setThumbImage(localBitmap1);
    }
    while (true)
    {
      if (!ch.jb(this.hyw))
        this.username = this.hyw;
      Bitmap localBitmap2 = af.sh().eV(this.username);
      if ((localBitmap2 == null) || (localBitmap2.isRecycled()))
        break label426;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.username;
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJVNeQZm2lJBnzQojVcN8Km", "The HDAvatar of %s is already exists", arrayOfObject2);
      a(localBitmap2, af.sh().g(this.username, true));
      return;
      localBitmap1 = c.a(this.username, true, -1);
      break;
      label402: Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.username;
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJVNeQZm2lJBnzQojVcN8Km", "The avatar of %s is not in the cache, use default avatar", arrayOfObject1);
    }
    label426: this.hyD = new s();
    this.hyD.a(this.username, new w(this, localBitmap1));
  }

  public final void dismiss()
  {
    if (this.hyz != null)
      this.hyz.dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.v
 * JD-Core Version:    0.6.2
 */