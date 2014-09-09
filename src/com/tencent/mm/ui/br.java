package com.tencent.mm.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.s;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bz;
import com.tencent.mm.compatible.g.g;
import com.tencent.mm.k.i;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.tools.k;

public final class br extends s
  implements bz, f
{
  private final ViewPager eES;
  private com.tencent.mm.ui.contact.e iKq;
  private boolean iKr = false;
  private int iKs = 0;

  public br(LauncherUI paramLauncherUI, FragmentActivity paramFragmentActivity, ViewPager paramViewPager)
  {
    super(paramFragmentActivity.o());
    this.eES = paramViewPager;
    this.eES.a(this);
    this.eES.a(this);
    if (g.cp(11))
      this.eES.a(new k());
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Float.valueOf(paramFloat);
    arrayOfObject1[2] = Integer.valueOf(paramInt2);
    z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "on page scrolled position %d, positionOffset %f, positionOffsetPixels %d", arrayOfObject1);
    if (LauncherUI.a(this.iKj) != null)
      LauncherUI.a(this.iKj).b(paramInt1, paramFloat);
    if (0.0F != paramFloat)
    {
      if (this.iKq == null)
        this.iKq = ((com.tencent.mm.ui.contact.e)this.iKj.oI(1));
      this.iKq.fw(false);
      return;
    }
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(paramInt1);
    arrayOfObject2[1] = Integer.valueOf(LauncherUI.v(this.iKj));
    z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "onPageScrolled, position = %d, mLastIndex = %d", arrayOfObject2);
    am.h(new bs(this, paramInt1));
  }

  public final Fragment e(int paramInt)
  {
    return this.iKj.oI(paramInt);
  }

  public final int getCount()
  {
    return 4;
  }

  public final void h(int paramInt)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "on page selected changed to %d", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(this.iKs);
    arrayOfObject2[1] = Integer.valueOf(paramInt);
    z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "reportSwitch clickCount:%d, pos:%d", arrayOfObject2);
    if (this.iKs > 0)
    {
      this.iKs = (-1 + this.iKs);
      switch (paramInt)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      this.iKr = false;
      LauncherUI.a(this.iKj, LauncherUI.w(this.iKj));
      LauncherUI.b(this.iKj, paramInt);
      if (LauncherUI.a(this.iKj) != null)
        LauncherUI.a(this.iKj).oD(paramInt);
      this.iKj.n();
      return;
      n.fTF.q(10957, "1");
      continue;
      n.fTF.q(10957, "2");
      continue;
      n.fTF.q(10957, "3");
      continue;
      n.fTF.q(10957, "4");
      continue;
      switch (paramInt)
      {
      default:
        break;
      case 0:
        n.fTF.q(10957, "5");
        break;
      case 1:
        n.fTF.q(10957, "6");
        break;
      case 2:
        n.fTF.q(10957, "7");
      }
    }
  }

  public final void i(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "onPageScrollStateChanged state %d", arrayOfObject);
    if ((paramInt == 0) && (this.iKq != null))
    {
      this.iKq.fw(true);
      this.iKq = null;
    }
  }

  public final void oE(int paramInt)
  {
    if (paramInt == LauncherUI.w(this.iKj))
    {
      z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "on click same index");
      dz localdz = this.iKj.oI(paramInt);
      if ((localdz instanceof a))
        ((a)localdz).aOi();
    }
    do
    {
      return;
      this.iKr = true;
      this.iKs = (1 + this.iKs);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.iKs);
      z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "onTabClick count:%d", arrayOfObject);
      this.eES.a(paramInt, false);
    }
    while (paramInt != 3);
    i.Ck().K(262145, 266241);
    i.Ck().K(262148, 266241);
    i.Ck().K(262147, 266241);
    i.Ck().K(262149, 266241);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.br
 * JD-Core Version:    0.6.2
 */