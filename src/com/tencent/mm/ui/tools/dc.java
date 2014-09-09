package com.tencent.mm.ui.tools;

import android.support.v4.view.bz;
import android.view.View;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;

final class dc
  implements bz
{
  private boolean jSB = false;

  dc(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void h(int paramInt)
  {
    if (ImageGalleryUI.e(this.jSA) == null);
    label273: label279: label349: label359: label370: 
    while (true)
    {
      return;
      View localView = ImageGalleryUI.e(this.jSA).pL(paramInt);
      if (localView == null)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(paramInt);
        z.e("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "onPageSelected the view is null, position = %s ", arrayOfObject2);
      }
      ImageGalleryUI.a(this.jSA, paramInt);
      ar localar;
      int k;
      if (ImageGalleryUI.e(this.jSA) != null)
      {
        ImageGalleryUI.e(this.jSA).jQQ.baA();
        if ((localView != null) && (localView.getTag() != null))
          ((dp)localView.getTag()).jTb.aTf();
        localar = ImageGalleryUI.e(this.jSA).qP(paramInt);
        if (ImageGalleryUI.e(this.jSA) == null)
          break label349;
        l locall1 = ImageGalleryUI.e(this.jSA).a(localar, false);
        ImageGalleryUI.e(this.jSA);
        if (!bt.a(localar, locall1))
          break label279;
        l locall2 = m.a(locall1);
        int i = locall2.sp();
        int j = locall2.getOffset();
        if (i == 0)
          break label273;
        k = -1 + j * 100 / i;
        int m = Math.max(1, k);
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(m);
        arrayOfObject1[1] = Long.valueOf(System.currentTimeMillis());
        z.d("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "jacks loading hd from imgInfo : %d, time: %d", arrayOfObject1);
        this.jSA.rg(m);
      }
      while (true)
      {
        if (ImageGalleryUI.e(this.jSA) == null)
          break label370;
        ImageGalleryUI.e(this.jSA).h(paramInt);
        return;
        k = 0;
        break;
        if (ImageGalleryUI.e(this.jSA).ae(localar))
        {
          this.jSA.bf(false);
        }
        else
        {
          ImageGalleryUI.f(this.jSA);
          this.jSA.bf(true);
          while (true)
          {
            if (localar != null)
              break label359;
            z.e("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "update footer fail, msg is null, position = " + paramInt);
            break;
            z.e("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "[arthurdan.ImageGallery] Notice!!! adapter is null");
          }
          this.jSA.e(paramInt, localar);
        }
      }
    }
  }

  public final void i(int paramInt)
  {
    if (paramInt == 2)
    {
      this.jSB = true;
      ImageGalleryUI.h(this.jSA);
      ImageGalleryUI.i(this.jSA);
    }
    if (paramInt == 0)
    {
      if (this.jSB)
        this.jSA.baw();
      this.jSB = false;
    }
    if (ImageGalleryUI.e(this.jSA) != null)
    {
      bt localbt = ImageGalleryUI.e(this.jSA);
      if (localbt.jQP != null)
        localbt.jQP.i(paramInt);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.dc
 * JD-Core Version:    0.6.2
 */