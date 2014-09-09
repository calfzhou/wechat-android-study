package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.ao;
import com.tencent.mm.modelfriend.ay;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.fj;

public class QQFriendUI extends MMActivity
  implements com.tencent.mm.o.m
{
  private ListView dWQ;
  private ProgressDialog dWT = null;
  private String dWU;
  private fj fqB;
  private boolean fsF = false;
  private TextView iOn = null;
  private int iX;
  private br jJd;

  protected final void DP()
  {
    this.dWQ = ((ListView)findViewById(i.aIN));
    this.iOn = ((TextView)findViewById(i.arz));
    this.iOn.setText(n.bVZ);
    this.fqB = new fj(true, true);
    this.fqB.a(new bx(this));
    a(this.fqB);
    this.jJd = new br(this, this.iX);
    this.jJd.a(new by(this));
    this.dWQ.setAdapter(this.jJd);
    this.dWQ.setOnItemClickListener(new bz(this));
    az.xe().a(this.jJd);
    a(new ca(this));
    new cb(this);
  }

  public final void DQ()
  {
    if (this.jJd != null)
      this.jJd.jI(this.dWU);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!32@/B4Tb64lLpJnI9lwkJyeeJlu39awCBY0", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (((ao)paramx).wy() != 1)
      return;
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.jJd.DW();
      return;
    }
    Toast.makeText(this, n.bVS, 0).show();
  }

  protected final int getLayoutId()
  {
    return k.bkE;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    z.d("!32@/B4Tb64lLpJnI9lwkJyeeJlu39awCBY0", "onConfigurationChanged: orientation = " + paramConfiguration.orientation);
    super.onConfigurationChanged(paramConfiguration);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bg.qX().a(143, this);
    String str = getIntent().getStringExtra("qqgroup_name");
    this.iX = getIntent().getIntExtra("qqgroup_id", -1);
    if (aa.dw(this.iX))
    {
      ao localao = new ao(1, this.iX);
      bg.qX().d(localao);
      ActionBarActivity localActionBarActivity = aPI();
      getString(n.buo);
      this.dWT = com.tencent.mm.ui.base.e.a(localActionBarActivity, getString(n.bVT), true, new bw(this, localao));
    }
    Bt(str);
    DP();
  }

  public void onDestroy()
  {
    az.xe().b(this.jJd);
    bg.qX().b(143, this);
    this.jJd.closeCursor();
    af.sL().cancel();
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    z.v("!32@/B4Tb64lLpJnI9lwkJyeeJlu39awCBY0", "qq friend onKeyDown");
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    af.sh().e(this.jJd);
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    af.sh().d(this.jJd);
    this.jJd.notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.QQFriendUI
 * JD-Core Version:    0.6.2
 */