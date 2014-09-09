package com.tencent.mm.pluginsdk.ui.tools;

import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.Menu;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout;
import com.tencent.mm.pluginsdk.ui.bl;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.tools.bs;
import com.tencent.mm.ui.tools.fj;

public final class be extends fj
{
  private VoiceSearchLayout gon;
  private int hMA;
  private bg hMB;
  private bl hMC = new bf(this);
  private boolean hMy = true;
  private int hMz;

  public be()
  {
  }

  public be(byte paramByte)
  {
    super(true, true);
  }

  public final void a(FragmentActivity paramFragmentActivity, Menu paramMenu)
  {
    super.a(paramFragmentActivity, paramMenu);
    if (this.gon != null)
      this.gon.a(this.hMC);
  }

  public final void a(bg parambg)
  {
    this.hMB = parambg;
    a(parambg);
  }

  protected final boolean aFh()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(this.hMy);
    VoiceSearchLayout localVoiceSearchLayout = this.gon;
    boolean bool = false;
    if (localVoiceSearchLayout == null)
      bool = true;
    arrayOfObject[1] = Boolean.valueOf(bool);
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSIxOnXE6bSAHMOhyEEusEOY=", "check has voice search, Enable %B, layout is null ? %B", arrayOfObject);
    return this.hMy;
  }

  protected final void aFi()
  {
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSIxOnXE6bSAHMOhyEEusEOY=", "do require voice search");
    if (this.jUy != null)
    {
      this.jUy.fY(false);
      this.jUy.fZ(false);
    }
    if ((this.gon != null) && (this.gon.getVisibility() == 8))
    {
      z.d("!44@/B4Tb64lLpKCGRi+LcyHSIxOnXE6bSAHMOhyEEusEOY=", "do voice search layout start");
      this.gon.mv(this.hMA);
    }
  }

  protected final void aFj()
  {
    cancel();
  }

  public final void cancel()
  {
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSIxOnXE6bSAHMOhyEEusEOY=", "do cancel");
    if (this.gon != null)
      this.gon.aAA();
    if (this.jUy != null)
    {
      this.jUy.fY(true);
      this.jUy.fZ(true);
    }
  }

  public final void dZ(boolean paramBoolean)
  {
    this.hMy = paramBoolean;
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (4 == paramInt)
    {
      if ((this.gon != null) && (this.gon.getVisibility() == 0));
      for (boolean bool = true; ; bool = false)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Boolean.valueOf(bool);
        z.d("!44@/B4Tb64lLpKCGRi+LcyHSIxOnXE6bSAHMOhyEEusEOY=", "on back key down, try hide voice search panel, it is visiable[%B]", arrayOfObject);
        cancel();
        if (!bool)
          break;
        return true;
      }
    }
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSIxOnXE6bSAHMOhyEEusEOY=", "not match key code, pass to super");
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public final void onPause()
  {
    baN();
    cancel();
  }

  public final void r(VoiceSearchLayout paramVoiceSearchLayout)
  {
    this.gon = paramVoiceSearchLayout;
    this.hMA = 1;
    if (1 == this.hMA)
    {
      this.hMz = 2;
      return;
    }
    this.hMz = 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.be
 * JD-Core Version:    0.6.2
 */