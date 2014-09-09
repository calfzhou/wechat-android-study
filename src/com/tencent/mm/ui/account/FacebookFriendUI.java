package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.n.p;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.fj;

@Deprecated
public class FacebookFriendUI extends MMActivity
  implements p, com.tencent.mm.o.m
{
  private ListView dWQ;
  private View dWS;
  private ProgressDialog dWT = null;
  private String dWU;
  private boolean fsF = false;
  private ac iOm;
  private TextView iOn = null;

  private void ab(String paramString1, String paramString2)
  {
    com.tencent.mm.ui.base.e.a(this, paramString2, paramString1, new ai(this), null);
  }

  protected final void DP()
  {
    this.dWQ = ((ListView)findViewById(i.aEE));
    this.iOn = ((TextView)findViewById(i.art));
    this.iOn.setText(n.bGP);
    TextView localTextView = (TextView)findViewById(i.ary);
    localTextView.setText(n.bGN);
    fj localfj = new fj(true, true);
    localfj.a(new af(this));
    a(localfj);
    this.iOm = new ac(this, new aj(this, localTextView));
    this.iOm.a(new ak(this));
    this.dWQ.setAdapter(this.iOm);
    this.dWS = findViewById(i.aEF);
    this.dWQ.setOnItemClickListener(new al(this));
    z.d("!44@/B4Tb64lLpKNEztPnVXezxicj6hS7wJ4fIww47lXshM=", "isBindForFacebookApp:" + com.tencent.mm.model.x.qc());
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
        new ef(locale, new am(this)).aQF();
      }
      com.tencent.mm.modelfriend.an localan = new com.tencent.mm.modelfriend.an();
      localan.wx();
      localay = new ay(new an(this, localan), false);
      if (ch.a((Integer)bg.qW().oQ().get(65829)) > 0)
      {
        bg.qW().oQ().set(65829, Integer.valueOf(1));
        bg.qX().d(localan);
        ActionBarActivity localActionBarActivity = aPI();
        getString(n.buo);
        this.dWT = com.tencent.mm.ui.base.e.a(localActionBarActivity, getString(n.bVT), true, new ao(this, localay, localan));
        a(0, getString(n.bJb), new ap(this));
      }
    }
    while (true)
    {
      a(new ag(this));
      new ah(this);
      return;
      localay.cP(5000L);
      break;
      this.dWQ.setVisibility(8);
      this.dWS.setVisibility(0);
      ((TextView)findViewById(i.aEG)).setText(n.bIW);
      this.dWS.setOnClickListener(new aq(this));
    }
  }

  public final void DQ()
  {
    if (this.iOm != null)
      this.iOm.jI(this.dWU);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!44@/B4Tb64lLpKNEztPnVXezxicj6hS7wJ4fIww47lXshM=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
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
      ab(getString(n.buo), paramString);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.iOm.a(null, null);
      return;
    }
    Toast.makeText(this, n.bSI, 0).show();
  }

  public final void eX(String paramString)
  {
    this.iOm.notifyDataSetChanged();
  }

  protected final int getLayoutId()
  {
    return k.bfw;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.bJa);
    bg.qX().a(32, this);
    DP();
  }

  public void onDestroy()
  {
    bg.qX().b(32, this);
    this.iOm.closeCursor();
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    com.tencent.mm.n.af.sh().e(this);
  }

  protected void onResume()
  {
    super.onResume();
    com.tencent.mm.n.af.sh().d(this);
    this.iOm.notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.FacebookFriendUI
 * JD-Core Version:    0.6.2
 */