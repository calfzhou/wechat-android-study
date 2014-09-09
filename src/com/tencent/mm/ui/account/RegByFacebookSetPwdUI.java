package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.aq;
import com.tencent.mm.n;
import com.tencent.mm.o.x;

public class RegByFacebookSetPwdUI extends SetPwdUI
{
  protected final void DP()
  {
    oP(n.bYB);
  }

  protected final ProgressDialog a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return com.tencent.mm.ui.base.e.a(paramContext, getString(n.bYw), true, paramOnCancelListener);
  }

  protected final String aQG()
  {
    return ((EditText)findViewById(i.aLA)).getText().toString();
  }

  protected final String aQH()
  {
    return ((EditText)findViewById(i.aLz)).getText().toString();
  }

  protected final int aQI()
  {
    return 382;
  }

  protected final x bE(String paramString1, String paramString2)
  {
    return new aq(paramString1);
  }

  protected final int getLayoutId()
  {
    return k.blA;
  }

  protected final boolean k(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      bg.qW().oQ().set(57, Integer.valueOf(0));
      String str = (String)bg.qW().oQ().get(5);
      com.tencent.mm.ui.base.e.a(this, getString(n.bYA, new Object[] { str }), getString(n.bYu), new ew(this));
      return true;
    }
    return j(paramInt1, paramInt2, paramString);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dQm = getIntent().getStringExtra("setpwd_ticket");
    oP(n.bYB);
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  protected final void pe(int paramInt)
  {
    switch (ex.iQm[(paramInt - 1)])
    {
    default:
      return;
    case 1:
      com.tencent.mm.ui.base.e.b(this, n.bYs, n.bYu);
      return;
    case 2:
      com.tencent.mm.ui.base.e.b(this, n.bYt, n.bYu);
      return;
    case 3:
      com.tencent.mm.ui.base.e.b(this, n.cnJ, n.bti);
      return;
    case 4:
    }
    com.tencent.mm.ui.base.e.b(this, n.cnL, n.bti);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.RegByFacebookSetPwdUI
 * JD-Core Version:    0.6.2
 */