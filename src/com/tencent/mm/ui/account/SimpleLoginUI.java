package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.n;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.plugin.accountsync.a.b;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.e;

public class SimpleLoginUI extends MMWizardActivity
  implements com.tencent.mm.o.m
{
  private String cOh = "";
  private ProgressDialog dWT = null;
  private String fUq;
  private SecurityImage iMR = null;
  private EditText iPS;
  private MMFormInputView iPT;
  private MMFormInputView iPU;
  private Button iPV;
  private EditText iPk;
  private di iPo = new di();
  private String iPp;

  protected final void DP()
  {
    this.iPT = ((MMFormInputView)findViewById(com.tencent.mm.i.aAV));
    this.iPU = ((MMFormInputView)findViewById(com.tencent.mm.i.aBa));
    this.iPS = this.iPT.aRJ();
    this.iPS.requestFocus();
    this.iPk = this.iPU.aRJ();
    this.iPV = ((Button)findViewById(com.tencent.mm.i.aAW));
    findViewById(com.tencent.mm.i.aAY).setVisibility(8);
    View localView = findViewById(com.tencent.mm.i.atn);
    if (localView != null)
      localView.setVisibility(8);
    oP(n.bQo);
    a(new jy(this));
    this.fUq = getIntent().getStringExtra("auth_ticket");
    if (!ch.jb(this.fUq))
    {
      this.iPS.setText(ch.ja(di.aQD()));
      this.iPk.setText(ch.ja(di.aQE()));
      new cm().postDelayed(new jz(this), 500L);
    }
    if (l.iDu)
      a.dWp.f(this);
    this.iPV.setOnClickListener(new ka(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!32@/B4Tb64lLpL46PYMpl/SkTFlMftv8Nwe", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    z.d("!32@/B4Tb64lLpL46PYMpl/SkTFlMftv8Nwe", "Scene Type " + paramx.getType());
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    this.cOh = ((com.tencent.mm.modelsimple.i)paramx).za();
    int i;
    if (paramx.getType() == 380)
    {
      this.iPo.iPN = ((com.tencent.mm.modelsimple.i)paramx).yY();
      this.iPo.iPK = ((com.tencent.mm.modelsimple.i)paramx).wC();
      this.iPo.iPM = ((com.tencent.mm.modelsimple.i)paramx).wB();
      this.iPo.iPL = ((com.tencent.mm.modelsimple.i)paramx).yZ();
      if (paramInt2 == -205)
      {
        this.fUq = ((com.tencent.mm.modelsimple.i)paramx).tR();
        this.iPp = ((com.tencent.mm.modelsimple.i)paramx).zb();
      }
      if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
      {
        i = 1;
        bg.qX().d(new ce(new kf(this)));
      }
    }
    while (true)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        bg.rf();
        f.F(this);
        com.tencent.mm.platformtools.ac.jB(this.iPo.dCF);
        b.a(aPI(), new kg(this));
      }
      while (true)
      {
        return;
        int j;
        if (a.dWp.a(aPI(), paramInt1, paramInt2, paramString))
          j = 1;
        while (j == 0)
        {
          int k = n.bJW;
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = Integer.valueOf(paramInt1);
          arrayOfObject[1] = Integer.valueOf(paramInt2);
          Toast.makeText(this, getString(k, arrayOfObject), 0).show();
          return;
          if (paramInt1 == 4);
          switch (paramInt2)
          {
          default:
            j = 0;
            break;
          case -1:
            if (bg.qX().tw() == 6)
            {
              e.b(this, n.bUe, n.bUd);
              j = 1;
            }
            break;
          case -30:
          case -4:
          case -3:
            e.b(this, n.bFW, n.bQj);
            j = 1;
            break;
          case -9:
            e.b(this, n.bQi, n.bQj);
            j = 1;
            break;
          case -72:
            e.b(aPI(), n.bYU, n.buo);
            j = 1;
            break;
          case -75:
            com.tencent.mm.platformtools.ac.ae(aPI());
            j = 1;
            break;
          case -6:
            if (this.iMR == null)
              this.iMR = com.tencent.mm.ui.applet.m.a(aPI(), n.bZc, this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL, new kc(this), null, new ke(this), this.iPo);
            while (true)
            {
              j = 1;
              break;
              z.d("!32@/B4Tb64lLpL46PYMpl/SkTFlMftv8Nwe", "imgSid:" + this.iPo.iPK + " img len" + this.iPo.iPM.length + " " + com.tencent.mm.compatible.g.k.nL());
              this.iMR.b(this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL);
            }
          case -205:
            di.a(this.iPo);
            Intent localIntent = new Intent();
            localIntent.putExtra("auth_ticket", this.fUq);
            localIntent.putExtra("binded_mobile", this.iPp);
            localIntent.putExtra("from_source", 3);
            a.dWo.f(this, localIntent);
            j = 1;
            break;
          case -140:
            if (!ch.jb(this.cOh))
              com.tencent.mm.platformtools.ac.d(this, paramString, this.cOh);
            j = 1;
            break;
          case -106:
            com.tencent.mm.platformtools.ac.s(this, paramString);
            j = 1;
          }
        }
      }
      i = 0;
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bhk;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.age);
    a.dWp.hY();
    DP();
    bg.qX().a(380, this);
  }

  public void onDestroy()
  {
    bg.qX().b(380, this);
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      cancel();
      aQl();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.fUq = paramIntent.getStringExtra("auth_ticket");
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null)
      this.fUq = localBundle.getString("auth_ticket");
    if (!ch.jb(this.fUq))
    {
      this.iPS.setText(ch.ja(di.aQD()));
      this.iPk.setText(ch.ja(di.aQE()));
      new cm().postDelayed(new jx(this), 500L);
    }
  }

  protected void onPause()
  {
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    super.onPause();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.SimpleLoginUI
 * JD-Core Version:    0.6.2
 */