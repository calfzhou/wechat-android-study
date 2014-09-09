package com.tencent.mm.plugin.accountsync.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.an;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.ef;
import com.tencent.mm.ui.tools.fj;

public class InviteFacebookFriendsUI extends MMActivity
  implements com.tencent.mm.o.m
{
  private ListView dWQ;
  private r dWR;
  private View dWS;
  private ProgressDialog dWT = null;
  private String dWU;
  private final int dWV = 5;

  private void ab(String paramString1, String paramString2)
  {
    com.tencent.mm.ui.base.e.a(this, paramString2, paramString1, new f(this), null);
  }

  protected final void DP()
  {
    this.dWQ = ((ListView)findViewById(com.tencent.mm.i.aEE));
    TextView localTextView = (TextView)findViewById(com.tencent.mm.i.ary);
    localTextView.setText(com.tencent.mm.n.bGN);
    fj localfj = new fj(true, true);
    localfj.a(new e(this));
    a(localfj);
    this.dWR = new r(this, new g(this, localTextView));
    this.dWQ.setAdapter(this.dWR);
    this.dWS = findViewById(com.tencent.mm.i.aEF);
    this.dWQ.setOnItemClickListener(new h(this));
    z.d("!56@/B4Tb64lLpI1xvkrLEXBhhg96dI0eWcb0x/iHQfmkIg6em4Z80TVkw==", "isBindForFacebookApp:" + com.tencent.mm.model.x.qc());
    an localan;
    ay localay;
    if (com.tencent.mm.model.x.qc())
    {
      this.dWQ.setVisibility(0);
      this.dWS.setVisibility(8);
      long l = ch.a((Long)bg.qW().oQ().get(65831));
      String str = ch.ja((String)bg.qW().oQ().get(65830));
      if ((ch.ac(l) > 86400000L) && (str.length() > 0))
      {
        com.tencent.mm.ui.c.a.e locale = new com.tencent.mm.ui.c.a.e("290293790992170");
        locale.CW(str);
        new ef(locale, new i(this)).aQF();
      }
      localan = new an();
      localan.wx();
      localay = new ay(new j(this, localan), false);
      if (ch.a((Integer)bg.qW().oQ().get(65829)) <= 0)
        break label427;
      bg.qW().oQ().set(65829, Integer.valueOf(1));
      bg.qX().d(localan);
    }
    while (true)
    {
      ActionBarActivity localActionBarActivity = aPI();
      getString(com.tencent.mm.n.buo);
      this.dWT = com.tencent.mm.ui.base.e.a(localActionBarActivity, getString(com.tencent.mm.n.bVT), true, new k(this, localay, localan));
      a(new l(this));
      new m(this);
      a(0, getString(com.tencent.mm.n.bGR), new n(this));
      eC(false);
      return;
      label427: localay.cP(5000L);
    }
  }

  public final void DQ()
  {
    if (this.dWR != null)
      this.dWR.jI(this.dWU);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!56@/B4Tb64lLpI1xvkrLEXBhhg96dI0eWcb0x/iHQfmkIg6em4Z80TVkw==", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramx.getType() != 32)
      return;
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if ((paramInt1 == 4) && (paramInt2 == -68))
    {
      if (ch.jb(paramString))
        paramString = "error";
      ab(getString(com.tencent.mm.n.buo), paramString);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.dWR.a(null, null);
      return;
    }
    Toast.makeText(this, com.tencent.mm.n.bSI, 0).show();
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bfw;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(com.tencent.mm.n.bGU);
    bg.qX().a(32, this);
    DP();
  }

  protected void onDestroy()
  {
    bg.qX().b(32, this);
    this.dWR.closeCursor();
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.InviteFacebookFriendsUI
 * JD-Core Version:    0.6.2
 */