package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ar;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.cu;

public abstract class SetPwdUI extends MMActivity
  implements m
{
  public String dQm = null;
  private ProgressDialog dWT = null;
  private String iSx;
  private String iSy;

  protected ProgressDialog a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return com.tencent.mm.ui.base.e.a(paramContext, paramString2, true, paramOnCancelListener);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() != aQI());
    do
    {
      return;
      if (this.dWT != null)
      {
        this.dWT.dismiss();
        this.dWT = null;
      }
      if ((paramx.getType() == 383) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        bg.qW().oQ().set(3, ch.je(this.iSx));
        bg.qW().oQ().set(19, ch.jf(this.iSx));
        setResult(-1);
      }
    }
    while (k(paramInt1, paramInt2, paramString));
    int i = n.bLi;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    Toast.makeText(this, getString(i, arrayOfObject), 0).show();
  }

  protected abstract String aQG();

  protected abstract String aQH();

  protected int aQI()
  {
    return 383;
  }

  protected x bE(String paramString1, String paramString2)
  {
    return new ar(paramString1, paramString2);
  }

  protected final boolean j(int paramInt1, int paramInt2, String paramString)
  {
    return a.dWp.a(aPI(), paramInt1, paramInt2, paramString);
  }

  protected abstract boolean k(int paramInt1, int paramInt2, String paramString);

  public void onCreate(Bundle paramBundle)
  {
    bg.qX().a(aQI(), this);
    super.onCreate(paramBundle);
    this.dQm = getIntent().getStringExtra("setpwd_ticket");
    a(0, getString(n.btB), new jp(this), cu.iMA);
    a(new jr(this));
  }

  public void onDestroy()
  {
    bg.qX().b(aQI(), this);
    super.onDestroy();
  }

  protected abstract void pe(int paramInt);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.SetPwdUI
 * JD-Core Version:    0.6.2
 */