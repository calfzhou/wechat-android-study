package com.tencent.mm.plugin.safedevice.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.e;

public class SecurityAccountIntroUI extends MMWizardActivity
  implements m
{
  private String cTZ;
  private ProgressDialog dWT = null;
  private String fUq;
  private boolean fUr = false;
  private Button fUs;
  private String fUt;

  private void afq()
  {
    b.jE(this.fUt);
    cancel();
    aQl();
  }

  protected final void DP()
  {
    oP(n.cbW);
    findViewById(i.aGQ).setOnClickListener(new y(this));
    if (!this.fUr)
    {
      this.fUs = ((Button)findViewById(i.amV));
      this.fUs.setVisibility(0);
      this.fUs.setOnClickListener(new aa(this));
    }
    a(new ab(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if ((this.dWT != null) && (this.dWT.isShowing()))
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!this.fUr);
      for (String str = ((ai)paramx).tR(); ; str = ((ak)paramx).tR())
      {
        z.d("!44@/B4Tb64lLpLCHt2tgayO4+XlFyFQ+G0BHJ5MwErQ6I4=", "duanyi test authTicket_login = " + this.fUq + "duanyi test authTicket_check = " + str);
        Intent localIntent = new Intent(this, SecurityAccountVerifyUI.class);
        localIntent.putExtra("auth_ticket", str);
        localIntent.putExtra("binded_mobile", this.cTZ);
        localIntent.putExtra("re_open_verify", this.fUr);
        localIntent.putExtra("from_source", getIntent().getIntExtra("from_source", 1));
        j(this, localIntent);
        if (getIntent().getIntExtra("from_source", 1) == 3)
          finish();
        return;
      }
    }
    int i;
    switch (paramInt2)
    {
    default:
      i = 0;
    case -57:
    case -1:
    case -34:
    case -41:
    case -74:
    }
    while ((i == 0) && (!a.dWp.a(this, paramInt1, paramInt2, paramString)))
    {
      int j = n.cbT;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      Toast.makeText(this, getString(j, arrayOfObject), 0).show();
      return;
      Toast.makeText(this, n.btk, 0).show();
      i = 1;
      continue;
      Toast.makeText(this, n.bwp, 0).show();
      i = 1;
      continue;
      Toast.makeText(this, n.bwo, 0).show();
      i = 1;
      continue;
      e.a(this, n.bwl, n.buo, null);
      i = 1;
    }
  }

  protected final int getLayoutId()
  {
    return k.bmv;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.fUq = getIntent().getStringExtra("auth_ticket");
    this.cTZ = getIntent().getStringExtra("binded_mobile");
    this.fUr = getIntent().getBooleanExtra("re_open_verify", false);
    z.d("!44@/B4Tb64lLpLCHt2tgayO4+XlFyFQ+G0BHJ5MwErQ6I4=", "authTicket = " + this.fUq);
    this.fUt = b.DL();
    DP();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      afq();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
    bg.qX().b(145, this);
    bg.qX().b(132, this);
    if (!this.fUr)
      b.b(false, bg.qS() + "," + getClass().getName() + ",L600_100," + bg.eg("L600_100") + ",2");
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(145, this);
    bg.qX().a(132, this);
    if (!this.fUr)
    {
      b.b(true, bg.qS() + "," + getClass().getName() + ",L600_100," + bg.eg("L600_100") + ",1");
      b.jD("L600_100");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.SecurityAccountIntroUI
 * JD-Core Version:    0.6.2
 */