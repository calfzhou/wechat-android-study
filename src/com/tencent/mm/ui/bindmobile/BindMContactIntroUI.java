package com.tencent.mm.ui.bindmobile;

import android.content.ContentResolver;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.ab;
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.friend.ct;

public class BindMContactIntroUI extends MMWizardActivity
  implements com.tencent.mm.o.m
{
  private String cTZ;
  private cr dWq = null;
  private Button ewr;
  private ct iTE;
  private boolean iTU = false;
  private ImageView iTn;
  private boolean jip = false;
  private TextView jjN;
  private TextView jjO;
  private TextView jjP;
  private TextView jjQ;
  private TextView jjR;
  private Button jjS;
  private Button jjT;
  private Button jjU;
  private Button jjV;
  private ab jjW;
  private String jjX = null;
  private boolean jjY = false;
  private boolean jjZ = false;

  private void afq()
  {
    XF();
    if (this.jjY)
    {
      cancel();
      finish();
      return;
    }
    aQl();
  }

  protected final void DP()
  {
    this.iTU = getIntent().getBooleanExtra("is_bind_for_safe_device", false);
    this.jjY = getIntent().getBooleanExtra("is_bind_for_contact_sync", false);
    this.jip = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.jjW = aa.wb();
    this.iTn = ((ImageView)findViewById(com.tencent.mm.i.aOY));
    this.jjN = ((TextView)findViewById(com.tencent.mm.i.aOU));
    this.jjO = ((TextView)findViewById(com.tencent.mm.i.aOV));
    this.jjP = ((TextView)findViewById(com.tencent.mm.i.aOR));
    this.jjQ = ((TextView)findViewById(com.tencent.mm.i.aOW));
    this.jjR = ((TextView)findViewById(com.tencent.mm.i.aOP));
    this.jjS = ((Button)findViewById(com.tencent.mm.i.aOO));
    this.jjT = ((Button)findViewById(com.tencent.mm.i.aOQ));
    this.ewr = ((Button)findViewById(com.tencent.mm.i.aOS));
    this.jjU = ((Button)findViewById(com.tencent.mm.i.aOT));
    this.jjV = ((Button)findViewById(com.tencent.mm.i.aOX));
    if (this.jjW == ab.dtQ)
    {
      this.iTn.setImageResource(com.tencent.mm.h.WX);
      this.jjN.setVisibility(0);
      this.jjO.setVisibility(0);
      this.jjP.setVisibility(8);
      this.jjQ.setVisibility(8);
      this.jjR.setVisibility(8);
      this.jjS.setVisibility(0);
      this.jjT.setVisibility(8);
      this.ewr.setVisibility(8);
      this.jjU.setVisibility(8);
      this.jjV.setVisibility(8);
      u(1, false);
    }
    if (this.jjW == ab.dtR)
    {
      this.iTn.setImageResource(com.tencent.mm.h.WX);
      this.jjN.setVisibility(8);
      this.jjO.setVisibility(8);
      this.jjP.setVisibility(8);
      this.jjQ.setVisibility(0);
      this.jjR.setVisibility(8);
      this.jjS.setVisibility(8);
      this.jjT.setVisibility(8);
      this.ewr.setVisibility(0);
      this.jjU.setVisibility(8);
      this.jjV.setVisibility(0);
      u(1, false);
    }
    if (this.jjW == ab.dtT)
    {
      this.iTn.setImageResource(com.tencent.mm.h.WW);
      this.jjN.setVisibility(8);
      this.jjO.setVisibility(8);
      this.jjP.setVisibility(0);
      this.jjQ.setVisibility(8);
      this.jjR.setVisibility(0);
      this.jjS.setVisibility(8);
      this.jjT.setVisibility(0);
      this.ewr.setVisibility(8);
      this.jjU.setVisibility(0);
      this.jjV.setVisibility(8);
      this.jjU.setText(getString(com.tencent.mm.n.bwN));
      u(1, true);
    }
    if (this.jjW == ab.dtS)
    {
      this.iTn.setImageResource(com.tencent.mm.h.WW);
      this.jjN.setVisibility(8);
      this.jjO.setVisibility(8);
      this.jjQ.setVisibility(8);
      this.jjR.setVisibility(0);
      this.jjS.setVisibility(8);
      this.jjT.setVisibility(0);
      this.ewr.setVisibility(8);
      this.jjU.setVisibility(0);
      this.jjP.setVisibility(0);
      this.jjV.setVisibility(8);
      u(1, true);
    }
    this.cTZ = ((String)bg.qW().oQ().get(6));
    if ((this.cTZ == null) || (this.cTZ.equals("")))
    {
      this.cTZ = ((String)bg.qW().oQ().get(4097));
      this.jjZ = true;
    }
    TextView localTextView1 = this.jjQ;
    int i = com.tencent.mm.n.bwM;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = this.cTZ;
    localTextView1.setText(getString(i, arrayOfObject1));
    TextView localTextView2 = this.jjR;
    int j = com.tencent.mm.n.bwT;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = this.cTZ;
    localTextView2.setText(getString(j, arrayOfObject2));
    this.jjS.setOnClickListener(new a(this));
    this.jjV.setOnClickListener(new l(this));
    this.jjT.setOnClickListener(new p(this));
    this.ewr.setOnClickListener(new q(this));
    this.jjU.setOnClickListener(new s(this));
    if (getIntent().getBooleanExtra("skip", false))
      a(0, getString(com.tencent.mm.n.btE), new u(this));
    while (true)
    {
      if ((this.jjW == ab.dtT) || (this.jjW == ab.dtS))
      {
        String str = com.tencent.mm.f.e.or().getValue("ShowUnbindPhone");
        int k = 2;
        if (!ch.jb(str))
          k = ch.xy(str);
        if (k != 0)
          a(1, com.tencent.mm.h.WS, new w(this, k));
      }
      return;
      a(new v(this));
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpJ7jzBwffYq6Nl6vsysRADUMgKs8MHn9dQ=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((paramx.getType() == 132) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.dWq != null)
      {
        this.dWq.dismiss();
        this.dWq = null;
      }
      if (((ak)paramx).sg() == 3)
      {
        if ((this.jjX != null) && (this.jjX.length() > 0))
          bg.qW().oQ().set(3, this.jjX);
        com.tencent.mm.modelsimple.f.H(this);
        j(this, new Intent(this, BindMContactStatusUI.class));
      }
    }
    label773: label793: 
    while (true)
    {
      return;
      int i;
      if (com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramString))
        i = 1;
      while (true)
      {
        if (i == 0)
          break label365;
        if (this.dWq == null)
          break;
        this.dWq.dismiss();
        this.dWq = null;
        return;
        switch (paramInt2)
        {
        default:
          i = 0;
          break;
        case -34:
          Toast.makeText(this, com.tencent.mm.n.bwp, 0).show();
          i = 1;
          break;
        case -43:
          Toast.makeText(this, com.tencent.mm.n.bwm, 0).show();
          i = 1;
          break;
        case -214:
          com.tencent.mm.d.a locala = com.tencent.mm.d.a.ct(paramString);
          if (locala != null)
            locala.a(this, null, null);
          i = 1;
          break;
        case -41:
          Toast.makeText(this, com.tencent.mm.n.bwo, 0).show();
          i = 1;
          break;
        case -35:
          Toast.makeText(this, com.tencent.mm.n.bwn, 0).show();
          i = 1;
          break;
        case -36:
          Toast.makeText(this, com.tencent.mm.n.bwr, 0).show();
          i = 1;
        }
      }
      label365: if (paramx.getType() == 254)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.jjX = ((com.tencent.mm.modelsimple.s)paramx).zi();
          ad localad = new ad(2);
          bg.qX().d(localad);
          return;
        }
        if (this.dWq != null)
        {
          this.dWq.dismiss();
          this.dWq = null;
        }
        if (paramInt2 == -81)
          com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.ceR, com.tencent.mm.n.buo, new c(this));
      }
      else if (paramx.getType() == 255)
      {
        if (this.dWq != null)
        {
          this.dWq.dismiss();
          this.dWq = null;
        }
        if (paramInt2 != 0)
          break label773;
        ak localak = new ak(this.cTZ, 3, "", 0, "");
        bg.qX().d(localak);
        ActionBarActivity localActionBarActivity = aPI();
        getString(com.tencent.mm.n.buo);
        this.dWq = com.tencent.mm.ui.base.e.a(localActionBarActivity, getString(com.tencent.mm.n.bwL), true, new i(this, localak));
      }
      while (true)
      {
        label460: if (paramx.getType() != 132)
          break label793;
        if (this.dWq != null)
        {
          this.dWq.dismiss();
          this.dWq = null;
        }
        if (((ak)paramx).sg() != 3)
          break;
        if (paramInt2 != -82)
          break label795;
        com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.ceS, com.tencent.mm.n.buo, new k(this));
        return;
        if (paramInt2 == -82)
        {
          com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.ceS, com.tencent.mm.n.buo, new d(this));
          break label460;
        }
        if (paramInt2 == -83)
        {
          com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.ceP, com.tencent.mm.n.buo, new e(this));
          break label460;
        }
        if (paramInt2 == -84)
        {
          com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.ceQ, com.tencent.mm.n.buo, new f(this));
          break label460;
        }
        if (paramInt2 == -85)
        {
          com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.ceM, com.tencent.mm.n.buo, new g(this));
          break label460;
        }
        if (paramInt2 != -86)
          break label460;
        com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.ceU, com.tencent.mm.n.buo, new h(this));
        break label460;
        com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.ceN, com.tencent.mm.n.buo, new j(this));
      }
    }
    label795: if (paramInt2 == -83)
    {
      com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.ceP, com.tencent.mm.n.buo, new m(this));
      return;
    }
    if (paramInt2 == -84)
    {
      com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.ceQ, com.tencent.mm.n.buo, new n(this));
      return;
    }
    if (paramInt2 == -85)
    {
      com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.ceM, com.tencent.mm.n.buo, new o(this));
      return;
    }
    int j = com.tencent.mm.n.bwI;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    Toast.makeText(this, getString(j, arrayOfObject), 0).show();
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bbH;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    z.d("!44@/B4Tb64lLpJ7jzBwffYq6Nl6vsysRADUMgKs8MHn9dQ=", "state " + aa.wb());
    bg.qX().a(132, this);
    bg.qX().a(255, this);
    bg.qX().a(254, this);
    oP(com.tencent.mm.n.bwE);
  }

  public void onDestroy()
  {
    bg.qX().b(132, this);
    bg.qX().b(255, this);
    bg.qX().b(254, this);
    if (this.iTE != null)
    {
      getContentResolver().unregisterContentObserver(this.iTE);
      this.iTE.recycle();
    }
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      afq();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onResume()
  {
    super.onResume();
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.BindMContactIntroUI
 * JD-Core Version:    0.6.2
 */