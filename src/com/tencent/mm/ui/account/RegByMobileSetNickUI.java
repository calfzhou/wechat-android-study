package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bn;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.bindqq.BindQQUI;

@Deprecated
public class RegByMobileSetNickUI extends MMActivity
  implements m
{
  private String cTZ;
  private ProgressDialog dWT = null;
  private EditText iQW;
  private ej iQX = null;
  private boolean iQY;

  protected final void DP()
  {
    oP(n.bYH);
    this.iQW = ((EditText)findViewById(i.aLF));
    this.iQW.addTextChangedListener(new com.tencent.mm.ui.widget.d(this.iQW, null, 16));
    a(0, getString(n.btB), new gp(this));
    a(new gr(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!44@/B4Tb64lLpLrFBPJPItazQQ6fS8ROXwVdAHv8sgO1Cs=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (!ch.S(this));
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        int k = com.tencent.mm.model.x.pK();
        z.d("!44@/B4Tb64lLpLrFBPJPItazQQ6fS8ROXwVdAHv8sgO1Cs=", "Reg By mobile status = " + k + " isSync = " + this.iQY);
        int m;
        if (this.iQY)
        {
          m = k & 0xFFFDFFFF;
          aa.vY();
          getApplicationContext();
          com.tencent.mm.modelfriend.c.vp();
          z.d("!44@/B4Tb64lLpLrFBPJPItazQQ6fS8ROXwVdAHv8sgO1Cs=", "Reg By mobile update = " + m);
          bg.qW().oQ().set(7, Integer.valueOf(m));
          if (this.iQY)
            break label301;
        }
        Intent localIntent;
        label301: for (int n = 1; ; n = 2)
        {
          bg.qW().oS().a(new bn(17, n));
          a.dWp.hT();
          bf.dkH.y("login_user_name", this.cTZ);
          localIntent = a.dWo.k(this);
          localIntent.putExtra("LauncherUI.enter_from_reg", true);
          localIntent.addFlags(67108864);
          if (!((ae)paramx).zz())
            break label307;
          MMWizardActivity.b(this, new Intent(this, BindQQUI.class).putExtra("bindqq_regbymobile", 1), localIntent);
          return;
          m = k | 0x20000;
          break;
        }
        label307: MMWizardActivity.b(this, new Intent(this, BindFacebookUI.class), localIntent);
        return;
      }
      int i;
      if (a.dWp.a(aPI(), paramInt1, paramInt2, paramString))
        i = 1;
      while (i == 0)
      {
        int j = n.bKW;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(paramInt1);
        arrayOfObject[1] = Integer.valueOf(paramInt2);
        Toast.makeText(this, getString(j, arrayOfObject), 0).show();
        return;
        switch (paramInt1)
        {
        default:
        case 4:
        }
        do
        {
          i = 0;
          break;
          if ((paramInt2 == -7) || (paramInt2 == -10))
          {
            com.tencent.mm.ui.base.e.b(this, n.bXU, n.bXV);
            i = 1;
            break;
          }
        }
        while (paramInt2 != -75);
        com.tencent.mm.ui.base.e.b(this, n.bsD, n.bXV);
        i = 1;
      }
    }
  }

  protected final int getLayoutId()
  {
    return k.blD;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iQY = getIntent().getBooleanExtra("is_sync_addr", false);
    this.cTZ = getIntent().getExtras().getString("bindmcontact_mobile");
    DP();
    bg.qX().a(126, this);
  }

  public void onDestroy()
  {
    if (this.iQX != null)
      this.iQX.cancel();
    bg.qX().b(126, this);
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.RegByMobileSetNickUI
 * JD-Core Version:    0.6.2
 */